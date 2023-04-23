
import javax.swing.*;
import java.awt.*;

public class JDiagonalLines extends JPanel
{
    public static void main(String[] args)
   {
    JFrame frame = new JFrame();
    frame.add(new JDiagonalLines());
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public JDiagonalLines() 
   {
      setBackground(Color.WHITE);
   }
   

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawRect (20, 20, 420, 420);
      int x = 20;
      int y = 20;
      for (int i = 0; i < 430; i+= 10) 
      {
         g.drawLine(x + i, y , x , y + i);
      }
    x = 440;
    y = 440;
    for (int i = 0; i < 430; i+= 10) {
    g.drawLine(x - i, y , x , y - i);
   }


  }

}

