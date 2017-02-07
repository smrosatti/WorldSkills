/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.BMI;
import Main.FindMoreInformation;
import Main.Map;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class BMIController implements Initializable {

    /**
     * Initializes the controller class.
     */

    
      @FXML
    private Pane panewoman;

    @FXML
    private Slider slider;

    @FXML
    private Button btback;

    @FXML
    private Button btcancelar;

    @FXML
    private TextField alturatf;

    @FXML
    private TextField pesotf;

    @FXML
    private Label lbbmi;

    @FXML
    private Button btcalcular;

    @FXML
    private Label lbhora;

    @FXML
    private Pane paneman;
    
     private static String h;

    public static String getH() {
        return h;
    }

    public static void setH(String h) {
        BMIController.h = h;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        lbhora.setText(h);
        
        btback.setOnMouseClicked((MouseEvent evt) -> {
            back();
        });
        
        btcalcular.setOnMouseClicked((MouseEvent evt) -> {
            calcular();
        });
        
         btcancelar.setOnMouseClicked((MouseEvent evt) -> {
            back();
        });
//Interpretation of BMI into categories:  < 18.5 Underweight  18.5 - 24.9 Healthy  25 - 29.9 Overweight  > 30 Obese
        
    } 
    
    public void calcular(){
        try {
           int h = Integer.parseInt(alturatf.getText());
           double mh = h/100;
           int w = Integer.parseInt(pesotf.getText());
           double bmi = w / (mh*mh);
           lbbmi.setText(Double.toString(bmi));
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
     
     public void fecha(){
         BMI.getStage().close();
     }
}
