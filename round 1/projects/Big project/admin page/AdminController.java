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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;


public class AdminController {

    @FXML
    private TextField team1;

    @FXML
    private TextField team2;

    @FXML
    private TextField team3;

    @FXML
    private TextField team4;

    @FXML
    private TextField team5;

    @FXML
    private TextField team6;

    @FXML
    private TextField team7;

    @FXML
    private TextField team8;

    @FXML
    private TextField team9;

    @FXML
    private TextField team10;

    @FXML
    private MenuItem menuItemAdd1;

    @FXML
    private MenuItem menuItemRemove1;

    @FXML
    private MenuItem menuItemAdd2;

    @FXML
    private MenuItem menuItemRemove2;

    @FXML
    private MenuItem menuItemAdd3;

    @FXML
    private MenuItem menuItemRemove3;

    @FXML
    private MenuItem menuItemAdd4;

    @FXML
    private MenuItem menuItemRemove4;

    @FXML
    private MenuItem menuItemAdd5;

    @FXML
    private MenuItem menuItemRemove5;

    @FXML
    private MenuItem menuItemAdd6;

    @FXML
    private MenuItem menuItemRemove6;

    @FXML
    private MenuItem menuItemAdd7;

    @FXML
    private MenuItem menuItemRemove7;

    @FXML
    private MenuItem menuItemAdd8;

    @FXML
    private MenuItem menuItemRemove8;

    @FXML
    private MenuItem menuItemAdd9;

    @FXML
    private MenuItem menuItemRemove9;

    @FXML
    private MenuItem menuItemAdd10;

    @FXML
    private MenuItem menuItemRemove10;

    @FXML
    private Button generateTournament;

    @FXML
    private Button resetTournament;

    @FXML
    void generate(ActionEvent event) 
    {
     int tmp = (int) ( Math.random() * 2 + 1);
     boolean file = false;
     int team1 = 0;
     int team2 = 0;
     int team3 = 0;
     int team4 = 0;
     int team5 = 0;
     int team6 = 0;
     int team7 = 0;
     int team8 = 0;
     int team9 = 0;
     int team10 = 0;
     try
     {
     if(file == true)
      {
        BufferedWriter writer = new BufferedWriter(
        writer("NotUnsecureduserdata.txt", true));
        writer.append("\n" + checker);
        writer.close();
      }
      else
      {
        BufferedWriter writer = new BufferedWriter(new FileWriter("NotUnsecureduserdata.txt", true));
        writer.append(checker + "\n");
        writer.close();
                                                       
      }
     }
     catch (IOException e) 
           {
               e.printStackTrace();
           }

    }

    @FXML
    void menuItemAdd100(ActionEvent event) {

    }

    @FXML
    void menuItemAdd22(ActionEvent event) {

    }

    @FXML
    void menuItemAdd33(ActionEvent event) {

    }

    @FXML
    void menuItemAdd44(ActionEvent event) {

    }

    @FXML
    void menuItemAdd55(ActionEvent event) {

    }

    @FXML
    void menuItemAdd66(ActionEvent event) {

    }

    @FXML
    void menuItemAdd77(ActionEvent event) {

    }

    @FXML
    void menuItemAdd88(ActionEvent event) {

    }

    @FXML
    void menuItemAdd99(ActionEvent event) {

    }

    @FXML
    void menuItemRemove1(ActionEvent event) {

    }

    @FXML
    void menuItemRemove100(ActionEvent event) {

    }

    @FXML
    void menuItemRemove22(ActionEvent event) {

    }

    @FXML
    void menuItemRemove33(ActionEvent event) {

    }

    @FXML
    void menuItemRemove44(ActionEvent event) {

    }

    @FXML
    void menuItemRemove55(ActionEvent event) {

    }

    @FXML
    void menuItemRemove66(ActionEvent event) {

    }

    @FXML
    void menuItemRemove77(ActionEvent event) {

    }

    @FXML
    void menuItemRemove88(ActionEvent event) {

    }

    @FXML
    void menuItemRemove99(ActionEvent event) {

    }

    @FXML
    void menuItemadd11(ActionEvent event) {

    }

    @FXML
    void reset(ActionEvent event) {

    }

}
