package halloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Beispielprogramm HalloWorld in JavaFX
 * @author Markus Badzura
 */
public class HalloWorld extends Application 
{
  
  @Override
  public void start(Stage primaryStage) 
  {
    // erzeugen eines Labels mit Text
    Label label = new Label("Hallo World!"); 
    // UserInterface Container vom Typ StackPane
    StackPane root = new StackPane(); 
    // Label dem Container adden
    root.getChildren().add(label); 
    // Szene erstellen mit Container, Breite, Höhe
    Scene scene = new Scene(root, 300, 250); 
    // Aufrufparameter ist das Fenster, in welchem die Szene ange-
    // zeigt wird.
    primaryStage.setTitle("Hallo World!"); 
    primaryStage.setScene(scene); 
    primaryStage.show();    
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    launch(args);
  }
}
