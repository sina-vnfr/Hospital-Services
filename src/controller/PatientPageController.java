package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modle.SaveInfo;

public class PatientPageController implements Initializable {

    @FXML
    private TextField nationalfild;

    @FXML
    private PasswordField passfild;

    @FXML
    private Button enterbtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        enterbtn.setOnAction((ActionEvent e) ->{
 
            ArrayList<Object> objects = new ArrayList<>();
                      
            FileInputStream fis = null;
            try {
             
                fis = new FileInputStream("address.ser");
              
                Object obj =null;
                boolean isExist = true;
                
              
                while(isExist){
                    try {
                        if(fis.available()!=0){
                            try {
                                ObjectInputStream ois = new ObjectInputStream(fis);
                                obj = (SaveInfo) ois.readObject();
                                objects.add(obj);
          

                            } catch (IOException | ClassNotFoundException ex) {
                                Logger.getLogger(PatientPageController.class.getName()).log(Level.SEVERE, null, ex);
                               
                            }
                        }
                        else{
                            isExist =false;
                        }                  } catch (IOException ex) {
                            Logger.getLogger(PatientPageController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }     
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PatientPageController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PatientPageController.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
      
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(PatientPageController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            int b = objects.size();
            int i = 0;
            while(i<b){
            SaveInfo dd = (SaveInfo) objects.get(i);
            if(nationalfild.getText().equals(dd.getNationalcode()) && passfild.getText().equals(dd.getPassword())){
                 try {
                enterBtn();
                        } catch (IOException ex) {
                Logger.getLogger(LoginpageController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                       }
            i++;
                }  
            System.out.println(b);
      });   
       
    }
    
    
     public void enterBtn() throws IOException{
                AnchorPane root12 = FXMLLoader.load(this.getClass().getResource("../view/home.fxml"));
                Stage homepage = new Stage();
                homepage.setScene(new Scene(root12));
                homepage.show();
             }
        
    
}