import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class App extends Application
{
   BorderPane bp = new BorderPane();
   Scene scene = new Scene(bp);
   GridPane grid = new GridPane();
   Button[] buttons = new Button[11];
   Label display = new Label("");
   ButtonHandler handleBttn = new ButtonHandler();     //from inner class
   
   
   //must override inherited abstract methods
   @Override
   public void start(Stage s)
   {
      createButtons();
      addButtonsToGrid();
      bp.setCenter( grid );
      bp.setTop( display );
      s.setScene( scene );
      s.show();
   }
   
   private void createButtons()
   {      
      for( int i = 0; i < 10; i++ )
      {
         buttons[i] = new Button(""+i);
         buttons[i].setOnAction( handleBttn );
      }
      buttons[10] = new Button(".");
      buttons[10].setOnAction( handleBttn );
   }
   
   private void addButtonsToGrid()
   {
      int i = 9;
      for(int row = 0; row < 3; row++)
      {
         for( int col = 0; col < 3; col++ )
         {
            grid.add( buttons[i], col, row );
            i--;
         }
      }
   }
   
   //inner class
   class ButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)      //invoked when button is pressed (ActionEvent)         
      {           
         Button pressedButton = (Button)e.getSource();
         String bttnText = pressedButton.getText();
         switch( bttnText )
         {
            case "+":
            case "-":
            case "/":
            case "*":
            default:
               String text = display.getText();
               text += bttnText;
               display.setText( text );
         }
      }
   }

}