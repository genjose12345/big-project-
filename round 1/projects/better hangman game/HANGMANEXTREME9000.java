import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
 
public class HANGMANEXTREME9000 extends Application
{
   public void start(Stage stage)
   {
      try
      {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("hangmanFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("HANGMAN EXTREME 9000");
      stage.show();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }  
}