/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Main.CheckCompetedBefore;
import Main.FindMoreInformation;
import Main.LoginScreen;
import Main.SponsorARunner;
import Model.TimeMarathon;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc1
 */
public class MainScreenController implements Initializable {

    @FXML
    private Button btmore;

    @FXML
    private Button btbearunner;

    @FXML
    private Button btlogin;

    @FXML
    private Label labelhrs;

    @FXML
    private Button btsponsor;

    private static Thread a;
    
    private String h;

    LocalDateTime hoje = LocalDateTime.now();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        t(labelhrs);

        actions();
    }

    public void actions() {
        try {

            btlogin.setOnMouseClicked((MouseEvent evt) -> {
                Login();
            });
            
            btmore.setOnMouseClicked((MouseEvent evt) -> {
                more();
            });
            
            btbearunner.setOnMouseClicked((MouseEvent evt) -> {
                bearunner();
            });

            btsponsor.setOnMouseClicked((MouseEvent evt) -> {
                try {
                    SponsorARunner tela = new SponsorARunner();
                    tela.start(new Stage());
                    fecha();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
    public void more(){
        try {
            FindMoreInformation tela = new FindMoreInformation();
                    tela.start(new Stage());
                    fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getdata() {

        TimeMarathon t = new TimeMarathon();

        String horas = t.hours();

        return horas;

    }

    public void t(Label l) {
        a = new Thread(new Runnable() {
            @Override
            public void run() {
                LocalDateTime datacorrida = LocalDateTime.of(2017, Month.SEPTEMBER, 5, 1, 1);
                LocalDateTime hoje = LocalDateTime.now();
                Duration duracao = Duration.between(hoje, datacorrida);
                while (true) {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            l.setText(getdata());
                            h = getdata();
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return;
                    }
                }
            }
        });
        a.start();

    }

    public void fecha() {
        try {
            Main.Main.getStage().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Login() {
        try {
            LoginScreen tela = new LoginScreen();
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void bearunner(){
        try {
            CheckCompetedBefore tela = new CheckCompetedBefore(h);
            tela.start(new Stage());
            fecha();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
