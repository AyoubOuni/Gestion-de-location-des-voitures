package Basedonee;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Oriente_Objet.Admin;






public class Adminbasededonnee extends Connecte {
	  public static  void addAdmin(Admin a) throws IOException {

		     try {

		    	
					con = DriverManager.getConnection(url, user, "root");
				
		        java.sql.Statement st =Connecte.con.createStatement();
		    	st.executeUpdate( "insert into admin(nom,prenom,email,tel,cin,sexe,password,adresse,datenissance,question,reponse) values ('"+a.getNom()+"','"+a.getPrenom()+"','"+a.getEmail()+"','"+a.getTel()+"','"+a.getCin()+"','"+a.getSexe()+"','"+a.getPassword()+"','"+a.getAdresse()+"','"+a.getDatenissance()+"','"+a.getQuestion()+"','"+a.getReponse()+"') ");
		        JOptionPane.showMessageDialog(null,"Inscription valider pour Admin de N°Cin :"+ a.getCin()+ "","Error",1);
		    } catch (SQLException e1) {
		        
		        e1.printStackTrace();
		    }}
		     PreparedStatement statement  ;
		     public List<Admin> getadmin(){
					 

				    List<Admin> listadmin = new ArrayList<Admin>();
				    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
				       statement = con.prepareStatement("select * from admin ");
				       ResultSet result = statement.executeQuery();
				       while(result.next()){
				           Admin admine = new Admin(
				        		   result.getString("nom"), 
					               result.getString("prenom"), 
					               result.getString("email"), 
					               result.getInt("tel"), 
					               result.getInt("cin"), 
					               result.getString("sexe"),
					               result.getString("password"),
					               result.getString("adresse"),
					               result.getString("datenissance"),
					               result.getString("question"),
					               result.getString("reponse")
					           
				               );
				           listadmin.add(admine);  
				          

				       }
				    }
				    catch (SQLException e1) {
				       e1.printStackTrace();
				    }
				   return listadmin;
				}

		     public List<Admin> getsingleadmin(int ncin){
				 

				    List<Admin> listadmin = new ArrayList<Admin>();
			
				     try {Connecte.con = DriverManager.getConnection(url, "root", "root");
				        statement = con.prepareStatement("SELECT * FROM admin where cin ="+ncin);
				        ResultSet result = statement.executeQuery();
				        
				        
				        while(result.next()){     
				        	Admin admine = new Admin(
					        		   result.getString("nom"), 
						               result.getString("prenom"), 
						               result.getString("email"), 
						               result.getInt("tel"), 
						               result.getInt("cin"), 
						               result.getString("sexe"),
						               result.getString("password"),
						               result.getString("adresse"),
						               result.getString("datenissance"),
						               result.getString("question"),
						               result.getString("reponse")
					               );
					           listadmin.add(admine);  
					          
				        
				        }            
				        
				     }
				     catch (SQLException e1) {
				        e1.printStackTrace();
				     }

				    return listadmin;
				    
				 }
		     public void deleteadmin(int cin){
			     try {  statement = con.prepareStatement("DELETE FROM admin WHERE cin ="+cin);
			        statement.executeUpdate();
			        
			       
			     }
			     catch (SQLException e1) {
			        e1.printStackTrace();
			     }}
		     public void updateAdmin(Admin admin,int ncin){
				    try {
				        statement = con.prepareStatement("update admin set nom =?, prenom =?, email =?, tel =?, cin =?, sexe =?, password =?, adresse =?, datenissance =? ,question =?,reponse =? where cin ="+ncin);
				        statement.setString(1, admin.getNom());
				        statement.setString(2,admin.getPrenom());
				        statement.setString(3,admin.getEmail());
				        statement.setInt(4, admin.getTel());
				        statement.setInt(5, admin.getCin());
				        statement.setString(6, admin.getSexe());
				        statement.setString(7, admin.getPassword());
				        statement.setString(8, admin.getAdresse());
				        statement.setString(9, admin.getDatenissance());
				        statement.setString(10, admin.getQuestion());
				        statement.setString(11, admin.getReponse());
				        statement.executeUpdate();

				    } catch (SQLException e) {
				        
				        e.printStackTrace();
				    }
				 }
			  public Admin getSingleadminn(int cin){
				    Admin a = new Admin("nom", "prenom", "filiere", 00, 00,"homme","hhhh","uuhhuuh","huhuhu","hh","hh");
				     try {
				        statement = con.prepareStatement("SELECT * FROM admin where cin = "+ cin);
				        ResultSet result = statement.executeQuery();
				        
				        
				        while(result.next()){     
				        a.setnom(result.getString("nom") );
				        a.setprenom(result.getString("prenom"));
				        a.setemail(result.getString("email"));
				        a.settel(result.getInt("tel"));
				        a.setcin(result.getInt("cin") );
				        a.setsexe(result.getString("sexe"));
				        a.setPassword(result.getString("password"));
				        a.setAdresse(result.getString("adresse"));
				        a.setDatenissance(result.getString("datenissance"));
				        a.setQuestion(result.getString("question"));
				        a.setReponse(result.getString("reponse"));
				        }            
				        
				     }
				     catch (SQLException e1) {
				        e1.printStackTrace();
				     }

				    return a;
				    
				 }

			  public Boolean existeadminn(int cin){
				   boolean test=false;
				     try {
				        statement = con.prepareStatement("SELECT * FROM admin where cin = ?");
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
			  public String getquestion(int cin){
				  String b = null;
				  try {
				        statement = con.prepareStatement("SELECT question FROM admin where cin = ?");
				        statement.setInt(1, cin);
				        ResultSet result = statement.executeQuery();
				        
				        
				        if(result.next()){     
				        	b=result.getString("question");
				        
				        }           
				        
				     }
				     catch (SQLException e1) {
				        e1.printStackTrace();
				     }

				    return b;
				    
				 }

			  public List<Admin> getadminhomme(){
					 

				    List<Admin> listadmin = new ArrayList<Admin>();
				    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
				       statement = con.prepareStatement("select * from admin where sexe =?");
				       statement.setString(1,"Homme");
				       ResultSet result = statement.executeQuery();
				       while(result.next()){
				    	   Admin admine = new Admin(
				        		   result.getString("nom"), 
					               result.getString("prenom"), 
					               result.getString("email"), 
					               result.getInt("tel"), 
					               result.getInt("cin"), 
					               result.getString("sexe"),
					               result.getString("password"),
					               result.getString("adresse"),
					               result.getString("datenissance"),
					               result.getString("question"),
					               result.getString("reponse")
				               );
				           listadmin.add(admine);  
				       }
				    }
				    catch (SQLException e1) {
				       e1.printStackTrace();
				    }
				   return listadmin;
				}
			  public List<Admin> getadminfemme(){
					 

				    List<Admin> listadmin = new ArrayList<Admin>();
				    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
				       statement = con.prepareStatement("select * from admin where sexe =?");
				       statement.setString(1,"Femme");
				       ResultSet result = statement.executeQuery();
				       while(result.next()){
				    	   Admin admine = new Admin(
				        		   result.getString("nom"), 
					               result.getString("prenom"), 
					               result.getString("email"), 
					               result.getInt("tel"), 
					               result.getInt("cin"), 
					               result.getString("sexe"),
					               result.getString("password"),
					               result.getString("adresse"),
					               result.getString("datenissance"),
					               result.getString("question"),
					               result.getString("reponse")
				               );
				           listadmin.add(admine);  
				       }
				    }
				    catch (SQLException e1) {
				       e1.printStackTrace();
				    }
				   return listadmin;
				}

}

