/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.AboutMarathon;
import Main.FindMoreInformation;
import Main.Map;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class AboutMarathonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btback;

    @FXML
    private ImageView imgmap;

    @FXML
    private Label lbhour;

     private static String h;

    public static String getH() {
        return h;
    }

    public static void setH(String h) {
        AboutMarathonController.h = h;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          btback.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
          
          imgmap.setOnMouseClicked((MouseEvent evt) -> {
            back();

        });
        
    } 
    
    public void map(){
        try {
            Map tela = new Map();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
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
         AboutMarathon.getStage().close();
     }
}
