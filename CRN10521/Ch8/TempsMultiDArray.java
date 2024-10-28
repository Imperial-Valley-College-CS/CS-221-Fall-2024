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
      double avg = averageTemp( temps, 0);
      System.out.printf( "Average temp for week 0: %.1f", avg );
   }//end main
   
   public static double averageTemp( int[][] arr, int row )
   {
      double sum = 0;
      for( int x : arr[row] )
         sum += x;
      return sum/arr[row].length;
   }//end averageTemp
   
   public static int tempsBelow( int[][] arr, int val )
   {
      int count = 0;
      for( int i = 0; i < arr.length; i++ )
      {
         for( int j = 0; j < arr[i].length; j++ )
         {
            if( arr[i][j] < val )
               count++;
         }
      }
      
      // for( int[] row : arr )
//          for( int x : row )
//             if( x < val )
//                count++;
      return count;
   }//end tempsBelow
   
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