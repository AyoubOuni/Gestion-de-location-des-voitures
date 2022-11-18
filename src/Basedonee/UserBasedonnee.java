package Basedonee;

import java.io.IOException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Oriente_Objet.Car;
import Oriente_Objet.User;








public class UserBasedonnee extends Connecte {
	  public static  void addUser(User u) throws IOException {

		     try {

		    	
					con = DriverManager.getConnection(url, user, "root");
				
		        java.sql.Statement st =Connecte.con.createStatement();
		    	st.executeUpdate( "insert into user(nom,prenom,email,tel,cin,sexe) values ('"+u.getNom()+"','"+u.getPrenom()+"','"+u.getEmail()+"','"+u.getTel()+"','"+u.getCin()+"','"+u.getSexe()+"')");
		        JOptionPane.showMessageDialog(null,"Inscription valider pour User de N°Cin :"+ u.getCin()+ "","Error",1);
		    } catch (SQLException e1) {
		        
		        e1.printStackTrace();
		    }
	 
}PreparedStatement statement  ;
	  public List<User> getUser(){
			 

		    List<User> listUser = new ArrayList<User>();
		    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
		       statement = con.prepareStatement("select * from user");
		       ResultSet result = statement.executeQuery();
		       while(result.next()){
		           User userr = new User(
		               result.getString("nom"), 
		               result.getString("prenom"), 
		               result.getString("email"), 
		               result.getInt("tel"), 
		               result.getInt("cin"), 
		               result.getString("sexe")
		               );
		           listUser.add(userr);  
		          

		       }
		    }
		    catch (SQLException e1) {
		       e1.printStackTrace();
		    }
		   return listUser;
		}
	  public List<User> getsingleUser(int ncin){
			 

		    List<User> listUser = new ArrayList<User>();
	
		     try {Connecte.con = DriverManager.getConnection(url, "root", "root");
		        statement = con.prepareStatement("SELECT * FROM user where cin ="+ncin);
		        ResultSet result = statement.executeQuery();
		        
		        
		        while(result.next()){     
		        	 User userr = new User(
				               result.getString("nom"), 
				               result.getString("prenom"), 
				               result.getString("email"), 
				               result.getInt("tel"), 
				               result.getInt("cin"), 
				               result.getString("sexe")
				               );
				           listUser.add(userr);  
		        
		        }            
		        
		     }
		     catch (SQLException e1) {
		        e1.printStackTrace();
		     }

		    return listUser;
		    
		 }

	  public void deleteUser(int cin){
		     try {  statement = con.prepareStatement("DELETE FROM user WHERE cin ="+cin);
		        statement.executeUpdate();
		        
		       
		     }
		     catch (SQLException e1) {
		        e1.printStackTrace();
		     }}
	  public void updateUser(User user,int ncin){
		    try {
		        statement = con.prepareStatement("update user set nom =?, prenom =?, email =?, tel =?, cin =?, sexe =? where cin ="+ncin);
		        statement.setString(1, user.getNom());
		        statement.setString(2,user.getPrenom());
		        statement.setString(3,user.getEmail());
		        statement.setInt(4, user.getTel());
		        statement.setInt(5, user.getCin());
		        statement.setString(6, user.getSexe());
		    
		        statement.executeUpdate();

		    } catch (SQLException e) {
		        
		        e.printStackTrace();
		    }
		 }
	  public User getSingleUsser(int cin){
		    User etd = new User("nom", "prenom", "filiere", 00, 00,"homme");
		     try {
		        statement = con.prepareStatement("SELECT * FROM user where cin = "+ cin);
		        ResultSet result = statement.executeQuery();
		        
		        
		        while(result.next()){     
		        etd.setnom(result.getString("nom") );
		        etd.setprenom(result.getString("prenom"));
		        etd.setemail(result.getString("email"));
		        etd.settel(result.getInt("tel"));
		        etd.setcin(result.getInt("cin") );
		        etd.setsexe(result.getString("sexe"));
		        }            
		        
		     }
		     catch (SQLException e1) {
		        e1.printStackTrace();
		     }

		    return etd;
		    
		 }
	  public Boolean existeuser(int cin){
		   boolean test=false;
		     try {
		        statement = con.prepareStatement("SELECT * FROM user where cin =?");
		        statement.setInt(1, cin);
		        ResultSet result = statement.executeQuery();
		        
		        
		        if(result.next()){     
		      test=true;
		        
		        }            
		        
		     }
		     catch (SQLException e1) {
		        e1.printStackTrace();
		     }

		    return test;
		    
		 }


	  public List<User> getuserhomme(){
			 

		    List<User> listUser = new ArrayList<User>();
		    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
		       statement = con.prepareStatement("select * from user where sexe =?");
		       statement.setString(1,"Homme");
		       ResultSet result = statement.executeQuery();
		       while(result.next()){
		    	   User userr = new User(
			               result.getString("nom"), 
			               result.getString("prenom"), 
			               result.getString("email"), 
			               result.getInt("tel"), 
			               result.getInt("cin"), 
			               result.getString("sexe")
			               );
			           listUser.add(userr);  
		       }
		    }
		    catch (SQLException e1) {
		       e1.printStackTrace();
		    }
		   return listUser;
		}
	  public List<User> getuserfemme(){
			 

		    List<User> listUser = new ArrayList<User>();
		    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
		       statement = con.prepareStatement("select * from user where sexe =?");
		       statement.setString(1,"Femme");
		       ResultSet result = statement.executeQuery();
		       while(result.next()){
		    	   User userr = new User(
			               result.getString("nom"), 
			               result.getString("prenom"), 
			               result.getString("email"), 
			               result.getInt("tel"), 
			               result.getInt("cin"), 
			               result.getString("sexe")
			               );
			           listUser.add(userr);  
		       }
		    }
		    catch (SQLException e1) {
		       e1.printStackTrace();
		    }
		   return listUser;
		}
		     
}
