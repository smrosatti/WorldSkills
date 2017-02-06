/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.AboutMarathon;
import Main.Map;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class MapController implements Initializable {

    @FXML
    private Region rg6;

    @FXML
    private Region rg8;

    @FXML
    private Region rg7;

    @FXML
    private ImageView imgmap;

    @FXML
    private Pane panelmenu;

    @FXML
    private Label lbcheck;

    @FXML
    private AnchorPane ap;

    @FXML
    private Button btback;

    @FXML
    private Label lbmenu;

    @FXML
    private Region rg2;

    @FXML
    private Pane pane;

    @FXML
    private Region rg1;

    @FXML
    private Region rg4;

    @FXML
    private Region rg3;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btback.setOnMouseClicked((MouseEvent e)->{
            back();
        });
    }    
    public void back(){
        AboutMarathon aboutMarathonM = new AboutMarathon();
        try {
            aboutMarathonM.start(new Stage());
            Map.getStage().close();
        } catch (Exception e) {
        }
    }
}
