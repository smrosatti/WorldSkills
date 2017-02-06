/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.SponsorchipConfirmationController;
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
public class SponsorchipConfirmation extends Application {
    
    private static Stage stage;
    
    public SponsorchipConfirmation(String r, String a){
        SponsorchipConfirmationController.setRunner(r);
        SponsorchipConfirmationController.setAmount(a);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        SponsorchipConfirmation.stage = stage;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/View/SponsorchipConfirmation.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Marathon Skills 2017 - Sponsorchip confirmation");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        SponsorchipConfirmation.setStage(primaryStage);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
