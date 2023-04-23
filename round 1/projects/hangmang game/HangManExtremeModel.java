import javafx.fxml.FXML;
import java.util.concurrent.ThreadLocalRandom;
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
import java.util.ArrayList;
import java.nio.file.*;

public class HangManExtremeModel
{  
   private String word;
   
    public HangManExtremeModel()
    {
      this.word = ChoseWord();
    }
    public String getWord()
    {
      return word;
    }
    
   public static String ChoseWord()
   {
     String word = "";   
     String name;
     String line;
     ArrayList<String> correctWords = new ArrayList<String>();   
     String correctletters;
         try
    {
         File f = new File("Words.txt");
         Scanner in = new Scanner(f);
         while(in.hasNext())
         {
            line = in.nextLine();
            correctWords.add(line);     
         }
         in.close();
         int randomNum = ThreadLocalRandom.current().nextInt(1, correctWords.size() + 1);
         word = correctWords.get(randomNum);            
    }    
    catch(IOException e) 
    {
     /*Alert b = new Alert(AlertType.WARNING, "Sorry you are missing the List of worlds in your files");
       b.setTitle("FATAL ERROR!");
       b.setHeaderText("File missing");
       b.show();
       */
       //System.out.println("hi");       
    }    
        return word;
    
   }
   
  
}