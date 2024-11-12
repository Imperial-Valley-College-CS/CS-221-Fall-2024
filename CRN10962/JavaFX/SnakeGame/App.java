import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.*;
import java.util.ArrayList;

public class App extends Application
{
   //Canvas is a Node
   Canvas canvas = new Canvas( Constants.WIDTH, Constants.HEIGHT );
   GraphicsContext gc = canvas.getGraphicsContext2D();
   //Group is a Parent
   Group root = new Group(canvas);
   Scene scene = new Scene(root, Constants.WIDTH, Constants.HEIGHT, Constants.BG_COLOR);
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   Timer timer = new Timer();                         //from inner class
   
   ArrayList<Block> snake = new ArrayList<>();        //creates an arraylist of blocks   
   String direction = "";
   
   @Override
   public void start(Stage stage)
   {
      initializeSnake();
      timer.start();             //invokes handle method in Timer class
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed(handleKey);    
      
      stage.setScene(scene);
      stage.show();
   }//end start method
   
   private void initializeSnake()
   {  
      for( int dx = 0; dx < Constants.N_BLKS; dx++ )
      {
         Block b = new Block(Constants.START_X-dx*Constants.BLK_SIZE, Constants.START_Y);
         snake.add( b );
      }
   }
   
   private void updateSnake()
   {
      Block head = snake.get(0);       //returns fist block in arraylist
      int x = head.getX();
      int y = head.getY();
      switch( direction )
      {
         case "UP": y -= Constants.BLK_SIZE; break;
         case "DOWN": y += Constants.BLK_SIZE; break;
         case "RIGHT": x += Constants.BLK_SIZE; break;
         case "LEFT": x -= Constants.BLK_SIZE; break;
      }
      Block newHead = new Block(x,y);
      snake.add(0, newHead);                 //add new head at index 0
      snake.remove( snake.size()-1 );        //remove tail of snake
   }
   
   private void drawSnake()
   {  
      //paint entire background black (BG_COLOR)
      gc.setFill( Constants.BG_COLOR );
      gc.fillRect( 0, 0, Constants.WIDTH, Constants.HEIGHT);
      
      //specify color of snake
      gc.setFill( Constants.BLK_COLOR );
      for( Block b : snake )
      {
         //draw every block in snake
         gc.fillRect( b.getX(), b.getY(), Constants.BLK_SIZE, Constants.BLK_SIZE);   
      }
   }
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //invoked when key is pressed (KeyEvent)         
      {  
         direction = e.getCode().toString();    //assign text from key to direction
      }
   }
   
   //inner class
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)        //invoked on every computational frame
      {
         updateSnake();
         drawSnake();
      }
   }
   
}//end App class