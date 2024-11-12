import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class App extends Application
{
   //opens window to allow for text input
   TextInputDialog textInput = new TextInputDialog("Hi there.");
   //button to press to show TextInputDialog
   Button enterTextBttn = new Button("Press To Enter Text");
   //BoderPane for layout purposes (Parent)
   BorderPane bp = new BorderPane();
   //Give Parent to Scene
   Scene scene = new Scene(bp);
   
   //Create TextInputDialog handler object (is EventHanlder<ActionEvent>)
   TextInputHandler handleTextIn = new TextInputHandler();
   
   public void start(Stage stage)
   {
      //adds button to BorderPane
      bp.setTop( enterTextBttn );      
      //make button come alive (needs EventHandler object)
      enterTextBttn.setOnAction(handleTextIn);
      //add scene to Stage and show Stage
      stage.setScene( scene );
      stage.show();
   }
   
   //inner class
   class TextInputHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)      //invoked when button is pressed (ActionEvent)         
      {  
         textInput.show();    //show TextInputDialog box
         System.out.println( textInput.getContentText() );
      }
   }
}