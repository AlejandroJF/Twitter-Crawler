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
 *
 * @author Ale
 */
public class WelcomeScreen implements Initializable, ControlledScreen {
    
    ScreensController myController;
    @FXML
    private Label label;
    @FXML
    private Button btn1;    
    @FXML
    private Button btn2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("Screen 1");
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    @FXML
    public void goToScreen2(ActionEvent event){
        myController.setScreen(TwitterCrawler.screen2ID);
    }
    @FXML
    public void goToScreen3(ActionEvent event){
        myController.setScreen(TwitterCrawler.screen3ID);
    }
}
