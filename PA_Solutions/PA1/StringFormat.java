package PA1_Print.src.main.java;

public class StringFormat
{
   public static void main(String[] args)
   {
      String someStr = String.format("Favorite Color: %s%nCurrent Weight: %.1f%nFirst Initial: %c%n",
         "green", 180.8, 'O');
         
      System.out.print( someStr );
   }
}