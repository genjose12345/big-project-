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
    void cancelOnAction(ActionEvent event) 
     {
     /*
     System.exit(0); 
     //////////////////
     Platform.exit();
     ///////////////////////////
     Stage stage = (stage) cancelButton.getScene().getWindow();
     stage.close();
     ////////////////////////////////////////////////////
      User u = new User();
      Node node = (Node) event.getSource();
     Stage stage = (Stage) node.getScene().getWindow();
     try {
     Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("LoginFXML.fxml"));
   stage.setUserData(u); 
    Scene scene = new Scene(root);
    stage.setScene(scene);
    
    stage.close();
    }
    catch(Exception e)
    {
      System.out.println("hi");
    }
    ////////////////////////////////////
    
      FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginFXML.fxml"));
LoginController controller = loader.getController();
controller.setStage(this.stage); 
////////////////////////////////////////////////

      
       Node node = (Node) event.getSource();
    Stage thisStage = (Stage) node.getScene().getWindow();
    thisStage.close();

       Stage thisStage = (Stage) cancelButton.getScene().getWindow()
       stage.close()
////////////////////////////////////////////////////////
       /*
       close program upon closeing 
       */   
       
     }

    @FXML
    void loginOnAction(ActionEvent event) 
    {
      /* 
      try
      {
         String a = usernameTextField.getText();
         String b = passwordTextField.getText();
        // should check a data base to see if usernames matchs password  if not make label visvble and have them keep trying 
        /* if(a.equals(retirves usernmae from database) && b.equals(retives the password from data base)&& (checks they both match to the same line they are saved on in the data base))
         {
            send thier ass to the main page
         }
         else
         {
            label.setVisiblity(true);
         }
         */
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
