package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class secuiriteemail {

    	private Stage stage;
    	private Scene scene;
    	private Parent root;


    	    @FXML
    	    void precedent(ActionEvent event) throws IOException {

    	    	root = (Parent) FXMLLoader.load(getClass().getResource("secuirite.fxml"));
    	    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    	  scene = new Scene(root);
    	    	  stage.setScene(scene);
    	    	  stage.setTitle("Admin");
    	    	  stage.show();
    	    
    }
    	    @FXML
    	    void suivant(ActionEvent event) throws IOException {
    	    	root = (Parent) FXMLLoader.load(getClass().getResource("newpassword.fxml"));
    	  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  	  scene = new Scene(root);
    	  	  stage.setScene(scene);
    	  	  stage.setTitle("Admin");
    	  	  stage.show();
    	}
    	   

}
