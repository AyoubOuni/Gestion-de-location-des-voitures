package application;




import java.io.IOException;

import java.util.List;


import Basedonee.Adminbasededonnee;
import Basedonee.CarBaseDonee;
import Basedonee.CarlouerBasededonnee;
import Basedonee.UserBasedonnee;
import Oriente_Objet.Admin;
import Oriente_Objet.Car;
import Oriente_Objet.User;
import Oriente_Objet.voiturelouer;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



import javafx.stage.Stage;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;





public class Open_Admin_account  {
	 
	   

	    
Label ques =new Label("Question de secuirite");
	
	TextField quest1=new TextField();
Label rep =new Label("Reponse");
	
	TextField rep1=new TextField();
	TextField annee=new TextField();
	Label imm =new Label("Immatricule de voiture");
	
	TextField imm1=new TextField();
	TextField imm2=new TextField();
	Label tn=new Label("تونس");
 	
	Label cin_us =new Label("N°Cin de user");

	TextField cinus=new TextField();
	Label datedebut =new Label("debut de location");

	TextField jour=new TextField();
	Label datefin =new Label("fin de location");
	
	TextField jourfin=new TextField();

	TextField moisfin=new TextField();

	TextField anneefin=new TextField();
	TextField mois=new TextField();
	//Carrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
Label marque1 =new Label("Marque de voiture");
	
	TextField marquee=new TextField();
	Label modele1 =new Label("Modele de voiture");

	TextField modelee=new TextField();
	Label année1 =new Label("Année de voiture");

	TextField annéee=new TextField();
	Label imma =new Label("N°immatricule de voiture");
	
	TextField ima=new TextField();
	Label puissance1 =new Label("Puissance");

	TextField puissancee=new TextField();
	Label energie1 =new Label("Energie de voiture");
	
	TextField energiee=new TextField();
Label boite1 =new Label("Type de boite de voiture");
	
	TextField boitee=new TextField();

	//Adminnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
	Label nom_admin =new Label("Nom d'admin");
	
	TextField nomadmin=new TextField();
	Label prenom_admin =new Label("Prenom d'admin");

	TextField prenomadmin=new TextField();
	Label email_admin =new Label("Email d'admin");

	TextField emailadmin=new TextField();
	Label ncin_admin =new Label("N°Cin d'admin");
	
	TextField ncinadmin=new TextField();
	Label tel_admin =new Label("N°Tel d'admin");

	TextField teladmin=new TextField();
	Label sexee_admin =new Label("Sexe d'admin");
	
	TextField sexeeadmin=new TextField();
Label password_admin =new Label("Password d'admin");
	
	TextField passwordadmin=new TextField();
Label adresse_admin =new Label("Adresse d'admin");
	
	TextField adresseadmin=new TextField();
Label date_admin =new Label("Date de nissance");
	
	TextField dateadmin=new TextField();
	//Userrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
	Label nom_user =new Label("Nom d'utilisateur");
	
	TextField nomuser=new TextField();
	Label prenom_user =new Label("Prenom d'utilisateur");

	TextField prenomuser=new TextField();
	Label email_user =new Label("Email d'utilisateur");

	TextField emailuser=new TextField();
	Label ncin_user =new Label("N°Cin d'utilisateur");
	
	TextField ncinuser=new TextField();
	Label tel_user =new Label("N°Tel d'utilisateur");

	TextField teluser=new TextField();
	Label sexee_user =new Label("Sexe d'utilisateur");
	
	TextField sexeeuser=new TextField();

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


	 Stage stageUser;
	 Stage stagecar;
	 Stage primaryStage;
 	private TableView<User> table;
 	UserBasedonnee user = new UserBasedonnee();
 	List<User> userList;
 	CarBaseDonee car = new CarBaseDonee();
 	List<Car> carlist;
	private TableView<Car> tablecar;
	 Stage stageadmin;
	 	private TableView<Admin> tableadmin;
	 	Adminbasededonnee admin = new Adminbasededonnee();
	 	List<Admin> adminlist;
	 	CarlouerBasededonnee ca=new CarlouerBasededonnee();
	 	private TableView<voiturelouer> tablelouer;
	
	 	List<voiturelouer> louerList;

