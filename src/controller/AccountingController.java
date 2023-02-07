package controller;

//import static controller.LoginpageController.accountingpage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AccountingController implements Initializable  {
    
    @FXML
    private Button checkbtn;

    @FXML
    private Button patientbtn;

   // Stage registpage = null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      patientbtn.setOnAction(e ->{ 
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Registbtn();
        } catch (IOException ex) {
            Logger.getLogger(AccountingController.class.getName()).log(Level.SEVERE, null, ex);
        }
     });
        
    }
    
    
    public void Registbtn()throws IOException{
        
    AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../view/PatientRegister.fxml"));
    Stage registpage = new Stage();
    registpage.setScene(new Scene(root1));
    registpage.show();
        
    }
    

    
}
