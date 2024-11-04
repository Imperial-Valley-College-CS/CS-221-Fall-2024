import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.scene.input.*;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.bgColor);
   KeyHandler handleKey = new KeyHandler();
   MouseHandler handleMouse = new MouseHandler();
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      scene.setOnMouseClicked( handleMouse );   //makes mouse come to live (needs EventHandler<MouseEvent>)
      scene.setOnKeyPressed(handleKey);      //make keyboard come to live (needs EventHandler<KeyEvent>)
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
   
}//App ends