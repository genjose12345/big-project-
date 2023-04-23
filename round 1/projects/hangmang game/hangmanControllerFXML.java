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


public class hangmanControllerFXML {
HangManExtremeModel word = new HangManExtremeModel();     
      String letterss = word.getWord();
      char[] lettersss = new char[letterss.length()];
    @FXML
    void startgame(ActionEvent event) 
    {
     
      for(int i  = 0; i< lettersss.length;i++)
      {
         lettersss[i] = letterss.charAt(i);
      }
      //System.out.println(Arrays.toString(letters));
    }
    @FXML
    private TextField letterguess;
    
    @FXML
    private TextArea textArea; 

    @FXML
    private Label letterm;

    @FXML
    private Label lettern;

    @FXML
    private Label lettero;

    @FXML
    private Label letterp;

    @FXML
    private Label letterq;

    @FXML
    private Label letterr;

    @FXML
    private Label letters;

    @FXML
    private Label lettert;

    @FXML
    private Label letteru;

    @FXML
    private Label letterv;

    @FXML
    private Label letterw;

    @FXML
    private Label letterx;

    @FXML
    private Label lettery;

    @FXML
    private Label letterz;

    @FXML
    private Label lettera;

    @FXML
    private Label letterb;

    @FXML
    private Label letterc;

    @FXML
    private Label letterd;

    @FXML
    private Label lettere;

    @FXML
    private Label letterf;

    @FXML
    private Label letterg;

    @FXML
    private Label letterh;

    @FXML
    private Label letteri;

    @FXML
    private Label letterj;

    @FXML
    private Label letterk;

    @FXML
    private Label letterl;

    @FXML
    private Label lettercount;

    @FXML
    private Circle head;
   
    @FXML
    private Line rightArm;
    
    @FXML
    private Line body;
    
    @FXML
    private Line rightLeg;
    
    @FXML
    private Button startbutton;
        
    @FXML
    private Line leftLeg;
    
    @FXML
    private Line leftArm;
    
    @FXML
    private Circle leftEye;
   
    @FXML
    private Circle rightEye;
    
    @FXML
    void guessLetter(ActionEvent event) {
    String letter = letterguess.getText();
    char correctletter = '1';
    
    for(int k = 0 ; k < letterss.length();k++)
    {
       correctletter = lettersss[k];
    }   
    int count = 0;     
    try
    {
     for(int i = 0; i < letterss.length();i++)
     {
     
      if(lettera.getText().equals(letter))
      {
         lettera.setVisible(true);
      }
      else if(letterb.getText().equals(letter))
      {
         letterb.setVisible(true);
      }
      else if(letterc.getText().equals(letter))
      {
         letterc.setVisible(true);
      }
      else if(letterd.getText().equals(letter))
      {
         letterd.setVisible(true);
      }
      else if(lettere.getText().equals(letter))
      {
         lettere.setVisible(true);
      }
      else if(letterf.getText().equals(letter))
      {
         letterf.setVisible(true);
      }
      else if(letterg.getText().equals(letter))
      {
         letterg.setVisible(true);
      }
      else if(letterh.getText().equals(letter))
      {
         letterh.setVisible(true);
      }
      else if(letteri.getText().equals(letter))
      {
         letteri.setVisible(true);
      }
      else if(letterj.getText().equals(letter))
      {
         letterj.setVisible(true);
      }
      else if(letterk.getText().equals(letter))
      {
         letterk.setVisible(true);
      }
      else if(letterl.getText().equals(letter))
      {
         letterl.setVisible(true);
      }
      else if(letterm.getText().equals(letter))
      {
         letterm.setVisible(true);
      }
      else if(lettern.getText().equals(letter))
      {
         lettern.setVisible(true);
      }
      else if(lettero.getText().equals(letter))
      {
         lettero.setVisible(true);
      }
      else if(letterp.getText().equals(letter))
      {
         letterp.setVisible(true);
      }
      else if(letterq.getText().equals(letter))
      {
         letterq.setVisible(true);
      }
      else if(letterr.getText().equals(letter))
      {
         letterr.setVisible(true);
      }
      else if(letters.getText().equals(letter))
      {
         letters.setVisible(true);
      }
      else if(lettert.getText().equals(letter))
      {
         lettert.setVisible(true);
      }
      else if(letteru.getText().equals(letter))
      {
         letteru.setVisible(true);
      }
      else if(letterv.getText().equals(letter))
      {
         letterv.setVisible(true);
      }
      else if(letterw.getText().equals(letter))
      {
         letterw.setVisible(true);
      }
      else if(letterx.getText().equals(letter))
      {
         letterx.setVisible(true);
      }
      else if(lettery.getText().equals(letter))
      {
         lettery.setVisible(true);
      }
      else if(letterz.getText().equals(letter))
      {
         letterz.setVisible(true);
      }
       else
      {
       Alert a = new Alert(AlertType.WARNING, "You Guess right");
       a.setTitle("Right Letter");
       a.setHeaderText("Good Job!");
       a.show();
      }

      for(int l = 0;l < 100; l++)
      {
         if(!letter.equals(correctletter))
      {
         count++;
      }
      
      else if(count == 1)
      {
        head.setVisible(true);
      }
    
      else if(count == 2)
      {
        body.setVisible(true);
      }
    
      else if(count == 3)
      {
        rightLeg.setVisible(true);
      }
    
      else if(count == 4)
      {
        leftLeg.setVisible(true);
      }
    
      else if(count == 5)
      {
        leftArm.setVisible(true);
      }
    
      else if(count == 6)
      {
        rightArm.setVisible(true);
      }
    
      else if(count == 7)
      {
        leftEye.setVisible(true);
      }
    
      else if(count == 8)
      {
        rightEye.setVisible(true);
      } 

      }
            
     }
    }    
    catch(Exception e)
    {
      Alert d = new Alert(AlertType.WARNING, "Please enter a postive number");
       d.setTitle("FATAL ERROR!");
       d.setHeaderText("invalid input");
       d.show();
       return;
    }
}
   
}
