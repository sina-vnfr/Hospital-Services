
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.layout.AnchorPane;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); 
      FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/loginpage.fxml"));
    // AnchorPane sr = FXMLLoader.load(this.getClass().getResource("view/loginpage.fxml"));
    loader.load();
    Scene scene = new Scene(loader.getRoot());
     stage.setScene(scene);
     stage.show();
     
    }
    
    public static void main(String[] args){
    launch(args);
}
}