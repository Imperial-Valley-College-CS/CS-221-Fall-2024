import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      //Create Scanner object to allow for user input
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How old are you? ");
      int yourAge = scan.nextInt();          //allows for user input
      
      System.out.print("You are an only child (true/false): ");
      boolean onlyChild = scan.nextBoolean();
      scan.nextLine();                       //eats the leftover \n\r from pressing the Enter key
      
      System.out.print("What's your name? ");
      String yourName = scan.nextLine();
      
      System.out.println("Name: " + yourName);
      System.out.println("You are " + yourAge + " years old.");
      System.out.println("Only child: " + onlyChild);      
   }
}