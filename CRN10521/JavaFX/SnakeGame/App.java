import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;

public class App extends Application
{  
   //Group is a Parent
   Group root = new Group();        
   //Scene needs a Parent
   Scene scene = new Scene(root, Constants.WIDTH, Constants.HEIGHT, Constants.BG_COLOR);
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   
   
   
   @Override
   public void start(Stage stage)
   {
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed(handleKey);
      
      //Give Scene to Stage
      stage.setScene(scene);
      stage.show();
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
   
   //inner class
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)        //invoked on every computational frame
      {
         System.out.println( now );       //now is current time (nanoseconds)
      }
   }
   
}//end App