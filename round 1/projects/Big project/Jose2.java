public class Jose2
{
   public static void main(String[]args)
   {
      letter_grade(100);
      letter_grade(66);
      letter_grade(52);
      letter_grade(-10);      
   }
   public static void letter_grade(int average)
   {
      if(average < 100)
      {
         System.out.print("a");
      }
     else  if(average < 90)
      {
         System.out.print("B");
      }
      else if(average < 80)
      {
         System.out.print("C");
      }
      else if(average > 70)
      {
         System.out.print("D");
      }
      else 
      {
         System.out.print("F");
      }
   }
}