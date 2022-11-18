package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.Labeled;

import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;

import java.io.IOException;





import Basedonee.CarBaseDonee;
import Oriente_Objet.Car;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class inscription_car extends Connexion_admin {


private Stage stage;
private Scene scene;
private Parent root;
   

@FXML
private TextField annee;

@FXML
private RadioButton auto;

@FXML
private ToggleGroup boite;

@FXML
private ToggleGroup energie;

@FXML
private RadioButton essence;

@FXML
private RadioButton gazole;

@FXML
private Button imag;

@FXML
private TextField immat;

@FXML
private RadioButton manuelle;

@FXML
private TextField marque;

@FXML
private TextField modele;

@FXML
private ToggleGroup puissance;
@FXML
private TextField immat1;



    @FXML
    void close(ActionEvent event) throws IOException {
   	 root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.setTitle("Admin");
  	  stage.show();
    }

  
    @FXML
    void add(ActionEvent event) throws IOException {
    	

  
	String a=marque.getText();
     
	String b=modele.getText();
   
     String c=annee.getText();
     
     String d=immat.getText();
     String p=immat1.getText();
    String u=d+"TN"+p;
   
     String e=((Labeled) energie.getSelectedToggle()).getText();
     String f =((Labeled) boite.getSelectedToggle()).getText();
     String g =((Labeled) puissance.getSelectedToggle()).getText();
     Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Error");
		alert.setHeaderText(null);
		alert.setContentText(u);
    	            
                    CarBaseDonee.addCar(new Car(a,b,c,u,e,f,g));
					
					 root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
				  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  	  scene = new Scene(root);
				  	  stage.setScene(scene);
				  	  stage.setTitle("Main");
				  	  stage.show();
					 
				

    }



}



