import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.*;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.BG_COLOR);
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   
   @Override
   public void start(Stage stage)
   {
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed(handleKey);    
      
      stage.setScene(scene);
      stage.show();
   }//end start method
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //invoked when key is pressed (KeyEvent)         
      {  
         System.out.println( e.getCode().toString() );
      }
   }
   
}//end App class