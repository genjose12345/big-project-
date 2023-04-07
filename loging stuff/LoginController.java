import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.*;
import java.io.*;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import java.util.ArrayList;
import java.nio.file.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.application.Platform;
import java.io.IOException;
import javafx.scene.Node;

public class LoginController extends Login {

   
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerTextField;

    @FXML
    private Button cancelButton;
    
    @FXML
    private Label invalidLabel;

    @FXML
    void loginOnAction(ActionEvent event) 
    {
     String username = usernameField.getText();
        String password = passwordField.getText();
        boolean validCredentials = false;

      try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Erik Vasquez\\Documents\\user_credentials.csv"))) 
      {
            String line;
            while ((line = reader.readLine()) != null) 
          {
                String[] parts = line.split(",");
                if(parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) 
             {
                    validCredentials = true;
                    break;
             }
          }
        } 
       catch (IOException e) 
        {
            e.printStackTrace();
        }

        if (validCredentials) 
        {
            try
            {
                Stage dashboardStage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/dash3.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root);
                dashboardStage.setScene(scene);
                dashboardStage.setTitle("DashBoard");
                dashboardStage.show();
                loginStage.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        } 
       else 
       {
         invalidLogin.setVisible(true);
       }
       
    }
    

    @FXML
    void passwordOnAction(ActionEvent event) {

    }

    @FXML
    void registerOnAction(ActionEvent event) {
    /*
      opens rigester page 
    */

    }

    @FXML
    void usernameOnAction(ActionEvent event) {

    }
   
}
