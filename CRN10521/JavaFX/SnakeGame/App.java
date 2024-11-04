import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.bgColor);
   KeyHandler handleKey = new KeyHandler();
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      scene.setOnKeyPressed(handleKey);      //make keyboard come to live (needs EventHandler)
      s.setScene( scene );
      s.show();
   }
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //invoked when key is pressed (KeyEvent)         
      {
         System.out.println( e.getCode().toString() );
      }
   }
   
   
}//App ends