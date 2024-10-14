import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class Invader
{
   //data fields 
   private boolean[][] body = new boolean[8][12];
   private Color color;
   private String filename = System.getProperty("user.dir") + "/InvaderMatrices/";
   //private Position pos;
   
   public Invader(String type, int x, int y)
   {
      //this.pos = new Position(x,y);
      System.out.println( filename );
      if( type.equals("octopus") )
      {
         this.filename += "OctopusMatrix.txt";
         this.color = Color.rgb(196,22,248);    //purple
      }
   }
   
   public void setBody()
   {
      try
      {
         File f = new File(this.filename);
         Scanner scan = new Scanner(f);
         int i = 0;
         while( scan.hasNextLine() )
         {
            String[] line = scan.nextLine().split(",");
            for( int j = 0; j < line.length; j++ )
            {
               if( line[j].equals("1") )
                  body[i][j] = true;
               else
                  body[i][j] = false;
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