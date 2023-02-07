package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import modle.saveDoctorText;

public class DoctorText implements Initializable {


    @FXML
    private TextArea doctorText;

    @FXML
    private TextField patientLastName;

    @FXML
    private TextField patientName;

    @FXML
    private TextField nationalCode;
    
    @FXML
    private Button saveTaxtBtn;
    
    @FXML
    private Label savelbl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        saveTaxtBtn.setOnAction(e ->{
            saveDoctorText save = new saveDoctorText(nationalCode.getText() , doctorText.getText());
            try{
              FileOutputStream fout = new FileOutputStream("Doctortext.ser",true);
                    ObjectOutputStream oos = new ObjectOutputStream(fout);
                    oos.writeObject(save);
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
