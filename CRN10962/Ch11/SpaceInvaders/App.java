import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class App extends Application
{
   Canvas canvas = new Canvas(400, 600);
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   @Override
   public void start(Stage s)
   {
      gc.setFill(Color.rgb(25,172,167));
      gc.fillRect(50,50,100,100);
      s.setScene(scene);
      s.show();
   }
}