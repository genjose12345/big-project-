import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
 
public class PrimeCalculator extends Application
{
   public void start(Stage stage)
   {
      try
      {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("PrimeCalculatorFXML.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("PrimeCalculator");
      stage.show();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }  
}