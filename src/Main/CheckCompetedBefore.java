/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.CheckCompetedBeforeController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SARA
 */
public class CheckCompetedBefore extends Application {

    private static Stage stage;
    
    public CheckCompetedBefore (String hours){
        CheckCompetedBeforeController.setHours(hours);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        CheckCompetedBefore.stage = stage;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/CheckRunnerCompeted.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Marathon Skills 2017");
        primaryStage.setScene(scene);
        primaryStage.show();

        CheckCompetedBefore.setStage(primaryStage);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
