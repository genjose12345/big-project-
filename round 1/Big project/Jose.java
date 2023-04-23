public class Jose
{
   public static void main(String[]args)
   {
   a(1);
   a(3);
   a(0);
   a(7);
   a(8);
   }
      public static void  a(int x) 
      {
        
        if(x != 3)
        {
         System.out.println("a");
        }
        if(x == 7)
        {
         System.out.println("b");
        }
        if (2 * x > 7)
        {
         System.out.println("c");
        }
      }
}