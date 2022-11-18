package application;

import java.awt.Label;
import java.io.IOException;

import Basedonee.Adminbasededonnee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Secuirite {
	@FXML
    private RadioButton email;

    @FXML
    private RadioButton question;

    @FXML
    private ToggleGroup secuirite;
	   
private Stage stage;
private Scene scene;
private Parent root;

@FXML
private Label text;
Adminbasededonnee admin = new Adminbasededonnee();
emailcheck e=new emailcheck();
@FXML
void precedent2(ActionEvent event) throws IOException {
	root = (Parent) FXMLLoader.load(getClass().getResource("secuirite.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.setTitle("Admin");
	  stage.show();
}


@FXML
void suivant2(ActionEvent event) throws IOException {
	root = (Parent) FXMLLoader.load(getClass().getResource("newpassword.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.setTitle("Admin");
	  stage.show();

}
    @FXML
    void retourner(ActionEvent event) throws IOException {

    	root = (Parent) FXMLLoader.load(getClass().getResource("emailcheck.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.setTitle("Admin");
    	  stage.show();
    
    }
    @FXML
    void suivant(ActionEvent event) throws IOException {
    if (question.isSelected()) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Error");
 		alert.setHeaderText(null);
 		alert.setContentText(admin.getquestion(e.r));

 		alert.showAndWait();
    			root = (Parent) FXMLLoader.load(getClass().getResource("questionsecuirite.fxml"));
    	    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    	  scene = new Scene(root);
    	    	  stage.setScene(scene);
    	    	  stage.setTitle("Admin");
    	    	  stage.show();
    	    	
    }
    else if (email.isSelected()) {
		root = (Parent) FXMLLoader.load(getClass().getResource("emailtest.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.setTitle("Admin");
  	  stage.show();
}
    	 
    	
    }

}