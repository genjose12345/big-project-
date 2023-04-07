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
import java.util.ArrayList;
import java.nio.file.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
///////////////////////////
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedWriter;

public class RegisterController {

    @FXML
    private ImageView chessimagerview1;

    @FXML
    private ImageView chessimagevView2;

    @FXML
    private TextField firstnameTextField;

    @FXML
    private TextField lastnameTextfield;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField confirmpasswordTextField;

    @FXML
    private Button registerButton;

    @FXML
    private Button closeButton;

    @FXML
    void closeActionEvenet(ActionEvent event) {

    }

    @FXML
    void registerActionEvent(ActionEvent event) 
    {
         try
         {
               String username1 = usernameTextField.getText();
               String password1 = passwordTextField.getText();
               String confirmpassword1 = confirmpasswordTextField.getText(); 
               if(password1.equals(confirmpassword1))
               {
                String checker = username1 + "," + password1;
                BufferedWriter writer = new BufferedWriter(new FileWriter("NotUnsecureduserdata.txt", true));
                writer.append(checker + "\n");
                writer.close();
               }
               else
               {
                 Alert d = new Alert(AlertType.WARNING, "Passwords do not match");
                 d.setTitle("FATAL ERROR!");
                 d.setHeaderText("invalid input");
                 d.show();
               }                                          
         }
         catch(IOException e)
         {
                 Alert a = new Alert(AlertType.WARNING, "Error");
                 a.setTitle("FATAL ERROR!");
                 a.setHeaderText("invalid input");
                 a.show();
         }
                 Alert b = new Alert(AlertType.WARNING, "Rigestration complete");
                 b.setTitle("going back to login");
                 b.setHeaderText("successe");
                 b.show(); 
                 
                Stage stage = new Stage();
                try
                {
                  FXMLLoader loader = new FXMLLoader(getClass().getResource("/LoginFXML.fxml"));
                  Parent root = loader.load();
                  Scene scene = new Scene(root);
                  stage.setScene(scene);
                  stage.setTitle("Login");
                  stage.show();
                  }
                catch(Exception e)
                {
                 e.printStackTrace();
                }                
    }

}
