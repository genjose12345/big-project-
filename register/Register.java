import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Register extends Application
{
   public void start(Stage stage)
   {
      try
      {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Register");
      stage.show();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
}