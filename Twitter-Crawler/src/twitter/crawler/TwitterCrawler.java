/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.crawler;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ale
 */
public class TwitterCrawler extends Application {
    
    public static String screen1ID = "WelcomeScreen";
    public static String screen1File = "WelcomeScreen.fxml";
    public static String screen2ID = "CredentialsScreen";
    public static String screen2File = "CredentialsScreen.fxml";
    public static String screen3ID = "LocationScreen";
    public static String screen3File = "LocationScreen.fxml";    
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        ScreensController mainController =  new ScreensController();
        mainController.loadScreen(TwitterCrawler.screen1ID, TwitterCrawler.screen1File);
        mainController.loadScreen(TwitterCrawler.screen2ID, TwitterCrawler.screen2File);
        mainController.loadScreen(TwitterCrawler.screen3ID, TwitterCrawler.screen3File);
        mainController.setScreen(TwitterCrawler.screen1ID);
        
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
