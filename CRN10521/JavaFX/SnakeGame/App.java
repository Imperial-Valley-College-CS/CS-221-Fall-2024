import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
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
   //Scene needs a Parent
   Scene scene = new Scene(root, Constants.WIDTH, Constants.HEIGHT, Constants.BG_COLOR);
   
   KeyHandler handleKey = new KeyHandler();           //from inner class
   Timer timer = new Timer();                         //from inner class
   
   ArrayList<Block> snake = new ArrayList<>();        //creates an arraylist of blocks
   
   private String direction = "";                     //snake will not move on startup
   
   @Override
   public void start(Stage stage)
   {
      initializeSnake();
      timer.start();
      
      //make keyboard come to live (needs EventHandler<KeyEvent>)
      scene.setOnKeyPressed(handleKey);
      
      //Give Scene to Stage
      stage.setScene(scene);
      stage.show();
   }
   
   private void initializeSnake()
   {  
      for( int dx = 0; dx < Constants.N_BLKS; dx++ )
      {
         Block b = new Block(Constants.START_X-dx*Constants.BLK_SIZE, Constants.START_Y);
         snake.add( b );
      }
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
   
   private void updateSnake()
   {
      Block head = snake.get(0);       //get block at index value 0
      int headX = head.getX();         //get X-coord of head of snake
      int headY = head.getY();         //get Y-coord of head of snake
      
      //update X or Y coord for new head of snake
      switch( this.direction )
      {
         case "UP": headY -= Constants.BLK_SIZE; break;
         case "DOWN": headY += Constants.BLK_SIZE; break;
         case "RIGHT": headX += Constants.BLK_SIZE; break;
         case "LEFT": headX -= Constants.BLK_SIZE; break;
      }
      //create new head (Block)
      Block newHead = new Block(headX, headY);
      //add new head to snake
      snake.add(0, newHead);
      //remove tail (last block) from snake
      snake.remove( snake.size()-1 );
   }
   
   //inner class
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //invoked when key is pressed (KeyEvent)         
      {  
         direction = e.getCode().toString();
      }
   }
   
   //inner class
   class Timer extends AnimationTimer
   {
      //time between frames in nanoseconds
      long dt = 16000000;
      long last = 0;
      @Override
      public void handle(long now)        //invoked on every computational frame
      {
         if( now - last > 3*dt )
         {
            updateSnake();
            drawSnake();
            last = now;
         }
      }
   }
   
}//end App