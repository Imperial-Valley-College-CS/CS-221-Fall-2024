import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.bgColor);
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   MouseHandler handleMouse = new MouseHandler();     //from inner class
   Timer timer = new Timer();                         //from inner class
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      //invokes handle method (in Timer class) on every computational frame
      timer.start();       
      //makes mouse come to live (needs EventHandler<MouseEvent>)                     
      scene.setOnMouseClicked( handleMouse );   
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed(handleKey);      
      
      //add scene to Stage and show Stage
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
   
   //inner class
   class MouseHandler implements EventHandler<MouseEvent>
   {
      @Override
      public void handle(MouseEvent e)      //invoked when mouse is activated (MouseEvent)        
      {
         System.out.flush();
         System.out.println( "X: " + e.getSceneX() + ", Y: " + e.getSceneY());
      }
   }
   
   //inner class
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)
      {
         System.out.println( now );       //now is current time (nanoseconds)
      }
   }
   
}//App ends