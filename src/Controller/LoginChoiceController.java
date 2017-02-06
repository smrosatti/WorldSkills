/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Main.AdminMenu;
import Main.CoordinatorMenu;
import Main.RunnerMenu;
import Model.User;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class LoginChoiceController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btrunner;

    @FXML
    private Button btcoordinator;

    @FXML
    private Button btadmin;
    
    public static String email;
    public static String senha;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        LoginChoiceController.email = email;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        LoginChoiceController.senha = senha;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btrunner.setOnMouseClicked((MouseEvent evt)->{
            runner();
        });
        
        btcoordinator.setOnMouseClicked((MouseEvent evt)->{
            coordinator();
        });
        
        btadmin.setOnMouseClicked((MouseEvent evt)->{
            admin();
        });
    }

    public void runner(){
        try {
            ModelDao daou = new ModelDao();
            List <User> users = daou.getList("User_");
            for(int i = 0; i<users.size(); i++){
                if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(senha) && users.get(i).getRoleId().equals("1")){
                    RunnerMenu tela = new RunnerMenu();
                    tela.start(new Stage());
                    i = users.size();
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
    
     public void coordinator(){
        try {
              ModelDao daou = new ModelDao();
            List <User> users = daou.getList("User_");
            for(int i = 0; i<users.size(); i++){
                if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(senha) && users.get(i).getRoleId().equals("2")){
                    CoordinatorMenu tela = new CoordinatorMenu();
                    tela.start(new Stage());
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
     
      public void admin(){
        try {
            ModelDao daou = new ModelDao();
            List <User> users = daou.getList("User_");
            for(int i = 0; i<users.size(); i++){
                if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(senha) && users.get(i).getRoleId().equals("3")){
                    AdminMenu tela = new AdminMenu();
                    tela.start(new Stage());
                    i = users.size();
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
