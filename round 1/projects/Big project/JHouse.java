import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class JHouse extends JFrame
{
   Container con = getContentPane();
   DrawCanvas canvas;
   public static void main(String[]args)
   {
      JHouse frame = new JHouse();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public JHouse()
   {
      con.setLayout(new BorderLayout());      
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(300,300));    
      con.add(canvas,"Center");
       }
   class DrawCanvas extends JPanel
   {
      public void paint (Graphics graphics)
      {
         setBackground (Color.cyan);
   
         graphics.setColor (Color.green);
         graphics.fillRect (0, 200, 400, 50); 
   
         graphics.setColor (Color.blue);
         graphics.fillRect (50, 125, 300, 100); 
   
         graphics.setColor (Color.pink);
         graphics.fillRect (180, 175, 40, 50); 
   
         graphics.setColor (Color.yellow);
         graphics.fillRect (100, 155, 40, 25); 
         graphics.fillRect (260, 155, 40, 25); 
   
         graphics.setColor (Color.black);
         graphics.fillRect (40, 100, 320, 40); 
         graphics.fillOval (210, 200, 6, 6); 
   
         graphics.setColor (Color.red);
         graphics.fillRect (80, 80, 20, 40); 
      
         graphics.setColor (Color.gray);
         graphics.fillOval (80, 60, 20, 20); 
         graphics.fillOval (85, 50, 15, 25); 
         graphics.fillOval (90, 45, 15, 20); 
         
         graphics.setColor (Color.white);
         graphics.fillOval (200, 30, 80, 40); 
         graphics.fillOval (230, 40, 80, 40); 

         graphics.setColor(Color.yellow);
         graphics.fillOval(240,30,50,50);
         }
      }
   }