	 	 @SuppressWarnings({ "unchecked", "rawtypes" })
	
	    
	  @FXML
	    void logout(ActionEvent event) throws IOException {
	  	  root = (Parent) FXMLLoader.load(getClass().getResource("Main.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.setTitle("Main");
		  stage.show();
	    }

	    @FXML
	    void adduser(ActionEvent event) throws IOException {
	   	  root = (Parent) FXMLLoader.load(getClass().getResource("Adduser.fxml"));
	  		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		  scene = new Scene(root);
	  		  stage.setScene(scene);
	  		  stage.setTitle("Add_User");
	  		  stage.show();
	  	    }
	    @FXML
	    void addadmin(ActionEvent event) throws IOException {
	     	 root = (Parent) FXMLLoader.load(getClass().getResource("addadmin.fxml"));
	      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	      	  scene = new Scene(root);
	      	  stage.setScene(scene);
	      	  stage.setTitle("Add_Admin");
	      	  stage.show();
	       
	    }

	    
	 


	    
	    @FXML
	    void addcar(ActionEvent event) throws IOException {
	      	 root = (Parent) FXMLLoader.load(getClass().getResource("Addcar.fxml"));
	      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	      	  scene = new Scene(root);
	      	  stage.setScene(scene);
	      	  stage.setTitle("Add_Car");
	      	  stage.show();
	       
	    }

	
	  
		
	   
		@FXML
	    void showuser(ActionEvent event) throws IOException {
	    	
	    	Button valider =new Button("Valider");
    		Button annuler =new Button("Annuler") ;
    		Stage stagemodifier;
    		stagemodifier = new Stage();
	    	stageUser = new Stage();
	    		userList = user.getUser();
	    		ObservableList<User> etdData = FXCollections.observableArrayList(userList);
	    		table = new TableView<User>();
	    		TableColumn<User,String> nom = new TableColumn<User,String>("Nom");
	    		TableColumn<User,String> prenom = new TableColumn<User,String>("Prenom");
	    		TableColumn<User,String> email = new TableColumn<User,String>("Email");  
	    		TableColumn<User,Integer> tel = new TableColumn<User,Integer>("Tel");
	    		TableColumn<User,Integer> cin = new TableColumn<User,Integer>("Cin"); 
	    		TableColumn<User,String> sexe = new TableColumn<User,String>("Sexe"); 
	    		
	    		// Definir comment remplir une case de donnï¿½e
	    		nom.setCellValueFactory(new PropertyValueFactory<User,String>("nom"));
	    		prenom.setCellValueFactory(new PropertyValueFactory<User,String>("prenom"));
	    		email.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
	    		tel.setCellValueFactory(new PropertyValueFactory<User,Integer>("tel"));
	    		cin.setCellValueFactory(new PropertyValueFactory<User,Integer>("cin"));
	    		sexe.setCellValueFactory(new PropertyValueFactory<User,String>("sexe"));
	    		// Trier selon la colonne ID
	    		table.setItems(etdData);
	    		table.refresh();
	    	
	    		table.getColumns().addAll(nom,prenom,email,tel,cin,sexe);
	    	
	    		Button modifier =new Button("Modifier");
	    		Button recherche =new Button("Recherche") ;
	    		Button supprimer =new Button("Supprimer") ;
	    		Button refresh =new Button("Refresh") ;
	    	BorderPane root3=new BorderPane();
	    	VBox pALLEtds = new VBox();
	    	VBox tous = new VBox();
    		HBox remplir = new HBox();
    		HBox btn=new HBox();
    		RadioButton homme =	new RadioButton("Homme");
    		RadioButton femme =	new RadioButton("Femme");
    		RadioButton toute =	new RadioButton("Tous");
    		ToggleGroup group = new ToggleGroup();
    		homme.setToggleGroup(group);
    		femme.setToggleGroup(group);
    		toute.setToggleGroup(group);
    		HBox choix=new HBox();
    		choix.getChildren().addAll(homme,femme,toute);
	    	
	    		Label cin_user =new Label("N°Cin d'utilisateur");
	    		cin_user.setStyle("-fx-font-weight: bold");
	    		cin_user.setTextFill(Color.BLUE);
	    		TextField cinuser=new TextField();
	    		
	    		pALLEtds.getChildren().add(table);
	    	
	    	    recherche.setOnAction(e->{
	    	    	if(cinuser.getText()=="") {
	    	    	    
	    	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    	    		alert.setTitle("Error");
	    	    
	    	    		alert.setContentText("Entrer le numero de carte d'identite de user !");
	    	    		alert.setHeaderText(null);
	    	    		alert.showAndWait();
	    	    	}
	    	    	
	    	    	else {if(user.existeuser(Integer.parseInt(cinuser.getText()))==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    	    		alert.setTitle("Error");
    	    		alert.setHeaderText(null);
    	    		alert.setContentText("Cette User n'existe pas !");

    	    		alert.showAndWait();}
	    	    	else {
	    	    	table.refresh();
	    	    	userList = user.getsingleUser(Integer.parseInt(cinuser.getText()));
	    				ObservableList<User> et = FXCollections.observableArrayList(userList);
	    				table.setItems(et);
	    			
	    				table.refresh();}
	    	    	}
	    	    });  
	    	    homme.setOnAction(e->{
	    	    	table.refresh();
	     	    	userList = user.getuserhomme();
	     				ObservableList<User> c = FXCollections.observableArrayList(userList);
	     				table.setItems(c);
	     				table.refresh();  }); 
	    	    femme.setOnAction(e->{
	    	    	table.refresh();
	     	    	userList = user.getuserfemme();
	     				ObservableList<User> c = FXCollections.observableArrayList(userList);
	     				table.setItems(c);
	     				table.refresh();  });
	    	    toute.setOnAction(e->{
	    	    	userList = user.getUser();
		    		ObservableList<User> userData = FXCollections.observableArrayList(userList);
		    		table.setItems(userData);
	    	    	table.refresh();  
	    	    	cinuser.setText("");  });
	    	    
	    	    supprimer.setOnAction(e->{
	    	    	if(cinuser.getText()=="") {
	    	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    	    		alert.setTitle("Error");
	    	    		alert.setHeaderText(null);
	    	    		alert.setContentText("Entrer le numero de carte d'identite de user !");

	    	    		alert.showAndWait();
	    	    	    
	    	    	}
	    	    	else {if(user.existeuser(Integer.parseInt(cinuser.getText()))==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    	    		alert.setTitle("Error");
    	    		alert.setHeaderText(null);
    	    		alert.setContentText("Cette User n'existe pas !");

    	    		alert.showAndWait();}
	    	    	else {
	    	    	table.refresh();
	    	    	user.deleteUser(Integer.parseInt(cinuser.getText()));
	    				table.refresh();
	    				userList = user.getUser();
			    		ObservableList<User> userData = FXCollections.observableArrayList(userList);
			    		table.setItems(userData);
		    	    	table.refresh();  
		    	    	cinuser.setText("");
	    	    	}}
	    	    });  
	    	    refresh.setOnAction(e->{
	    	    	userList = user.getUser();
		    		ObservableList<User> userData = FXCollections.observableArrayList(userList);
		    		table.setItems(userData);
	    	    	table.refresh();  
	    	    	cinuser.setText("");
	    	    	toute.setSelected(true);
	    	    });  
	    	    modifier.setOnAction(e->{
	    	    	if(cinuser.getText()=="") {
	    	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    	    		alert.setTitle("Error");
	    	    		alert.setHeaderText(null);
	    	    		alert.setContentText("Entrer le numero de carte d'identite de user !");

	    	    		alert.showAndWait();
	    	    	    
	    	    	}else {if(user.existeuser(Integer.parseInt(cinuser.getText()))==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    	    		alert.setTitle("Error");
    	    		alert.setHeaderText(null);
    	    		alert.setContentText("Cette User n'existe pas !");

    	    		alert.showAndWait();}
	    	    	
	    	    	else {	    
		    		VBox update = new VBox();
		    		HBox nom1=new HBox();
		    		nom1.getChildren().addAll(nom_user,nomuser);
		    		HBox prenom1=new HBox();
		    		prenom1.getChildren().addAll(prenom_user,prenomuser);
		    		HBox email1=new HBox();
		    		email1.getChildren().addAll(email_user,emailuser);
		    		HBox cin1=new HBox();
		    		cin1.getChildren().addAll(ncin_user,ncinuser);
		    		HBox tel1=new HBox();
		    		tel1.getChildren().addAll(tel_user,teluser);
		    		HBox sexe1=new HBox();
		    		sexe1.getChildren().addAll(sexee_user,sexeeuser);
		    		
		    		HBox btn1 =new HBox();
		    		btn1.getChildren().addAll(valider,annuler);
		    		update.getChildren().addAll(nom1,prenom1,email1,cin1,tel1,sexe1,btn1);
		    		update.setPadding(new javafx.geometry.Insets(15,20,15,29));
		    		nom1.setSpacing(25);
		    		prenom1.setSpacing(12);
		    		email1.setSpacing(25);
		    		cin1.setSpacing(25);
		    		tel1.setSpacing(25);
		    		sexe1.setSpacing(30);
		    		update.setSpacing(30);
		    		btn1.setSpacing(20);
		    		btn1.setPadding(new javafx.geometry.Insets(15,0,15,22));
		    		valider.setMinWidth(110);
		    		annuler.setMinWidth(110);
		    	
			
		    		
		    		
		    		
		    	
	    	    	BorderPane root8=new BorderPane();
	    	    	root8.setTop(update);
	    	    	Scene sceneALLEN = new Scene(root8,350,420);
	    	    	if(cinuser.getText()=="") {
						 nomuser.setText("");
							prenomuser.setText("");
							emailuser.setText("");
							teluser.setText("");
							ncinuser.setText("");
							sexeeuser.setText("");}
	    	    	else {
	    	    	User userData = user.getSingleUsser(Integer.parseInt(cinuser.getText()));
		    		nomuser.setText((userData.getNom()));
					prenomuser.setText(userData.getPrenom());
					emailuser.setText(userData.getEmail());
					teluser.setText(String.valueOf(userData.getTel()));
					ncinuser.setText(String.valueOf(userData.getCin()));
					sexeeuser.setText(userData.getSexe());}
	    	    	stagemodifier.setScene(sceneALLEN);
	    	    	stagemodifier.setTitle("Update_User");
	    	    	stagemodifier.setResizable(false);
	    	    	stagemodifier.show();
	    	    	}}});
	    	    
					 valider.setOnAction(e->{
						
						 
						
		    		user.updateUser(new User( nomuser.getText(), prenomuser.getText(), emailuser.getText(),Integer.parseInt(teluser.getText()),Integer.parseInt(ncinuser.getText()),sexeeuser.getText()),Integer.parseInt(cinuser.getText()));
		    		 UserBasedonnee user1 = new UserBasedonnee();
		    		userList = user1.getUser();
		    		ObservableList<User> userData1 = FXCollections.observableArrayList(userList);
		    		table.setItems(userData1);
	    	    	table.refresh(); 
					 });
					 annuler.setOnAction(e->{ stagemodifier.close();
	    	    	cinuser.setText("");
						 nomuser.setText("");
							prenomuser.setText("");
							emailuser.setText("");
							teluser.setText("");
							ncinuser.setText("");
							sexeeuser.setText("");
 });
               
    	        	
	    	    
	    	
	    	

						choix.setSpacing(20);
					 	

						choix.setPadding(new javafx.geometry.Insets(15,0,15,185));
	    		remplir.getChildren().addAll(cin_user,cinuser);
	    		btn.getChildren().addAll(recherche,refresh,supprimer,modifier);
	     	tous.getChildren().addAll(remplir,btn,choix);
	     	root3.setTop(tous);
	     	root3.setCenter(pALLEtds);
	    		pALLEtds.setPadding(new javafx.geometry.Insets(5,5,5,5));	
	    		
	    		remplir.setPadding(new javafx.geometry.Insets(15,0,15,150));
	    		remplir.setSpacing(10);
	    		recherche.setMinWidth(110);
	    		supprimer.setMinWidth(110);
	    		modifier.setMinWidth(110);
	    		refresh.setMinWidth(110);
	    		refresh.setMinHeight(25);
	    		modifier.setMinHeight(25);
	    		supprimer.setMinHeight(25);
	    		recherche.setMinHeight(25);
	    		btn.setPadding(new javafx.geometry.Insets(15,0,15,53));
	    		btn.setSpacing(15);
	    		
	    	
	    		pALLEtds.setSpacing(150);
	    		nom.setMinWidth(100);
	    		prenom.setMinWidth(100);
	    		email.setMinWidth(100);
	    		tel.setMinWidth(100);
	    		cin.setMinWidth(100);
	    		sexe.setMinWidth(90);
	    	
	    		cin_user.setPadding(new javafx.geometry.Insets(5,2,0,5));
	    	
	    	
	    		
	    	
	    		Scene sceneALLEN = new Scene(root3,600,500);
	    		
	    		stageUser.setScene(sceneALLEN);
	    		stageUser.setTitle("Show_All_User");
	    		stageUser.setResizable(false);
	    		stageUser.show();	
	    	
	    	}

	    @FXML
	    void showcar(ActionEvent event) {
	    	Stage stagemodifier;
    		stagemodifier = new Stage();
	    	Button valider =new Button("Valider");
    		Button annuler =new Button("Annuler") ;
	    	stagecar = new Stage();
    		carlist = car.getCar();
    		ObservableList<Car> carData = FXCollections.observableArrayList(carlist);
    		tablecar = new TableView<Car>();
    		TableColumn<Car,String> marque = new TableColumn<Car,String>("Marque");
    		TableColumn<Car,String> modele = new TableColumn<Car,String>("Modele");
    		TableColumn<Car,String> année = new TableColumn<Car,String>("Année");  
    		TableColumn<Car,String> immatricule = new TableColumn<Car,String>("Immatricule");
    		TableColumn<Car,String> energie = new TableColumn<Car,String>("Energie"); 
    		TableColumn<Car,String>boite = new TableColumn<Car,String>("Boite"); 
    		TableColumn<Car,String>puissance = new TableColumn<Car,String>("Puissance"); 
    	
  
    		
    		// Definir comment remplir une case de donnï¿½e
    		marque.setCellValueFactory(new PropertyValueFactory<Car,String>("Marque"));
    		modele.setCellValueFactory(new PropertyValueFactory<Car,String>("Modele"));
    		année.setCellValueFactory(new PropertyValueFactory<Car,String>("Année"));
    		immatricule.setCellValueFactory(new PropertyValueFactory<Car,String>("Immatricule"));
    		energie.setCellValueFactory(new PropertyValueFactory<Car,String>("Energie"));
    		boite.setCellValueFactory(new PropertyValueFactory<Car,String>("Boite"));
    		puissance.setCellValueFactory(new PropertyValueFactory<Car,String>("Puissance"));

    		
    
    		
    		// Trier selon la colonne ID
    	
    		tablecar.refresh();
    		
    		tablecar.getColumns().addAll(marque,modele,année,immatricule,energie,boite,puissance);
    		tablecar.refresh();
    		
    		tablecar.setItems(carData);
    		
    
    	BorderPane root2=new BorderPane();
    	VBox pALLEtds2 = new VBox();
    	
    	Button supprimer =new Button("Supprimer") ;
		Button recherche2 =new Button("Recherche") ;
		Button refresh =new Button("Refresh") ;
		Button modifier =new Button("Modifier") ;
		RadioButton louer =	new RadioButton("Louer");
		RadioButton libre =	new RadioButton("Libre");
		RadioButton toute =	new RadioButton("Tous");
		ToggleGroup group = new ToggleGroup();
		louer.setToggleGroup(group);
		libre.setToggleGroup(group);
		toute.setToggleGroup(group);
	
		supprimer.setMinWidth(110);
		modifier.setMinWidth(110);

	VBox tous = new VBox();
	HBox remplir = new HBox();
	HBox btn=new HBox();
	HBox choix=new HBox();
	
	
	
		Label n_immat =new Label("تونس");
		n_immat.setStyle("-fx-font-weight: bold");
		n_immat.setTextFill(Color.BLUE);
		TextField immatr=new TextField();
		TextField immatr1=new TextField();
		choix.getChildren().addAll(louer,libre,toute);
		remplir.getChildren().addAll(immatr,n_immat,immatr1);
		btn.getChildren().addAll(recherche2,refresh,supprimer,modifier);
 	tous.getChildren().addAll(remplir,btn,choix);
 	root2.setTop(tous);
 	immatr.setMaxWidth(60);
	immatr1.setMaxWidth(60);
	choix.setSpacing(20);
 	

remplir.setPadding(new javafx.geometry.Insets(15,0,15,225));
choix.setPadding(new javafx.geometry.Insets(15,0,15,228));
		remplir.setSpacing(10);
		recherche2.setMinWidth(110);
		refresh.setMinWidth(110);
		btn.setPadding(new javafx.geometry.Insets(15,0,15,80));
		btn.setSpacing(15);

		n_immat.setPadding(new javafx.geometry.Insets(5,2,0,5));
    	
    		
    	
    		
    		pALLEtds2.getChildren().add(tablecar);
	
    	
    		pALLEtds2.setSpacing(150);
    		marque.setMinWidth(90);
    		modele.setMinWidth(90);
    		année.setMinWidth(90);
    		boite.setMinWidth(90);
    		energie.setMinWidth(90);
    		immatricule.setMinWidth(95);
    		puissance.setMinWidth(90);
    		
    	
    		
    	
    	


     	root2.setCenter(pALLEtds2);
    		pALLEtds2.setPadding(new javafx.geometry.Insets(5,5,5,5));	
    		
    	
    		 recherche2.setOnAction(e->{
    			 String t=immatr.getText()+"TN"+immatr1.getText();
    			 if((immatr.getText()=="")|(immatr1.getText()=="")) {
    		    	    Alert alert = new Alert(AlertType.INFORMATION);
    		    		alert.setTitle("Error");
    		    		alert.setHeaderText(null);
    		    		alert.setContentText("Entrer l'immatricule de voiture !");

    		    		alert.showAndWait();
    		    	    
    		    	}
    		    	else {if (car.existcar(t)==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    	    		alert.setTitle("Error");
    	    		alert.setHeaderText(null);
    	    		alert.setContentText("Cette Voiture n'existe pas !");

    	    		alert.showAndWait();}	
    		    	else {
     	    	tablecar.refresh();
     	    	carlist = car.getsingleCar(t);
     				ObservableList<Car> c = FXCollections.observableArrayList(carlist);
     				tablecar.setItems(c);
     				tablecar.refresh();
     		
    		    	}}
     	    });  
     	    refresh.setOnAction(e->{
     	   	
     	    	carlist = car.getCar();
	    		ObservableList<Car> f = FXCollections.observableArrayList(carlist);
	    		tablecar.setItems(f);
    	    	tablecar.refresh();    
     	    	immatr.setText("");
     	    	immatr1.setText("");
     	    	toute.setSelected(true);
     	    }); 
     	   tablecar.refresh();
     	    louer.setOnAction(e->{
     	    	tablecar.refresh();
     	    	carlist = car.getCarlouer();
     				ObservableList<Car> c = FXCollections.observableArrayList(carlist);
     				tablecar.setItems(c);
     				tablecar.refresh();
     	    });  
     	    libre.setOnAction(e->{
     	    	tablecar.refresh();
     	    	carlist = car.getCarlibre();
     				ObservableList<Car> c = FXCollections.observableArrayList(carlist);
     				tablecar.setItems(c);
     				tablecar.refresh();
     	    });  
     	   toute.setOnAction(e->{
     		  carlist = car.getCar();
	    		ObservableList<Car> f = FXCollections.observableArrayList(carlist);
	    		tablecar.setItems(f);
  	    	tablecar.refresh();    
   	    
    	    });  
     	  
     	   supprimer.setOnAction(e->{
      		  String t=immatr.getText()+"TN"+immatr1.getText();
      		if((immatr.getText()=="")|(immatr1.getText()=="")) {
	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Error");
	    		alert.setHeaderText(null);
	    		alert.setContentText("Entrer l'immatricule de voiture !");

	    		alert.showAndWait();
	    	    
	    	}
	    	else {	{if(car.existcar(t)==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("Cette Voiture n'existe pas !");

    		alert.showAndWait();}
	    	else {
	    	
	    	
	    	tablecar.refresh();
	    	car.deletecar(t);
				
				carlist = car.getCar();
	    		ObservableList<Car> f = FXCollections.observableArrayList(carlist);
	    		tablecar.setItems(f);
    	    	tablecar.refresh();  
    	    	immatr.setText("");
    	    	immatr1.setText("");
	    	}
	    	
	    	}
	    	}
	    });  
     	  modifier.setOnAction(e->{
     		 String t=immatr.getText()+"TN"+immatr1.getText();
     		 if((immatr.getText()=="")|(immatr1.getText()=="")) {
 	    	    Alert alert = new Alert(AlertType.INFORMATION);
 	    		alert.setTitle("Error");
 	    		alert.setHeaderText(null);
 	    		alert.setContentText("Entrer l'immatricule de voiture !");
 	    		alert.showAndWait();
    
  	    	}
     		 else
     		{if(car.existcar(t)==false) {    Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("Cette Voiture n'existe pas !");

    		alert.showAndWait();}
  	    	else{	    
      		VBox update = new VBox();
      		HBox nom1=new HBox();
      		nom1.getChildren().addAll(marque1,marquee);
      		HBox prenom1=new HBox();
      		prenom1.getChildren().addAll(modele1,modelee);
      		HBox email1=new HBox();
      		email1.getChildren().addAll(année1,annéee);
      		HBox cin1=new HBox();
      		cin1.getChildren().addAll(imma,ima);
      		HBox tel1=new HBox();
      		tel1.getChildren().addAll(energie1,energiee);
      		HBox sexe1=new HBox();
      		sexe1.getChildren().addAll(boite1,boitee);
      		HBox pass1=new HBox();
      		pass1.getChildren().addAll(puissance1,puissancee);
      		
      		HBox btn1 =new HBox();
      		btn1.getChildren().addAll(valider,annuler);
      		update.getChildren().addAll(nom1,prenom1,email1,cin1,tel1,sexe1,pass1,btn1);
      		update.setPadding(new javafx.geometry.Insets(15,20,15,29));
      		nom1.setSpacing(45);
      		prenom1.setSpacing(45);
      		email1.setSpacing(53);
      		cin1.setSpacing(10);
      		tel1.setSpacing(46);
      		sexe1.setSpacing(12);
      		pass1.setSpacing(90);
      		
      		
      		update.setSpacing(30);
      		btn1.setSpacing(20);
      		btn1.setPadding(new javafx.geometry.Insets(15,0,15,30));
      		valider.setMinWidth(110);
      		annuler.setMinWidth(110);
      	
      	
  	
      		
      		
      		
      	
  	    	BorderPane root8=new BorderPane();
  	    	root8.setTop(update);
  	    	Scene sceneALLEN = new Scene(root8,350,480);
  	    	if(t=="") {
  				marquee.setText("");
  					modelee.setText("");
  					ima.setText("");
  					annéee.setText("");
  					boitee.setText("");
  					puissancee.setText("");
  					energiee.setText("");
  				
  					}
  	    	else {
  	    	Car adminData1 = car.getSinglecars(t);
      		marquee.setText((adminData1.getMarque()));
  			modelee.setText(adminData1.getModele());
  			annéee.setText(adminData1.getAnnée());
  			ima.setText(adminData1.getImmatricule());
  			boitee.setText(adminData1.getBoite());
  			energiee.setText(adminData1.getEnergie());
  			puissancee.setText(adminData1.getPuissance());
  		
  			}
  	    	stagemodifier.setScene(sceneALLEN);
  	    	stagemodifier.setTitle("Update_Car");
  	    	stagemodifier.setResizable(false);
  	    	stagemodifier.show();
  	    	}}});
  	    
  			 valider.setOnAction(e->{
  				 String t=immatr.getText()+"TN"+immatr1.getText();
      		car.updatecar(new Car(marquee.getText(), modelee.getText(), annéee.getText(),ima.getText(),energiee.getText(),boitee.getText(),puissancee.getText()),t);
      		CarBaseDonee admin1 = new CarBaseDonee();
      		carlist = admin1.getCar();
      		ObservableList<Car> adminData1 = FXCollections.observableArrayList(carlist);
      		tablecar.setItems(adminData1);
  	    	tablecar.refresh();
  	    	
  			 });
  			 annuler.setOnAction(e->{ stagemodifier.close();
  	    	immatr.setText("");
  	    	immatr1.setText("");
  				 nomadmin.setText("");
  					prenomadmin.setText("");
  					emailadmin.setText("");
  					teladmin.setText("");
  					ncinadmin.setText("");
  					sexeeadmin.setText("");
  					passwordadmin.setText("");
  					adresseadmin.setText("");
  					dateadmin.setText("");
  });
        	    
     	
    	
    		
    	
    	
    		
    	
    		Scene sceneALLEN2 = new Scene(root2,646,500);
    		
    		stagecar.setScene(sceneALLEN2);
    		stagecar.setTitle("Show_All_Car");
    		stagecar.setResizable(false);
    		stagecar.show();	
    	
	    }
	    @FXML
	    void showadmin(ActionEvent event) {
	    	Stage stagemodifier;
    		stagemodifier = new Stage();
	    	stageadmin = new Stage();
    		adminlist = admin.getadmin();
    		ObservableList<Admin> adminData = FXCollections.observableArrayList(adminlist);
    		tableadmin = new TableView<Admin>();
    		TableColumn<Admin,String> nom = new TableColumn<Admin,String>("Nom");
    		TableColumn<Admin,String> prenom = new TableColumn<Admin,String>("Prenom");
    		TableColumn<Admin,String>email = new TableColumn<Admin,String>("Email");  
    		TableColumn<Admin,Integer> tel = new TableColumn<Admin,Integer>("Tel");
    		TableColumn<Admin,Integer> cin = new TableColumn<Admin,Integer>("Cin"); 
    		TableColumn<Admin,String>sexe = new TableColumn<Admin,String>("Sexe"); 
    		TableColumn<Admin,String>password = new TableColumn<Admin,String>("Password"); 
    		TableColumn<Admin,String>adresse = new TableColumn<Admin,String>("Adresse"); 
    		TableColumn<Admin,String>datenissance = new TableColumn<Admin,String>("Datenissance"); 
    		
    		// Definir comment remplir une case de donnï¿½e
    		nom.setCellValueFactory(new PropertyValueFactory<Admin,String>("nom"));
    		prenom.setCellValueFactory(new PropertyValueFactory<Admin,String>("prenom"));
    		email.setCellValueFactory(new PropertyValueFactory<Admin,String>("email"));
    		tel.setCellValueFactory(new PropertyValueFactory<Admin,Integer>("tel"));
    		cin.setCellValueFactory(new PropertyValueFactory<Admin,Integer>("cin"));
    		sexe.setCellValueFactory(new PropertyValueFactory<Admin,String>("sexe"));
    		password.setCellValueFactory(new PropertyValueFactory<Admin,String>("Password"));
    		adresse.setCellValueFactory(new PropertyValueFactory<Admin,String>("Adresse"));
    		datenissance.setCellValueFactory(new PropertyValueFactory<Admin,String>("Datenissance"));
    		// Trier selon la colonne ID
    		tableadmin.setItems(adminData);
    		tableadmin.refresh();
    		tableadmin.getColumns().addAll(nom,prenom,email,tel,cin,sexe,password,adresse,datenissance);
    	
    	BorderPane root=new BorderPane();
    	VBox pALLEtds = new VBox();
    
    	Button supprimer =new Button("Supprimer") ;
		Button recherche =new Button("Recherche") ;
		Button refresh =new Button("Refresh") ;
		Button  modifier =new Button("Modifier") ;
		Button  valider =new Button("Valider") ;
		Button  annuler =new Button("Annuler") ;
		RadioButton homme =	new RadioButton("Homme");
		RadioButton femme =	new RadioButton("Femme");
		RadioButton toute =	new RadioButton("Tous");
		ToggleGroup group = new ToggleGroup();
		homme.setToggleGroup(group);
		femme.setToggleGroup(group);
		toute.setToggleGroup(group);
		HBox choix=new HBox();
		choix.getChildren().addAll(homme,femme,toute);
	VBox tous = new VBox();
	HBox remplir = new HBox();
	HBox btn=new HBox();
	
	
		Label cin_admin =new Label("N°Cin d'admin");
		cin_admin.setStyle("-fx-font-weight: bold");
		cin_admin.setTextFill(Color.BLUE);
		TextField cinadmin=new TextField();
		
		pALLEtds.getChildren().add(tableadmin);
	
	    recherche.setOnAction(e->{
	      	if(cinadmin.getText()=="") {
	    	    
	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Error");
	    
	    		alert.setContentText("Entrer le numero de carte d'identite d'admin !");
	    		alert.setHeaderText(null);
	    		alert.showAndWait();
	    	}else {if (admin.existeadminn(Integer.parseInt(cinadmin.getText()))==false){    
	    	Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("cette admin n'existe pas!");

    		alert.showAndWait();}
	    	else{	
	    	tableadmin.refresh();
	    	adminlist = admin.getsingleadmin(Integer.parseInt(cinadmin.getText()));
				ObservableList<Admin> et = FXCollections.observableArrayList(adminlist);
				tableadmin.setItems(et);
			
				tableadmin.refresh();}}
	    	
	    });  
	    refresh.setOnAction(e->{
	    	cinadmin.setText("");
	    	tableadmin.refresh(); 
	    	
	    	adminlist = admin.getadmin();
    		ObservableList<Admin> ab = FXCollections.observableArrayList(adminlist);
    		tableadmin.setItems(ab);
	    	tableadmin.refresh();  
	    	toute.setSelected(true);
	   
	    	
	    }); 
	    homme.setOnAction(e->{
	    	tableadmin.refresh();
 	    	adminlist = admin.getadminhomme();
 				ObservableList<Admin> c = FXCollections.observableArrayList(adminlist);
 				tableadmin.setItems(c);
 				tableadmin.refresh();  }); 
	    femme.setOnAction(e->{
	    	tableadmin.refresh();
 	    	adminlist = admin.getadminfemme();
 				ObservableList<Admin> c = FXCollections.observableArrayList(adminlist);
 				tableadmin.setItems(c);
 				tableadmin.refresh();  });
	    toute.setOnAction(e->{
	    	cinadmin.setText("");
	    	tableadmin.refresh(); 
	    	
	    	adminlist = admin.getadmin();
    		ObservableList<Admin> ab = FXCollections.observableArrayList(adminlist);
    		tableadmin.setItems(ab);
	    	tableadmin.refresh();  });
	    supprimer.setOnAction(e->{
	    	if(cinadmin.getText()=="") {
	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Error");
	    		alert.setHeaderText(null);
	    		alert.setContentText("Entrer le numero de carte d'identite d'admin !");

	    		alert.showAndWait();
	    	    
	    	}
	    	else {	if (admin.existeadminn(Integer.parseInt(cinadmin.getText()))==false){    Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("cette admin n'existe pas!");

    		alert.showAndWait();}
	    	else{	    
	    	
	    	tableadmin.refresh();
	    	admin.deleteadmin(Integer.parseInt(cinadmin.getText()));
				tableadmin.refresh();
				adminlist = admin.getadmin();
	    		ObservableList<Admin> f = FXCollections.observableArrayList(adminlist);
	    		tableadmin.setItems(f);
    	    	tableadmin.refresh();  
    	    	cinadmin.setText("");
	    	}}
	    });  
	    modifier.setOnAction(e->{
	    
	    	if(cinadmin.getText()=="") {
	    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("Error");
	    		alert.setHeaderText(null);
	    		alert.setContentText("Entrer le numero de carte d'identite d'admin !");

	    		alert.showAndWait();
	    	    
	    	}
	    	else {	if (admin.existeadminn(Integer.parseInt(cinadmin.getText()))==false){    Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Error");
    		alert.setHeaderText(null);
    		alert.setContentText("cette admin n'existe pas!");

    		alert.showAndWait();}
	    	else{	    
    		VBox update = new VBox();
    		HBox nom1=new HBox();
    		nom1.getChildren().addAll(nom_admin,nomadmin);
    		HBox prenom1=new HBox();
    		prenom1.getChildren().addAll(prenom_admin,prenomadmin);
    		HBox email1=new HBox();
    		email1.getChildren().addAll(email_admin,emailadmin);
    		HBox cin1=new HBox();
    		cin1.getChildren().addAll(ncin_admin,ncinadmin);
    		HBox tel1=new HBox();
    		tel1.getChildren().addAll(tel_admin,teladmin);
    		HBox sexe1=new HBox();
    		sexe1.getChildren().addAll(sexee_admin,sexeeadmin);
    		HBox pass1=new HBox();
    		pass1.getChildren().addAll(password_admin,passwordadmin);
    		HBox adresse1=new HBox();
    		adresse1.getChildren().addAll(adresse_admin,adresseadmin);
    		HBox question=new HBox();
    		question.getChildren().addAll(ques,quest1);
    		HBox reponse=new HBox();
    		reponse.getChildren().addAll(rep,rep1);
    		HBox date1=new HBox();
    		date1.getChildren().addAll(date_admin,dateadmin);
    		
    		HBox btn1 =new HBox();
    		btn1.getChildren().addAll(valider,annuler);
    		update.getChildren().addAll(nom1,prenom1,email1,cin1,tel1,sexe1,pass1,adresse1,question,reponse,date1,btn1);
    		update.setPadding(new javafx.geometry.Insets(15,20,15,29));
    		nom1.setSpacing(25);
    		prenom1.setSpacing(12);
    		email1.setSpacing(25);
    		cin1.setSpacing(25);
    		tel1.setSpacing(25);
    		sexe1.setSpacing(30);
    		pass1.setSpacing(5);
    		adresse1.setSpacing(13);
    		date1.setSpacing(13);
    		question.setSpacing(13);
    		reponse.setSpacing(58);
    		update.setSpacing(30);
    		btn1.setSpacing(20);
    		btn1.setPadding(new javafx.geometry.Insets(15,0,15,23));
    		valider.setMinWidth(110);
    		annuler.setMinWidth(110);
    	
    	
	
    		
    		
    		
    	
	    	BorderPane root8=new BorderPane();
	    	root8.setTop(update);
	    	Scene sceneALLEN = new Scene(root8,350,710);
	    	if(cinadmin.getText()=="") {
				 nomuser.setText("");
					prenomuser.setText("");
					emailuser.setText("");
					teluser.setText("");
					ncinuser.setText("");
					sexeeuser.setText("");
					passwordadmin.setText("");
					adresseadmin.setText("");
					dateadmin.setText("");
					}
	    	else {
	    	Admin adminData1 = admin.getSingleadminn(Integer.parseInt(cinadmin.getText()));
    		nomadmin.setText((adminData1.getNom()));
			prenomadmin.setText(adminData1.getPrenom());
			emailadmin.setText(adminData1.getEmail());
			teladmin.setText(String.valueOf(adminData1.getTel()));
			ncinadmin.setText(String.valueOf(adminData1.getCin()));
			sexeeadmin.setText(adminData1.getSexe());
			passwordadmin.setText(adminData1.getPassword());
			adresseadmin.setText(adminData1.getAdresse());
			dateadmin.setText(adminData1.getDatenissance());
			quest1.setText(adminData1.getQuestion());
			rep1.setText(adminData1.getReponse());
			}
	    	stagemodifier.setScene(sceneALLEN);
	    	stagemodifier.setTitle("Update_Admin");
	    	stagemodifier.setResizable(false);
	    	stagemodifier.show();
	    	}}});
	    
			 valider.setOnAction(e->{
    		admin.updateAdmin(new Admin(nomadmin.getText(), prenomadmin.getText(), emailadmin.getText(),Integer.parseInt(teladmin.getText()),Integer.parseInt(ncinadmin.getText()),sexeeadmin.getText(),passwordadmin.getText(),adresseadmin.getText(),dateadmin.getText(),quest1.getText(),rep1.getText()),Integer.parseInt(cinadmin.getText()));
    		Adminbasededonnee admin1 = new Adminbasededonnee();
    		adminlist = admin1.getadmin();
    		ObservableList<Admin> adminData1 = FXCollections.observableArrayList(adminlist);
    		tableadmin.setItems(adminData1);
	    	tableadmin.refresh();
	    	
			 });
			 annuler.setOnAction(e->{ stagemodifier.close();
	    	cinadmin.setText("");
				 nomadmin.setText("");
					prenomadmin.setText("");
					emailadmin.setText("");
					teladmin.setText("");
					ncinadmin.setText("");
					sexeeadmin.setText("");
					passwordadmin.setText("");
					adresseadmin.setText("");
					dateadmin.setText("");
});
 

choix.setSpacing(20);
choix.setPadding(new javafx.geometry.Insets(15,0,15,200));
		remplir.getChildren().addAll(cin_admin,cinadmin);
		btn.getChildren().addAll(recherche,refresh,supprimer,modifier);
 	tous.getChildren().addAll(remplir,btn,choix);
 	root.setTop(tous);
 	root.setCenter(pALLEtds);
		pALLEtds.setPadding(new javafx.geometry.Insets(5,5,5,5));	
		
		remplir.setPadding(new javafx.geometry.Insets(15,0,15,167));
		remplir.setSpacing(10);
		recherche.setMinWidth(110);
		supprimer.setMinWidth(110);
		refresh.setMinWidth(110);
		modifier.setMinWidth(110);
		btn.setPadding(new javafx.geometry.Insets(15,0,15,69));
		btn.setSpacing(15);
		
	
		pALLEtds.setSpacing(150);
		nom.setMinWidth(65);
		prenom.setMinWidth(65);
		email.setMinWidth(65);
		tel.setMinWidth(65);
		cin.setMinWidth(65);
		sexe.setMinWidth(65);
	password.setMinWidth(65);
	adresse.setMinWidth(65);
	datenissance.setMinWidth(65);
		cin_admin.setPadding(new javafx.geometry.Insets(5,2,0,5));
	
	
    	
 
    		
    		
    	
    	    
    	


     	root.setCenter(pALLEtds);
    		pALLEtds.setPadding(new javafx.geometry.Insets(5,5,5,5));	
    		
    		
    		
    	
    		pALLEtds.setSpacing(150);
    		
    	
    		
    	
    		
    	
    		Scene sceneALLEN = new Scene(root,660,500);
    		
    		stageadmin.setScene(sceneALLEN);
    		stageadmin.setTitle("Show_All_Admin");
    		stageadmin.setResizable(false);
    		stageadmin.show();
	    }

	    @FXML
	    void louervoiture(ActionEvent event) {
	    	
	    	primaryStage = new Stage();
	    	Button valider =new Button("Valider");
    		Button annuler =new Button("Annuler") ;
tn.setTextFill(Color.BLUE);
tn.setStyle("-fx-font-weight: bold");
    		imm1.setMaxWidth(50);
    		imm2.setMaxWidth(50);
	    	HBox imma1=new HBox();
	    	imma1.getChildren().addAll(imm,imm1,tn,imm2);
	    	imma1.setSpacing(13);
	    	imma1.setPadding(new javafx.geometry.Insets(25,5,25,52));
	    	HBox cin1=new HBox();
	    	cin1.getChildren().addAll(cin_us,cinus);
	    	cin1.setSpacing(65);
	    	cin1.setPadding(new javafx.geometry.Insets(5,5,25,52));	
	    	HBox datede1=new HBox();
	    	
	    	mois.setMaxWidth(42);
	    	jour.setMaxWidth(40);
	    	
	    	annee.setMaxWidth(55);
	    	datede1.getChildren().addAll(datedebut,jour,mois,annee);
	    	datede1.setSpacing(14);
	    	datede1.setPadding(new javafx.geometry.Insets(5,5,25,52));	
	    jour.setPromptText("Jour");
	    mois.setPromptText("Mois");
	    annee.setPromptText("Année");
	    	HBox datefin1=new HBox();
	    	datefin1.getChildren().addAll(datefin,jourfin,moisfin,anneefin);
	    	datefin1.setSpacing(20);
	    	datefin1.setPadding(new javafx.geometry.Insets(5,5,25,52));	
		    jourfin.setPromptText("Jour");
		    moisfin.setPromptText("Mois");
		    anneefin.setPromptText("Année");
			moisfin.setMaxWidth(42);
	    	jourfin.setMaxWidth(40);
	    	
	    	anneefin.setMaxWidth(55);
	    	HBox boutn =new HBox();
	    	boutn.getChildren().addAll(valider,annuler);
	    	valider.setMinWidth(110);
	    	annuler.setMinWidth(110);
	    	boutn.setPadding(new javafx.geometry.Insets(5,5,25,82));	
	    	boutn.setSpacing(20);
	    	
			VBox all = new VBox();
			all.getChildren().addAll(imma1,cin1,datede1,datefin1,boutn);
			
			// Params de la fenetre
			Scene sceneALLEN = new Scene(all,400,300);
			//sceneALLPr.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sceneALLEN);
			primaryStage.setTitle("Louer Voiture");
			primaryStage.show();
		
annuler.setOnAction(e->{
	primaryStage.close();
	cinus.setText("");
	jour.setText("");
	mois.setText("");
	annee.setText("");
	jourfin.setText("");
	moisfin.setText("");
	anneefin.setText("");
	imm1.setText("");
	imm2.setText("");
	
	
	    	});

valider.setOnAction(e->{
	 String w=imm1.getText()+"TN"+imm2.getText();
	 String a=cinus.getText();
	 int b=Integer.parseInt(a);
	 String j=jour.getText();
	 String m=mois.getText();
	 String an=annee.getText();
	 String dat=j+"/"+m+"/"+an;
	 String jf=jourfin.getText();
	 String mf=moisfin.getText();
	 String anf=anneefin.getText();
	 String datf=jf+"/"+mf+"/"+anf;
	 String p="Louer";
 	
 	Car r=car.getSinglecars(w);
 
	 if(car.existcar(w)==false) {	 Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Error");
		alert.setHeaderText(null);
		alert.setContentText("cette voiture n'existe pas!");
		alert.showAndWait();}
	 else if (user.existeuser(b)==false){    
		 Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Error");
		alert.setHeaderText(null);
		alert.setContentText("cette user n'existe pas!");
		alert.showAndWait();}
	 else if((car.existcar(w)==false)&(r.isEtat()=="Louer")) {
 		 Alert alert = new Alert(AlertType.INFORMATION);
 		alert.setTitle("Error");
 		alert.setHeaderText(null);
 		alert.setContentText("cette voiture est deja louer!");
 		alert.showAndWait();}
 	else{	
		 try {
			ca.addCar(new voiturelouer(w,b,dat,datf));
			car.locationcar(w);
			r.setEtat(p);
			primaryStage.close();
			cinus.setText("");
			jour.setText("");
			mois.setText("");
			annee.setText("");
			jourfin.setText("");
			moisfin.setText("");
			anneefin.setText("");
			imm1.setText("");
			imm2.setText("");
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 	}
	
		 
	
	    	});
	    	
	    	
	    }
	    @FXML
	    void showlocation(ActionEvent event) {
	    	
    		
	    	stageUser = new Stage();
	    		louerList = ca.getcarlouer();
	    		ObservableList<voiturelouer> etdData = FXCollections.observableArrayList(louerList);
	    		tablelouer = new TableView<voiturelouer>();
	    		TableColumn<voiturelouer,String> immatricule = new TableColumn<voiturelouer,String>("immatricule");
	    		TableColumn<voiturelouer,Integer> cin_user = new TableColumn<voiturelouer,Integer>("cin_user");
	    		TableColumn<voiturelouer,String> datedebut = new TableColumn<voiturelouer,String>("datedebut");  
	    		TableColumn<voiturelouer,Integer> datefin = new TableColumn<voiturelouer,Integer>("datefin");
	    		
	    		
	    		// Definir comment remplir une case de donnï¿½e
	    		immatricule.setCellValueFactory(new PropertyValueFactory<voiturelouer,String>("immatricule"));
	    		cin_user.setCellValueFactory(new PropertyValueFactory<voiturelouer,Integer>("cin_user"));
	    		datedebut.setCellValueFactory(new PropertyValueFactory<voiturelouer,String>("datedebut"));
	    		datefin.setCellValueFactory(new PropertyValueFactory<voiturelouer,Integer>("datefin"));

	    		immatricule.setMinWidth(97);
	    		cin_user.setMinWidth(97);
	    		datedebut.setMinWidth(97);
	    		datefin.setMinWidth(96);
	    		// Trier selon la colonne ID
	    		tablelouer.setItems(etdData);
	    		tablelouer.refresh();
	    	
	    		tablelouer.getColumns().addAll(immatricule,cin_user,datedebut,datefin);
	    	
	    	BorderPane root3=new BorderPane();
	    	VBox pALLEtds = new VBox();
	    	VBox tous = new VBox();
    		
	    	
	    		pALLEtds.getChildren().add(tablelouer);
	    	
	    	 
	    	
	    	

				
	  
	     	root3.setCenter(pALLEtds);
	    		pALLEtds.setPadding(new javafx.geometry.Insets(5,5,5,5));	
	    		
	    		
	    	
	    		pALLEtds.setSpacing(150);

	        	
	        
	        	
	        	Button supprimer =new Button("Fin location") ;
	    		Button recherche2 =new Button("Recherche") ;
	    		Button refresh =new Button("Refresh") ;
	    
	    	
	    		supprimer.setMinWidth(110);
	    	

	    
	    	HBox remplir = new HBox();
	    	HBox btn=new HBox();
	 
	    	
	    	
	    	
	    		Label n_immat =new Label("تونس");
	    		n_immat.setTextFill(Color.BLUE);
	    		n_immat.setStyle("-fx-font-weight: bold");
	    		n_immat.setStyle("-fx-font-weight: bold");
	    		n_immat.setTextFill(Color.BLUE);
	    		TextField immatr=new TextField();
	    		TextField immatr1=new TextField();
	    	
	    		remplir.getChildren().addAll(immatr,n_immat,immatr1);
	    		btn.getChildren().addAll(recherche2,refresh,supprimer);
	     	tous.getChildren().addAll(remplir,btn);
	     	root3.setTop(tous);
	     	immatr.setMaxWidth(60);
	    	immatr1.setMaxWidth(60);
	    	
	     	

	    remplir.setPadding(new javafx.geometry.Insets(15,0,15,109));
	    btn.setPadding(new javafx.geometry.Insets(15,0,15,19));
	    		remplir.setSpacing(10);
	    		recherche2.setMinWidth(110);
	    		refresh.setMinWidth(110);
	    		
	    		btn.setSpacing(15);

	    		n_immat.setPadding(new javafx.geometry.Insets(5,2,0,5));
	    		recherche2.setOnAction(e->{
	    			 String t=immatr.getText()+"TN"+immatr1.getText();
	    			 if((immatr.getText()=="")|(immatr1.getText()=="")) {
	    		    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		    		alert.setTitle("Error");
	    		    		alert.setHeaderText(null);
	    		    		alert.setContentText("Entrer l'immatricule de voiture !");

	    		    		alert.showAndWait();
	    		    	    
	    		    	}
	    		    	else {if (ca.existscar(t)==false) {    Alert alert = new Alert(AlertType.INFORMATION);
	    	    		alert.setTitle("Error");
	    	    		alert.setHeaderText(null);
	    	    		alert.setContentText("Cette Voiture n'existe pas !");

	    	    		alert.showAndWait();}	
	    		    	else {
	     	    	tablelouer.refresh();
	     	    	louerList = ca.getsinglecarlouer(t);
	     				ObservableList<voiturelouer> c = FXCollections.observableArrayList(louerList);
	     				tablelouer.setItems(c);
	     				tablelouer.refresh();
	     		
	    		    	}}
	     	    });  
	    		
	        	refresh.setOnAction(e->{
	        		louerList= ca.getcarlouer();
		    		ObservableList<voiturelouer> f = FXCollections.observableArrayList(louerList);
		    		tablelouer.setItems(f);
	    	    	tablelouer.refresh();  
	    	    	immatr.setText("");
	    	    	immatr1.setText("");
	        	});
	    		supprimer.setOnAction(e->{
	    			  String t=immatr.getText()+"TN"+immatr1.getText();
	    	      		if((immatr.getText()=="")|(immatr1.getText()=="")) {
	    		    	    Alert alert = new Alert(AlertType.INFORMATION);
	    		    		alert.setTitle("Error");
	    		    		alert.setHeaderText(null);
	    		    		alert.setContentText("Entrer l'immatricule de voiture !");
	    		    		alert.showAndWait();
	    		    	    
	    		    	}
	    		    	else {	{if(ca.existscar(t)==false) {    Alert alert = new Alert(AlertType.INFORMATION);
	    	    		alert.setTitle("Error");
	    	    		alert.setHeaderText(null);
	    	    		alert.setContentText("Cette Voiture n'existe pas !");
	    	    		
	    	    		alert.showAndWait();}
	    		    	else {
	    		    		String p="Libre";
	    		    	car.liberercar(t);
	    		    	Car r=car.getSinglecars(t);
	    		    	r.setEtat(p) ;
	    		    	tablelouer.refresh();
	    		    	ca.deletecarlouer(t);
	    					
	    					louerList= ca.getcarlouer();
	    		    		ObservableList<voiturelouer> f = FXCollections.observableArrayList(louerList);
	    		    		tablelouer.setItems(f);
	    	    	    	tablelouer.refresh();  
	    	    	    	immatr.setText("");
	    	    	    	immatr1.setText("");
	    		    	}}}
	    		    	
	    		});
	    	
	    		Scene sceneALLEN = new Scene(root3,400,550);
	    		
	    		stageUser.setScene(sceneALLEN);
	    		stageUser.setTitle("Show_Car_Louer");
	    		stageUser.setResizable(false);
	    		stageUser.show();	
	    	
	    }
	
	    
	
	     }


	     

	     
	   


