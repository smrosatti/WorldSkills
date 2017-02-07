/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Main.FindMoreInformation;
import Main.ListCharities;
import Model.Charity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class ListCharitiesController implements Initializable {

    /**
     * Initializes the controller class.
     */

    @FXML
    private Button btback;
    
     @FXML
    private Pane pane;

    @FXML
    private Text lbtx2;

    @FXML
    private Label lbhour;

    public static String hours;

    public static String getHours() {
        return hours;
    }

    public static void setHours(String hours) {
        ListCharitiesController.hours = hours;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lbhour.setText(hours);
        preenche();
         btback.setOnMouseClicked((MouseEvent evt) -> {
            try {
                FindMoreInformation tela = new FindMoreInformation(hours);
                tela.start(new Stage());
                ListCharities.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void preenche(){
        try {
            ModelDao dao = new ModelDao();
            ObservableList<Charity> c = FXCollections.observableArrayList(dao.getList("Charity"));
            int ylb= 69, yimg=69, ydes =133;
            for(int i = 0; i < c.size(); i++){
                Label lb = new Label();
                lb.setText(c.get(i).getCharityName());
                lb.setLayoutX(165);
                lb.setLayoutY(ylb);
                lb.setStyle("lbmedia");
                
                ImageView img = new ImageView();
                img.setImage(new Image(c.get(i).getCharityLogo()));
                img.setFitHeight(88);
                img.setFitWidth(118);
                img.setLayoutX(30);
                img.setLayoutY(yimg);
                
                Text txt = new Text();
                txt.setText(c.get(i).getCharityDescription());
                txt.setLayoutX(165);
                txt.setLayoutY(ydes);
                
                pane.getChildren().addAll(lb, img, txt);
                
                ylb = ylb + 116;
                yimg = yimg + 116;
                ydes = ydes + 116;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
