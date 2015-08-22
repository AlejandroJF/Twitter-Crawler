/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.crawler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Ale
 */
public class CredentialsScreen implements Initializable, ControlledScreen {
  
            ScreensController myController;

    
    @FXML
    private Label label;
    @FXML
    private Button btn1;    
    @FXML
    private Button btn2;

    /**
     * Initializes the controller class.
     */
     @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        label.setText("Screen 2");
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    @FXML
    public void goToScreen1(ActionEvent event){
        myController.setScreen(TwitterCrawler.screen1ID);
    }
    @FXML
    public void goToScreen3(ActionEvent event){
        myController.setScreen(TwitterCrawler.screen3ID);
    }
    
}
