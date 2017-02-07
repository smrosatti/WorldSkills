/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.AdminMenu;
import Main.LoginScreen;
import Main.ManageCharities;
import Main.UserManagement;
import Main.VolunteerManagement;
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
public class AdminMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btback;

    @FXML
    private Button btlogout;

    @FXML
    private Button btcharities;

    @FXML
    private Button btuser;

    @FXML
    private Button btinventory;

    @FXML
    private Button btvoluteers;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btback.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
        
        btvoluteers.setOnMouseClicked((MouseEvent evt) -> {
            v();

        });
        
        btcharities.setOnMouseClicked((MouseEvent evt) -> {
            c();

        });
        
        btuser.setOnMouseClicked((MouseEvent evt) -> {
            u();

        });
    }  
    
    public void fecha(){
        AdminMenu.getStage().close();
        
    }
    
    public void back(){
          try {
            LoginScreen tela = new LoginScreen();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void c(){
        ManageCharities m = new ManageCharities();
        try {
            m.start(new Stage());
            fecha();
        } catch (Exception ex) {
            Logger.getLogger(AdminMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void u(){
        UserManagement m = new UserManagement();
        try {
            m.start(new Stage());
            fecha();
        } catch (Exception ex) {
            Logger.getLogger(AdminMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void v(){
         VolunteerManagement m = new VolunteerManagement();
        try {
            m.start(new Stage());
            fecha();
        } catch (Exception ex) {
            Logger.getLogger(AdminMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
