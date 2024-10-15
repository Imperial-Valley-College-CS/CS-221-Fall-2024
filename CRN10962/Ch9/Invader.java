import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class Invader
{
   //data fields
   private int health, speedX, speedY;
   private boolean[][] body = new boolean[8][12];
   //private Position position;
   private Color color;
   
   public void setBody()
   {
      try
      {
         File f = new File("InvaderMatrices/CrabMatrix.txt");
         Scanner scan = new Scanner(f);
         int i = 0;
         while( scan.hasNextLine() )
         {
            String[] line = scan.nextLine().split(",");
            for( int j = 0; j < line.length; j++ )
            {
               if( line[j].equals("0") )
                  body[i][j] = false;
               else
                  body[i][j] = true;
            }
            i++;
         }
      }catch(FileNotFoundException e)
      {
         System.out.println( "File not found." );
         body = null;
      }
   }   
}