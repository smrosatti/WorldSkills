/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Main.AdminMenu;
import Main.CoordinatorMenu;
import Main.LoginScreen;
import Main.Main;
import Main.RunnerMenu;
import Model.User;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    
    public void fecha(){
         LoginScreen.getStage().close();
    }
    
    public void login(){
        try {
            ModelDao dao = new ModelDao();
            List <User> users = dao.getList("User");
            for(int i = 0; i<users.size(); i++){
                if(users.get(i).getEmail().equals(emails) && users.get(i).getPassword().equals(senhas) && users.get(i).getRoleId().getRoleName().equals("Runner")){
                    RunnerMenu tela = new RunnerMenu();
                    try {
                        tela.start(new Stage());
                    } catch (IOException ex) {
                        Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    fecha();
                    i = users.size();
                }else if(users.get(i).getEmail().equals(emails) && users.get(i).getPassword().equals(senhas) && users.get(i).getRoleId().getRoleName().equals("Administrator")){
                    AdminMenu tela = new AdminMenu();
                    try {
                        tela.start(new Stage());
                    } catch (IOException ex) {
                        Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    fecha();
                    i=users.size();
                }else if (users.get(i).getEmail().equals(emails) && users.get(i).getPassword().equals(senhas) && users.get(i).getRoleId().getRoleName().equals("Coordinator")){
                    CoordinatorMenu tela = new CoordinatorMenu();
                    try {
                        tela.start(new Stage());
                    } catch (IOException ex) {
                        Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    fecha();
                    i=users.size();
                }else if (i+1 == users.size()){
                    Alert ale = new Alert(AlertType.ERROR);
                    ale.setHeaderText("Email or password wrong");
                    ale.show();
                }
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
