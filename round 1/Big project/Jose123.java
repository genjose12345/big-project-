public class Jose123
{
   public static void main(String []args)
   {
      int val = 0;
      int num = 0;
      do
      {
         num ++; 
         val = val + num;
         if(val>4)
         {
            break;
         }
      }
      while(num < 5);
      System.out.print(val);
   }
   
}