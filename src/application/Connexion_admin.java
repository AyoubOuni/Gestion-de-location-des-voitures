package application;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Client.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Connexion_admin {


private Stage stage;
private Scene scene;
private Parent root;

@FXML
private Text R;

@FXML
private CheckBox ch;

@FXML
private TextField email;

@FXML
private PasswordField motdepasse;

Login loginTHread ;

 
@FXML
private Hyperlink forget;
				

@FXML
void forgetpass(ActionEvent event) throws IOException {

    
	root = (Parent) FXMLLoader.load(getClass().getResource("emailcheck.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.setTitle("Admin");
	  stage.show();
}	
 @FXML
    void close(ActionEvent event) throws IOException {
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	stage.close();
    
    }

    @FXML
    void show(ActionEvent event) throws IOException {
    	if(( email.getText()=="")|( motdepasse.getText()=="")) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("Entrer votre donnée !");

    		alert.showAndWait();
    		 loginTHread.start();
    	}
    	else {
    	System.out.println("l'adresse email :"+email.getText()+"\nle mot de passe:"+motdepasse.getText());}
	
   
     String a=email.getText();    
     String b=motdepasse.getText();
     loginTHread = new Login(a,b);
     
     loginTHread.start();
     try {
		loginTHread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println(loginTHread.isLogged);
     
    	        if(loginTHread.isLogged){
    	        	
    	        
    	        	
    	     
    	                	root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
    	              	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	              	  scene = new Scene(root);
    	              	  stage.setScene(scene);
    	              	  stage.setTitle("Admin");
    	              	  stage.show();
    	    	        	
    	                }else {
    	     
    	                    JOptionPane.showMessageDialog(null,"Mot de passe incorrect ! ","Error",1);
    	                }
    	                
    	          	  
    	        	 
    	                
    	     
    	            
    	        }
    	          
    	    

    	
    	    

    

    	
    
    @FXML
    void afficher(ActionEvent event) {
    	if(ch.isSelected()) {
    	
String a=motdepasse.getText();
R.setText(a);}
    	else {
    		R.setText("");
    	}
    }

 


}
