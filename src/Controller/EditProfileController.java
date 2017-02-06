/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Model.Country;
import Model.Gender;
import Model.Runner;
import Model.User;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class EditProfileController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private PasswordField senha;

    @FXML
    private ComboBox<Country> country;

    @FXML
    private PasswordField consenha;

    @FXML
    private Button btback;

    @FXML
    private TextField pnome;

    @FXML
    private TextField snome;

    @FXML
    private ComboBox<Gender> gender;

    @FXML
    private Button btsalvar;

    @FXML
    private DatePicker niver;

    @FXML
    private Button btcancel;

    @FXML
    private Label emaillb;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        preencheitems();
    }

    public void salvar(){
        try {
            
            User u = new User();
            //passar email do usuario por parametro
            u.setFirstName(pnome.getText());
            u.setLastName(snome.getText());
            u.setPassword(senha.getText());
            
            ModelDao dao = new ModelDao();
            dao.update(u);
            
            Runner r = new Runner();
            r.setEmail(u);
            r.setGender(gender.getValue());
            r.setCountryCode(country.getValue());
            r.setDateofBirth(niver.getValue());

            dao = new ModelDao();
            dao.add(r);
            
            dao = new ModelDao();
            dao.update(r);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void preencheitems() {
        try {
            ModelDao dao = new ModelDao();
            ObservableList<Model.Gender> runner = FXCollections.observableArrayList(dao.getList("Gender"));

            gender.setItems(runner);

            dao = new ModelDao();
            ObservableList<Model.Country> countrys = FXCollections.observableArrayList(dao.getList("Country"));
            country.setItems(countrys);

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
}
