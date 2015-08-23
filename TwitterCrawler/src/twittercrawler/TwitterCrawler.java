/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittercrawler;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ale
 */
public class TwitterCrawler extends Application {

    public static String welcomeScreen = "WelcomeScreen";
    public static String welcomeScreenFile = "/FXMLDocuments/WelcomeScreen.fxml";

    public static String searchCredentialsScreen = "CredentialsScreen";
    public static String searchCredentialsScreenFile = "/FXMLDocuments/CredentialsScreen.fxml";

    public static String loadCredentialsScreen = "LoadCredentialsScreen";
    public static String loadCredentialsFile = "/FXMLDocuments/LoadCredentialsScreen.fxml";

    public static String locationScreen = "LocationScreen";
    public static String locationScreenFile = "/FXMLDocuments/LocationScreen.fxml";
//    public static String locationScreen 

    @Override
    public void start(Stage stage) throws Exception {

        ScreensController mainController = new ScreensController();
        mainController.loadScreen(TwitterCrawler.welcomeScreen, TwitterCrawler.welcomeScreenFile);
        mainController.loadScreen(TwitterCrawler.searchCredentialsScreen, TwitterCrawler.searchCredentialsScreenFile);
        mainController.loadScreen(TwitterCrawler.loadCredentialsScreen, TwitterCrawler.loadCredentialsFile);
        mainController.loadScreen(TwitterCrawler.locationScreen, TwitterCrawler.locationScreenFile);
        mainController.setScreen(TwitterCrawler.welcomeScreen);

        Group root = new Group();
        root.getChildren().addAll(mainController);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
