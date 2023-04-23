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



public class hangmancontroller {
   int count = 0;
   public void initialize()
   {
   head.setVisible(false);
   body.setVisible(false);
   leftarm.setVisible(false);
   leftleg.setVisible(false);
   rightarm.setVisible(false);
   rightleg.setVisible(false);
   letterm.setVisible(false);
   lettera.setVisible(false);
   lettern.setVisible(false);
   }
   

    @FXML
    private Button restartgame;

    @FXML
    private Button startgame;

    @FXML
    private TextField guessletter;

    @FXML
    private Circle head;

    @FXML
    private Line body;

    @FXML
    private Line rightleg;

    @FXML
    private Line rightarm;

    @FXML
    private Line leftarm;

    @FXML
    private Line leftleg;

    @FXML
    private Label letterm;

    @FXML
    private Label lettera;

    @FXML
    private Label lettern;

    @FXML
    void letter(ActionEvent event) {

    }

    @FXML
    void restart(ActionEvent event) {
      try{     
      Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader(getClass().getResource("hangmanFXML.fxml"));    
      Parent root = loader.load();
      Scene scene = new Scene(root);
      stage.setScene(scene);
      }
      catch(Exception e)
      {
         System.out.println("hello");
      }
      
    }

    @FXML
    void start(ActionEvent event) {
    String letter = guessletter.getText();
    if(letterm.getText().equals(letter))
    {
      letterm.setVisible(true);
    }
     else if(lettera.getText().equals(letter))
    {
      lettera.setVisible(true);
    }   
    else if(lettern.getText().equals(letter))
    {
      lettern.setVisible(true);
    }
    else
    {
      count++;
    }
    
    if(count == 1)
    {
      head.setVisible(true);
    }
    else if(count == 2)
    {
      body.setVisible(true);
    }

   else if(count == 3)
    {
      leftleg.setVisible(true);
    }

   else if(count == 4)
    {
      rightleg.setVisible(true);
    }

   else if(count == 5)
    {
      leftarm.setVisible(true);
    }

   else if(count == 6)
    {
      rightarm.setVisible(true);
    }
    if(count == 7)
    {
     Alert b = new Alert(AlertType.WARNING, "You lose");
       b.setTitle("sorry");
       b.setHeaderText("Nice try");
       b.show();

    }


    if(letterm.isVisible() && lettera.isVisible() && lettern.isVisible())
    {
      Alert a = new Alert(AlertType.WARNING, "You win");
       a.setTitle("Right word");
       a.setHeaderText("Good Job!");
       a.show();

    } 
         
   }

}
