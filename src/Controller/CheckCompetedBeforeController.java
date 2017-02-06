/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.CheckCompetedBefore;
import Main.LoginScreen;
import Main.Main;
import Main.RegisterARunner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class CheckCompetedBeforeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btback;

    @FXML
    private Button btno;

    @FXML
    private Button btlogin;

    @FXML
    private Button btyes;

    private static String hours;
    
    @FXML
    private Label labelhours;

    public static String getHours() {
        return hours;
    }

    public static void setHours(String hours) {
        CheckCompetedBeforeController.hours = hours;
    }

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        labelhours.setText(hours);
        
        btyes.setOnMouseClicked((MouseEvent evt) -> {
            Login();
        });

        btlogin.setOnMouseClicked((MouseEvent evt) -> {
            Login();

        });

        btno.setOnMouseClicked((MouseEvent evt) -> {
            no();

        });

        btback.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
    }

    public void fecha() {
        try {
            CheckCompetedBefore.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Login() {
        try {
            LoginScreen tela = new LoginScreen();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void no() {
        try {
            RegisterARunner tela = new RegisterARunner();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void back() {
        try {
            Main tela = new Main();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
