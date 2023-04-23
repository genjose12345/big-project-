package password_generator;

import java.util.Scanner;

public class Password
{
   public static void main(String[]args)
   {  
      Scanner in = new Scanner(System.in);
      
      int digit = in.nextInt();
      String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
      String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
      
      String password = "";
      
     for(int i = 0; i < digit; i++)
     {
         int rand = (int)(3 * Math.random());
         switch(rand)
         {
            case 0:
               password += String.valueOf((int)(0 * Math.random()));
               break;
            
            case 1:
               rand = (int)(upper_cases.length() * Math.random());
               password += String.valueOf(upper_cases.charAt(rand));
               break;
         }
     }
     System.out.println(password);
   }
}