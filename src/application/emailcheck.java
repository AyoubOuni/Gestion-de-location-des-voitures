package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Basedonee.Adminbasededonnee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class emailcheck {



	private Stage stage;
	private Scene scene;
	private Parent root;
    @FXML
    private TextField cin;
    int r=Integer.parseInt(cin.getText());
	Adminbasededonnee admin = new Adminbasededonnee();


    @FXML
    void annuler(ActionEvent event) throws IOException {
      	root = (Parent) FXMLLoader.load(getClass().getResource("main.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.setTitle("Main");
  	  stage.show();
    
    }
    Alert alert = new Alert(AlertType.INFORMATION);

    @FXML
    void suivant(ActionEvent event) throws IOException {
    	
    	 
    	if(cin.getText()=="") {
    		alert.setTitle("Error");
     		alert.setHeaderText(null);
     		alert.setContentText("Entrer N°CIN!");

     		alert.showAndWait();	
    	}
    	else {
    	 if (admin.existeadminn(r)==true){  
    			root = (Parent) FXMLLoader.load(getClass().getResource("secuirite.fxml"));
    	    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    	  scene = new Scene(root);
    	    	  stage.setScene(scene);
    	    	  stage.setTitle("Main");
    	    	  stage.show();}
    	 else {
 		alert.setTitle("Error");
 		alert.setHeaderText(null);
 		alert.setContentText("cette admin n'existe pas!");

 		alert.showAndWait();}
    	
      
    	}
    	}
	
    }


