package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import modle.SaveInfo;

public class PatientRegisterController implements Initializable,Serializable {

    
    @FXML
    private TextField namebtn;

    @FXML
    private TextField lastnamebtn;
    
    @FXML
    private TextField nationalcodebtn;

    @FXML
    private PasswordField passwordbtn;

    @FXML
    private TextField agebtn;

    @FXML
    private TextArea textbtn;

    @FXML
    private TextField sexbtn;
    
    @FXML
    private Button registerbtn;
    
    @FXML
    private Label savelbl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
            registerbtn.setOnAction((ActionEvent e) ->{
                try {
                    SaveInfo infor = new SaveInfo(namebtn.getText(),agebtn.getText(),nationalcodebtn.getText(),lastnamebtn.getText(),passwordbtn.getText(),textbtn.getText(),sexbtn.getText());
                    FileOutputStream fout = new FileOutputStream("address.ser",true);
                    ObjectOutputStream oos = new ObjectOutputStream(fout);
                    oos.writeObject(infor);
                    oos.close();
                    System.out.println("file saved");
                    
                  savelbl.setText("Saved successfully");
                  savelbl.setTextFill(Color.GREEN);
                  
                } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(PatientRegisterController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
              
            });
          
    }    
   
}
