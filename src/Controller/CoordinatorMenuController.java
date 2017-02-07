/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.CoordinatorMenu;
import Main.LoginScreen;
import Main.RunnerManagement;
import Main.SponsorshipOverview;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class CoordinatorMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btback;

    @FXML
    private Button btrunners;

    @FXML
    private Button btlog;

    @FXML
    private Button btsponsor;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          btback.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
          
          btlog.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
          
          btrunners.setOnMouseClicked((MouseEvent evt) -> {
            r();

        });
          
          btsponsor.setOnMouseClicked((MouseEvent evt) -> {
            s();

        });
    }
    
    public void r(){
        try {
            RunnerManagement m = new RunnerManagement();
            m.start(new Stage());
        } catch (IOException ex) {
            Logger.getLogger(CoordinatorMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void s(){
            SponsorshipOverview m = new SponsorshipOverview();
            try {
                m.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(CoordinatorMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void fecha(){
        CoordinatorMenu.getStage().close();
    }

 public void back() {
        try {
            LoginScreen tela = new LoginScreen();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
}
