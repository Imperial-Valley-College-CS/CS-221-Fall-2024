public class FormattedPrinting
{
   public static void main(String[] args)
   {
      System.out.printf("color: %s%nfirstI: %c%n", "green", 'A');
      
      String age = String.format("Age: %d", 36);
      System.out.println(age);
      
   }//end main
}//end class