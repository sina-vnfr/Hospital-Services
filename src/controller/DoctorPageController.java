package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import modle.Doctors;

public class DoctorPageController implements Initializable {
    
    @FXML
    private TextField doctorUsreName;

    @FXML
    private PasswordField DoctorPassword;

    @FXML
    private Button entarBtn;
    
    
    @FXML
    private Label errorlbl;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        entarBtn.setOnAction(e ->{
            Doctors doctor = new Doctors(); 
            if(doctor.getdoctoruser().equals(doctorUsreName.getText()) && doctor.getdoctorpass().equals(DoctorPassword.getText())){
                try {
                    entarText();
                } catch (IOException ex) {
                    //Logger.getLogger(DoctorPageController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                errorlbl.setText("usename or password in incorrect!");
                errorlbl.setTextFill(Color.RED);
            }
           
        });
    }    
    
    public void entarText() throws IOException{
    AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/doctorText.fxml"));
    Stage doctorTextpage = new Stage();
    doctorTextpage.setScene(new Scene(root1));
    doctorTextpage.show();
    }
    
}
