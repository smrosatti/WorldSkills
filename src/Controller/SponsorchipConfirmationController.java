/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Main;
import Main.SponsorchipConfirmation;
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
 * @author SARA
 */
public class SponsorchipConfirmationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label labelrunner;

    @FXML
    private Button btback2;

    @FXML
    private Label labelamount;

    @FXML
    private Button btback1;
    
    private static String runner;

    private static String amount;
    
     public static String getRunner() {
        return runner;
    }

    public static void setRunner(String runner) {
        SponsorchipConfirmationController.runner = runner;
    }

    public static String getAmount() {
        return amount;
    }

    public static void setAmount(String amount) {
        SponsorchipConfirmationController.amount = amount;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        labelrunner.setText(runner);
        labelamount.setText(amount);
        
          btback1.setOnMouseClicked((MouseEvent evt)->{
            try {
                Main tela = new Main();
                tela.start(new Stage());
                SponsorchipConfirmation.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
          
          btback2.setOnMouseClicked((MouseEvent evt)->{
            try {
                Main tela = new Main();
                tela.start(new Stage());
                SponsorchipConfirmation.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
    }
}
