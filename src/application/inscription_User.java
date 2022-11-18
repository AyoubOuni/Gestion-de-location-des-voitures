package application;

import java.io.IOException;

import Basedonee.UserBasedonnee;
import Oriente_Objet.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class inscription_User {
	private Stage stage;
	private Scene scene;
	private Parent root;


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
    private TextField nom;

    @FXML
    private TextField pr;

    @FXML
    private ToggleGroup sexe;

    @FXML
    private TextField tel;
    
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
    void retour(ActionEvent event) throws IOException {
    	  root = (Parent) FXMLLoader.load(getClass().getResource("Main.fxml"));
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
    
    String g =((Labeled) sexe.getSelectedToggle()).getText();
   
    UserBasedonnee.addUser(new User(a,b,c,e,h,g));
	 root = (Parent) FXMLLoader.load(getClass().getResource("showuser.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.setTitle("Admin");
	  stage.show();

    
   
                   
				
 
     
}
}
