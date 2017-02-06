/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ModelDao;
import Main.Main;
import Main.SponsorARunner;
import Main.SponsorchipConfirmation;
import Model.Registration;
import Model.Runner;
import Model.Sponsorship;
import Model.User;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class SponsorARunnerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField dayex;

    @FXML
    private Button btmais;

    @FXML
    private TextField fieldmoney;

    @FXML
    private TextField namefield;

    @FXML
    private TextField yearex;

    @FXML
    private TextField cardfield;

    @FXML
    private Button btmenos;

    @FXML
    private Button btcancel;

    @FXML
    private MenuButton runners;

    @FXML
    private Button btpay;

    @FXML
    private TextField cardcodefield;

    @FXML
    private Button btback;

    @FXML
    private ImageView informationicon;

    @FXML
    private TextField cvcfield;

    @FXML
    private Label labelmoney;

    private int runnerid;

    private String nomerunner;

    public int getRunnerid() {
        return runnerid;
    }

    public void setRunnerid(int runnerid) {
        this.runnerid = runnerid;
    }

    private Registration registration;

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ActionsAmount();
        buttons();
        preencherrunners();

    }

    public void ActionsAmount() {

        btmais.setOnMouseClicked((MouseEvent evt) -> {
            int a = Integer.parseInt(fieldmoney.getText()) + 10;
            String b = Integer.toString(a);
            fieldmoney.setText(b);
            labelmoney.setText("$ " + b);
        });

        btmenos.setOnMouseClicked((MouseEvent evt) -> {
            int a = Integer.parseInt(fieldmoney.getText()) - 10;
            String b = Integer.toString(a);
            fieldmoney.setText(b);
            labelmoney.setText("$ " + b);
        });

        fieldmoney.setOnKeyReleased((KeyEvent evt) -> {
            if (fieldmoney.getText().equals(null)) {
                int i = 0;
                fieldmoney.setText(Integer.toString(i));
            }
            labelmoney.setText("$ " + fieldmoney.getText());
        });

    }

    public void buttons() {

        btback.setOnMouseClicked((MouseEvent evt) -> {
            try {
                Main tela = new Main();
                tela.start(new Stage());
                SponsorARunner.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btpay.setOnMouseClicked((MouseEvent evt) -> {
            confirm();

        });

        btcancel.setOnMouseClicked((MouseEvent evt) -> {
            try {
                Main tela = new Main();
                tela.start(new Stage());
                SponsorARunner.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    public void information() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void preencherrunners() {
        try {
            ModelDao dao = new ModelDao();
            ObservableList<Runner> runner = FXCollections.observableArrayList(dao.getList("Runner"));

            for (int j = 0; j < runner.size(); j++) {
                runnerid = runner.get(j).getRunnerId();
                MenuItem m = new MenuItem(runner.get(j).getEmail().getLastName() + ", " + runner.get(j).getEmail().getFirstName() + " " + runnerid + " - (" + runner.get(j).getCountryCode() + ")");
                m.setOnAction((ActionEvent e) -> {
                    String corredor = m.getText();
                    runners.setText(corredor);
                    nomerunner = m.getText();
                });
                runners.getItems().add(m);
            }

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void fechar() {
        SponsorARunner.getStage().close();
    }

    public void confirm() {
        try {
            // String runner = runners.getValue().toString();
            if (namefield.getText().trim().isEmpty() || cvcfield.getText().trim().isEmpty() || fieldmoney.getText().trim().isEmpty()
                    || cardcodefield.getText().trim().isEmpty() || cardfield.getText().trim().isEmpty() || yearex.getText().trim().isEmpty()
                    || dayex.getText().trim().isEmpty()) {

                Alert a = new Alert(AlertType.ERROR);
                a.setHeaderText("Preencha todos os campos corretamente!");
                a.show();

            } else if (cardcodefield.getLength() == 16 && cvcfield.getLength() == 3 && Integer.valueOf(dayex.getText()) >= LocalDate.now().getMonthValue() && Integer.valueOf(yearex.getText()) >= LocalDate.now().getYear()) {
                Sponsorship s = new Sponsorship();
                s.setAmount((Double.parseDouble(fieldmoney.getText())));
                s.setSponsorshipName(namefield.getText());
                Runner r = new Runner();
                r.setRunnerId(runnerid);

                    ModelDao rg = new ModelDao();
                    s.setRegistrationId((Registration) rg.getList("Registration WHERE runnerid = "+runnerid).get(1));

                ModelDao dao = new ModelDao();
                dao.add(s);

                SponsorchipConfirmation tela = new SponsorchipConfirmation(nomerunner, labelmoney.getText());//passar futuros parametros
                tela.start(new Stage());

                fechar();

            } else {
                Alert a = new Alert(AlertType.ERROR);
                a.setHeaderText("Dados referentes ao cartão de crédito estão incorretos!");
                a.setContentText("Tenha certeza que a data de vencimento seja superior a data atual\n"
                        + "CVC deve ter 3 dígitos\n"
                        + "Código do cartão deve ter 16 dígitos");
                a.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
