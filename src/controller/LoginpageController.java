package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginpageController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private ImageView pictuer;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Button accountbtn;

    @FXML
    private Button doctorbtn;

    @FXML
    private Button nursebtn;
    
    @FXML
    private Button patientbnt;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        accountbtn.setOnAction(e ->{
            try {
                Accountingbtn();
            } catch (IOException ex) {
                Logger.getLogger(LoginpageController.class.getName()).log(Level.SEVERE, null, ex);
            }
         }); 
        doctorbtn.setOnAction(e2 ->{
                try {
                    DoctorBtn();
                            } catch (IOException ex) {
                    Logger.getLogger(LoginpageController.class.getName()).log(Level.SEVERE, null, ex);
                }
        });
        patientbnt.setOnAction(eb ->{
            try {
                PatientBtn();
                        } catch (IOException ex) {
                Logger.getLogger(LoginpageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        nursebtn.setOnAction(et ->{
            try {
                NurseBtn();
                        } catch (IOException ex) {
                Logger.getLogger(LoginpageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
            
        
    }
    
    public void Accountingbtn()throws IOException{
        
    AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/Accounting.fxml"));
    Stage accountingpage = new Stage();
    accountingpage.setScene(new Scene(root1));
    accountingpage.show();
        
    }
    
    public void DoctorBtn()throws IOException{
    AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/DoctorPage.fxml"));
    Stage doctorpage = new Stage();
    doctorpage.setScene(new Scene(root1));
    doctorpage.show();
    }
    
    public void PatientBtn() throws IOException{
    AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/PatientPage.fxml"));
    Stage accountingpage = new Stage();
    accountingpage.setScene(new Scene(root1));
    accountingpage.show();
        
    }
    
    public void NurseBtn() throws IOException{
     AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/nursepage.fxml"));
    Stage nursepage = new Stage();
    nursepage.setScene(new Scene(root1));
    nursepage.show();
    }
    
    
    

}
