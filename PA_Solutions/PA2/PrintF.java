package PA2_Variables.src.main.java;

public class PrintF
{
   public static void main(String[] args)
   {         
      String color = "green";
      double weight = 180.8;
      char firstInitial = 'O';
      
      System.out.printf("Favorite Color: %s%nCurrent Weight: %f%nFirst Initial: %c%n",
         color, weight, firstInitial);
   }
}