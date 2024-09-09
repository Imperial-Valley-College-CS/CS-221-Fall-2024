import java.util.Scanner;  //1

public class CalculateGPAWeighted   //2
{
   public static void main(String[] args)    //3
   {
      Scanner scan = new Scanner(System.in);    //4
      System.out.print("How many classes are you taking? ");   //5
      int numClasses = scan.nextInt();    //6
      scan.nextLine();                    //eats left over \r\n from previous scan
      
      double gp = 0.0;     //6a
      
      for( int x = 0; x < numClasses; x++ )     //7
      {
         System.out.print("Name: ");       //8
         String name = scan.nextLine().toUpperCase();      //9
         System.out.print("Grade: ");      //10
         char grade = scan.next().toUpperCase().charAt(0); //11
         scan.nextLine();                    //eats left over \r\n from previous scan
         
         switch( grade )      //12
         {
            case 'A': gp += 4.0; break;
            case 'B': gp += 3.0; break;
            case 'C': gp += 2.0; break;
            case 'D': gp += 1.0; break;
            default:
         }
         
         String apSpace = name.substring(0, 3);    //13
         if( apSpace.equals("AP ") && ( grade == 'A' || grade == 'B') )    //14
         {
            gp += 1.0;     //15
         }
      }//end for
      
      double gpa = gp/numClasses;                  //16
      System.out.println("Current GPA: " + gpa);   //17
      
   }//end main
}//end class