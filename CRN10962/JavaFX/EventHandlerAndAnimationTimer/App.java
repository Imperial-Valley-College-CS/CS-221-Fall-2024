import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;
import javafx.scene.media.*;
import javafx.scene.control.Button;

public class App extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g, Constants.WIDTH, Constants.HEIGHT, Constants.BG_COLOR);
   Button okBttn = new Button("OK");
   Button noBttn = new Button("NO");
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   MouseHandler handleMouse = new MouseHandler();     //from inner class
   ButtonHandler handleBttn = new ButtonHandler();     //from inner class
   Timer timer = new Timer();                         //from inner class
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      //add button to group
      g.getChildren().add( okBttn );
      g.getChildren().add( noBttn );
      //make button come to live (setOnAction needs an EventHandler<ActionEvent>)
      okBttn.setOnAction(handleBttn);          
      noBttn.setOnAction(handleBttn);      
      //invokes handle method (in Timer class) on every computational frame
      //timer.start();       
      //makes mouse come to live (needs EventHandler<MouseEvent>)                     
      scene.setOnMouseClicked( handleMouse );   
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed( handleKey );      
      
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
   class ButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)      //invoked when button is pressed (ActionEvent)         
      {  
         Button pressedButton = (Button)e.getSource();
         System.out.println( pressedButton.getText() );
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
   
}//App ends