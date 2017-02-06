/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.LoginChoice;
import Main.LoginScreen;
import Main.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class LoginScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    private PasswordField senha;

    @FXML
    private Button btback;

    @FXML
    private Button btcancel;

    @FXML
    private Button btlogin;

    @FXML
    private TextField email;
    
    private String senhas;
    private String emails;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        buttons();
    }  
    
    public void buttons(){
        btcancel.setOnMouseClicked((MouseEvent evt)->{
            cancel();
        });
        
        btback.setOnMouseClicked((MouseEvent evt)->{
            cancel();
        });
        
        btlogin.setOnMouseClicked((MouseEvent evt)->{
            senhas = senha.getText();
            emails = email.getText();
            login();
        });
        
        
    }
    
    public void cancel(){
        try {
            Main m = new Main();
            m.start(new Stage());
            LoginScreen.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void login(){
        try {
            LoginChoice tela = new LoginChoice(emails, senhas);
            tela.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
