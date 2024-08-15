public class FormattedPrinting
{
   public static void main(String[] args)
   {
      System.out.print("Color: %s %n FirstI: %c %n");
      System.out.printf("Color: %s %n FirstI: %c %n", "green", 'A');
      System.out.printf("Age: %d %n OnlyChild: %b %n", 36, false);
      System.out.printf("TempF: %10.3f %n Blue Eyes: %b", 110.555, false);
   }
}