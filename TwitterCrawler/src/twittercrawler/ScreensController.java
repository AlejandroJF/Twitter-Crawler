package twittercrawler;

import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author Ale
 */
public class ScreensController extends StackPane {

    private HashMap<String, Node> screens = new HashMap<>();

    public ScreensController() {
        super();
    }

    // add screen to collection

    public void addScreen(String name, Node screen) {
        screens.put(name, screen);
    }

    //returns the node wiht the appropriate colleciton

    public Node getScreen(String name) {
        return screens.get(name);
    }

    //loads the FXML file , add the screen to the screens collection an 
    //inject the screen pane into the controller

    public boolean loadScreen(String name, String resource) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) myLoader.load();
            ControlledScreen myScreenController = ((ControlledScreen) myLoader.getController());
            myScreenController.setScreenParent(this);
            addScreen(name, loadScreen);
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    // this method tries to display the scren with a predefined name
    //First it makes sure the screen had already been loaded, then if there
    // is more than one screen the new screen is added second, and the current screen is removed
    // if there isnt any screen being displayed then the new screen  is just added to the root
    public boolean setScreen(final String name) {
        if (screens.get(name) != null) {// screen loaded
            final DoubleProperty opacity = opacityProperty();

            if (!getChildren().isEmpty()) {// if there is more than one screen
                Timeline fade = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent t) {
                                getChildren().remove(0);            //remove the displayed screen
                                getChildren().add(0, screens.get(name)); // add screen
                                Timeline fadeIn = new Timeline(
                                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                        new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0)));
                                fadeIn.play();
                            }
                        }, new KeyValue(opacity, 0.0)));
                fade.play();
            } else {
                setOpacity(0.0);
                getChildren().add(screens.get(name));   // no one has been displayed , then just show
                Timeline fadeIn = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0)));
                fadeIn.play();
            }
            return true;
        } else {
            System.out.println("System hasnt been loaded yet");
            return false;
        }
    }

    public boolean unoadScreen(String name) {
        if (screens.remove(name) == null) {
            System.out.println("Screen didnt exist");
            return false;
        } else {
            return true;
        }

    }
}
