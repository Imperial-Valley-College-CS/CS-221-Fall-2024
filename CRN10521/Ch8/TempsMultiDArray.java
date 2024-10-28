import java.util.Scanner;
import java.io.*;

public class TempsMultiDArray
{
   public static void main(String[] args)
   {
      String file = "TempsHighsTwoWeeks.txt";
      int[][] temps = readData(file);
      int count = tempsBelow( temps, 80 );
      System.out.println( "Temps below 80degF: " + count );
   }//end main
   
   public static int[][] readData( String filename )
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         int[][] temps = new int[2][7];
         int row = 0;
         while( scan.hasNextLine() )
         {
            String[] tokens = scan.nextLine().split(",");
            int col = 0;
            for( String t : tokens )
            {
               temps[row][col] = Integer.parseInt(t.trim());
               col++;
            }
            row++;
         }
         return temps;
      }catch(FileNotFoundException e)
      {
         System.out.println("File not found.");
         return null;
      }
   }//end readData
}//end class