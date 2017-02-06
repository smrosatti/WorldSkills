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
    private ImageView logo2;

    @FXML
    private Button btback;

    @FXML
    private ImageView logo1;

    @FXML
    private Text lbtx1;

    @FXML
    private Text lbtx2;

    @FXML
    private Label lbhour;

    @FXML
    private Label lbnome1;

    @FXML
    private Label lbnome2;
    
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
                FindMoreInformation tela = new FindMoreInformation();
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
            lbnome1.setText(c.get(0).getCharityName());
            lbnome2.setText(c.get(1).getCharityName());
            lbtx1.setText(c.get(0).getCharityDescription());
            lbtx2.setText(c.get(1).getCharityDescription());
            logo1.setImage(new Image(c.get(0).getCharityLogo()));
            logo2.setImage(new Image(c.get(1).getCharityLogo()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
