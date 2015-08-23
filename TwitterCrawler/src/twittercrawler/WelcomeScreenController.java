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
import javafx.scene.control.Hyperlink;

/**
 *
 * @author Ale
 */
public class WelcomeScreenController implements Initializable, ControlledScreen {

    @FXML
    private void searchCredentialsButtonAction(ActionEvent event) {
        myController.setScreen(TwitterCrawler.searchCredentialsScreen);
    }

    @FXML
    private void enterCredentialsButtonAction(ActionEvent event) {
        myController.setScreen(TwitterCrawler.loadCredentialsScreen);
    }

    @FXML
    private void hyperLinkAction(ActionEvent event) {
        System.out.println("hyper link to Twitter   was clicked");
    }

    @FXML
    private void exitButtonAction(ActionEvent event) {
        System.out.println("exit button clicked. Exiting System");
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    private ScreensController myController;

    @FXML
    private Button srchCrdntlsBtn;

    @FXML
    private Button entrCrdntlsBtn;

    @FXML
    private Hyperlink hyperLink;

    @FXML
    private Button exitBtn;

}
