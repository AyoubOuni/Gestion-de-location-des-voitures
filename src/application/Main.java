package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
 

 public void start(Stage stage) {
  try {

   
   Parent root = (Parent) FXMLLoader.load(getClass().getResource("Main.fxml"));
   Scene scene = new Scene(root);
   stage.setScene(scene);
   stage.setResizable(false);
   stage.setTitle("main");
   stage.show();
  


   
  } catch(Exception e) {
   e.printStackTrace();
  }
 } 

 public static void main(String[] args) {
  launch(args);
 
 }
}