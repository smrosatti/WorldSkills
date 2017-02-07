/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.BMR;
import Main.FindMoreInformation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class BMRController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField alttf;
    
    @FXML
    private Pane panew;
    
     @FXML
    private Pane paneh;

    @FXML
    private Button btback;

    @FXML
    private Label bmrlb;

    @FXML
    private TextField pesotf;

    @FXML
    private Button btcalcular;

    @FXML
    private Button womanpane;

    @FXML
    private Label lbhour;

    @FXML
    private Button btcancel;

    @FXML
    private TextField idtf;

    @FXML
    private Button manpane;

    private int g;
    
    private static String h;

    public static String getH() {
        return h;
    }

    public static void setH(String h) {
        BMRController.h = h;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        lbhour.setText(h);
        
        btback.setOnMouseClicked((MouseEvent evt) -> {
            back();
        });

        manpane.setOnMouseClicked((MouseEvent evt) -> {
            g = 2;
            paneh.setOpacity(25);
        });

        womanpane.setOnMouseClicked((MouseEvent evt) -> {
            g = 1;
            panew.setOpacity(25);
        });

        btcalcular.setOnMouseClicked((MouseEvent evt) -> {
            if (g == 1) {
                calcularm();
            } else if (g == 2) {
                calcularh();
            }
        });

        btcancel.setOnMouseClicked((MouseEvent evt) -> {
            back();
        });
    }

    public void calcularm() {
        //women
        if (pesotf.getText().trim().isEmpty() || alttf.getText().trim().isEmpty() || idtf.getText().trim().isEmpty()) {
            Alert a = new Alert(AlertType.ERROR);
            a.setHeaderText("Preencha todos os campos");
            a.show();
        } else {
            double w = Double.parseDouble(pesotf.getText());
            double h = Double.parseDouble(alttf.getText());
            double id = Double.parseDouble(idtf.getText());
            double bmr = 655 + (9.6 * w) + (1.8 * h) - (4.7 * id);
            bmrlb.setText(Double.toString(bmr));
        }
    }

    public void calcularh() {
        try {
            //Result will be in kilocalories (kcal) per day. (weight in kg, height in cm, age in years)
            //For men: BMR = 66 + (13.7 x weight) + (5 x height) - (6.8 x age)
            //For women: BMR = 655 + (9.6 x weight) + (1.8 x height) - (4.7 x age) 
            //man
            if (pesotf.getText().trim().isEmpty() || alttf.getText().trim().isEmpty() || idtf.getText().trim().isEmpty()) {
                Alert a = new Alert(AlertType.ERROR);
                a.setHeaderText("Preencha todos os campos");
                a.show();
            } else {
                double w = Double.parseDouble(pesotf.getText());
                double h = Double.parseDouble(alttf.getText());
                double id = Double.parseDouble(idtf.getText());
                double bmr = 66 + (13.7 * w) + (5 * h) - (6.8 * id);
                bmrlb.setText(Double.toString(bmr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void back() {
        try {
            FindMoreInformation tela = new FindMoreInformation(h);
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecha() {
        BMR.getStage().close();
    }
}
