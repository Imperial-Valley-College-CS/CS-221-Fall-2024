import java.util.Scanner;
import java.io.*;

public class TempsMultiDArray
{
   public static void main(String[] args)
   {
      String file = "TempsHighsTwoWeeks.txt";
      int[][] temps = readData(file);
   }//end main
   
   public static int[][] readData( String filename )
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         int[][] temps = new int[2][7];
         while( scan.hasNextLine() )
         {
            System.out.println(scan.nextLine());
         }
         return temps;
      }catch(FileNotFoundException e)
      {
         System.out.println("File not found.");
         return null;
      }
   }//end readData
}//end class