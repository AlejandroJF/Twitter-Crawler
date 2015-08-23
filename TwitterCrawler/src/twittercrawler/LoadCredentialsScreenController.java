/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittercrawler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Ale
 */
public class LoadCredentialsScreenController implements Initializable, ControlledScreen {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @FXML
    public void homeButtonAction(ActionEvent event){
        myController.setScreen(TwitterCrawler.welcomeScreen);
    }
    @FXML void exitButtonAction(ActionEvent event){
        System.out.println("Exit Button Pressed, Exiting Sytem");
        System.exit(0);
    }
        private ScreensController myController;

    @FXML
    private Button extitBtn;
    @FXML
    private Button homeBtn;
}
