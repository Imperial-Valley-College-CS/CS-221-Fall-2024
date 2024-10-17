import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class App extends Application
{
   Canvas canvas = new Canvas(600, 400);
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   @Override
   public void start(Stage s)
   {
      drawInvader("squid");
      s.setScene(scene);
      s.show();
   }
   
   public void drawInvader(String type)
   {
      int x = 50;
      int y = 50;       
      int size = 10;    //every square will be 10x10
      Invader vader = new Invader(type, x, y);
      boolean[][] body = vader.getBody();
      
      gc.setFill(vader.getColor());
      
      for( boolean[] row : body )
      {
         for( boolean col : row )
         {
            if( col )
               gc.fillRect(x,y,size,size);
               
            x += size;
         }
         x = 50;
         y += size;
      }
   }
}