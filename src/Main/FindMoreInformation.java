/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.FindMoreInformationController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SARA
 */
public class FindMoreInformation extends Application {
    
     private static Stage stage;

    public static Stage getStage() {
        return stage;
    }
    
    public FindMoreInformation(String h){
        FindMoreInformationController.setHour(h);
    }

    public static void setStage(Stage stage) {
        FindMoreInformation.stage = stage;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/FindMoreInformation.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Marathon Skills 2017 - Find out more information");
        primaryStage.setScene(scene);
        primaryStage.show();

        FindMoreInformation.setStage(primaryStage);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

