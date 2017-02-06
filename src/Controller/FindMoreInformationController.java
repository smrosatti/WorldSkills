/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.BMI;
import Main.BMR;
import Main.FindMoreInformation;
import Main.ListCharities;
import Main.Main;
import Main.PreviousResults;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class FindMoreInformationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btback;

    @FXML
    private Button bthow;

    @FXML
    private Button btms;

    @FXML
    private Button btbmi;

    @FXML
    private Button btraceresults;

    @FXML
    private Button btlistc;

    @FXML
    private Button btbmr;

    private static String hour;

    public static String getHour() {
        return hour;
    }

    public static void setHour(String hour) {
        FindMoreInformationController.hour = hour;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void pr(){
         try {
            PreviousResults tela = new PreviousResults();
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

    public void bmr() {
        try {
            BMR tela = new BMR();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bmi() {
        try {
            BMI tela = new BMI();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listc() {
        try {
            ListCharities tela = new ListCharities(hour);
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecha() {
        FindMoreInformation.getStage().close();
    }

}
