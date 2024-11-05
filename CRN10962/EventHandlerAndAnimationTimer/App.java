import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.SCN_COLOR);
   
   @Override
   public void start(Stage stage)
   {
      scene.setOnKeyPressed();         //makes keyboard come alive
      stage.setScene(scene);
      stage.show();
   }//end start method
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
      }
   }
   
}//end App class