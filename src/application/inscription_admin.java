package application;

import javafx.scene.Parent;
import javafx.scene.Scene;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


import Basedonee.Adminbasededonnee;
import Oriente_Objet.Admin;
import javafx.scene.Node;


import javafx.scene.control.Labeled;

public class inscription_admin {
	
		private Stage stage;
		private Scene scene;
		private Parent root;

		 @FXML
		    private TextField adresse;

		    @FXML
		    private TextField année;

		    @FXML
		    private TextField cin;

		    @FXML
		    private Button close;

		    @FXML
		    private TextField email;

		    @FXML
		    private RadioButton femme;

		    @FXML
		    private RadioButton homme;

		    @FXML
		    private TextField jour;

		    @FXML
		    private TextField mois;

		    @FXML
		    private TextField nom;

		    @FXML
		    private TextField password;

		    @FXML
		    private TextField pr;

		    @FXML
		    private ToggleGroup sexe;

		    @FXML
		    private TextField tel;
		
			

		    @FXML
		    private TextField question;

		    @FXML
		    private TextField reponse;
	    
	    @FXML
	    void close(ActionEvent event) throws IOException {
	    	root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
	    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	  scene = new Scene(root);
	    	  stage.setScene(scene);
	    	  stage.setTitle("Main");
	    	  stage.show();
	      
	    }
	


	    @FXML
	    void base(ActionEvent event) throws IOException {
	    String a=nom.getText();
		String b=pr.getText();
	    String c=email.getText();
	    String d=tel.getText();
	    int e=Integer.parseInt(d);

	    
	    String f=cin.getText();
	    int h=Integer.parseInt(f);
	   
	   
	    String pass=password.getText();
	    String adress=adresse.getText();
	    String day=jour.getText();
	    String month=mois.getText();
	    String year=année.getText();
	    String date=day+"/"+month+"/"+year;
	    String que=question.getText();
	    String rep=reponse.getText();
	    if(homme.isSelected()) {String g="Homme";
	    Adminbasededonnee.addAdmin(new Admin(a,b,c,e,h,g,pass,adress,date,que,rep));}
	    else {String g="Femme";
	    Adminbasededonnee.addAdmin(new Admin(a,b,c,e,h,g,pass,adress,date,que,rep));}
	  
		
		 root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.setTitle("Admin");
		  stage.show();

	    
	   
	                   
					
	 
	     
	}
	}




