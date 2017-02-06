/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Model.Charity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc1
 */


public class RegisterForEventController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private RadioButton opb;

    @FXML
    private RadioButton opa;

    @FXML
    private Button btlogout;

    @FXML
    private RadioButton opc;

    @FXML
    private CheckBox box5;

    @FXML
    private Button btregistra;

    @FXML
    private Button btcancel;

    @FXML
    private ComboBox<Charity> boxcharity;

    @FXML
    private CheckBox box42;

    @FXML
    private Button btback;

    @FXML
    private CheckBox box21;

    @FXML
    private TextField raisetf;

    @FXML
    private Label lbhour;

    @FXML
    private Label lbcost;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        preencheitems();
    }

 public void preencheitems() {
        try {
            ModelDao dao = new ModelDao();
            ObservableList<Model.Charity> c = FXCollections.observableArrayList(dao.getList("Charity"));
            boxcharity.setItems(c);
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }    
    
}
