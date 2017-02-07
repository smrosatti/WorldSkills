/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Main.Main;
import Main.RegisterARunner;
import Model.Country;
import Model.Gender;
import Model.Role;
import Model.Runner;
import Model.User;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class RegisterARunnerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private PasswordField consenhapf;

    @FXML
    private ComboBox<Country> country;

    @FXML
    private Button btback;

    @FXML
    private TextField emailtf;

    @FXML
    private TextField pnome;

    @FXML
    private TextField snome;

    @FXML
    private ComboBox<Gender> gender;

    @FXML
    private DatePicker niver;

    @FXML
    private Button btregistra;

    @FXML
    private Button btcancel;

    @FXML
    private PasswordField senhapf;

    private Gender genderc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        preencheitems();

        btregistra.setOnMouseClicked((MouseEvent evt) -> {
            cadastrar();

        });

        btcancel.setOnMouseClicked((MouseEvent evt) -> {
            cancel();

        });

    }

    public void cancel() {
        try {
            Main tela = new Main();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrar() {
        try {

            User u = new User();
            u.setEmail(emailtf.getText());
            u.setPassword(senhapf.getText());
            u.setFirstName(pnome.getText());
            u.setLastName(snome.getText());
            ModelDao dao = new ModelDao();
            List<Role> roles = dao.getList("Role");
            u.setRoleId(roles.get(2));

            dao = new ModelDao();
            dao.add(u);

            Runner r = new Runner();
            r.setEmail(u);
            r.setGender(gender.getValue());
            r.setCountryCode(country.getValue());
            r.setDateofBirth(niver.getValue());

            dao = new ModelDao();
            dao.add(r);

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

    public void fecha() {
        try {
            RegisterARunner.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
