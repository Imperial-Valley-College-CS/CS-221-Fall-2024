import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class App extends Application
{   
   Canvas canvas = new Canvas(600, 400);
   Group g = new Group(canvas);           //Group is-a Parent
   Scene scene = new Scene(g, 600, 400, Color.BLACK);      //Scene needs a Parent
   GraphicsContext gc = canvas.getGraphicsContext2D();
      
   @Override
   public void start(Stage s)
   {      
      drawInvader("crab");      
      s.setScene(scene);
      s.show();
   }
   
   public void drawInvader( String type )
   {
      int x = 50;
      int y = 50;
      Invader v = new Invader(type, x, y);
      gc.setFill( v.getColor() );
      
      boolean[][] invaderBody = v.getBody();
      int size = 10;
      
      for( boolean[] row : invaderBody )
      {
         for( boolean col : row )      //traverses every row
         {
            //System.out.println( col );
            if( col )
            {
               gc.fillRect(x, y, size, size);
            }
            x += size;
         }
         x = 50;         //reset x to beggining of canvas
         y += size;     //move y down
      }
   }
   
}