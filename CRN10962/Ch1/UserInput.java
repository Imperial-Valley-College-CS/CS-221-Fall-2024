import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How old are you? ");
      int yourAge = scan.nextInt();
      
      System.out.print("How hot is it outside? ");
      double tempF = scan.nextDouble();
      
      System.out.println("Temperature outside is " + tempF + " degrees Fahrenheit");
      System.out.println("You are " + yourAge + " years old.");
   }
}