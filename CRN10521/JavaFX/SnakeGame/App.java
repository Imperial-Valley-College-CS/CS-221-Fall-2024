import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.bgColor);
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      s.setScene( scene );
      s.show();
   }
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
      }
   }
   
   
}//App ends