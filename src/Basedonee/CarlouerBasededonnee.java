package Basedonee;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Oriente_Objet.Car;



import Oriente_Objet.voiturelouer;

public class CarlouerBasededonnee extends Connecte {
	
	
    public static  void addCar(voiturelouer c) throws IOException {
  try {
	  con = DriverManager.getConnection(url, user, "root");	  
	  java.sql.Statement st =con.createStatement();
					st.executeUpdate("insert into carlouer values ('"+c.getImmatricule()+"','"+c.getCin_user()+"','"+c.getDatedebut()+"','"+c.getDatefin()+"') ");
			
			        JOptionPane.showMessageDialog(null,"Le voiture avec immatricule : "+c.getImmatricule()+"  est bien louer à User de carte Cin :"+c.getCin_user()+ "","Error",1);
    }catch (SQLException e4) {

        System.out.println(e4.getMessage());
    }


}     PreparedStatement statement  ;

public List<voiturelouer> getcarlouer(){
	
		 

	    List<voiturelouer> listcar = new ArrayList<voiturelouer>();
	    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
	       statement = con.prepareStatement("select * from carlouer");
	       ResultSet result = statement.executeQuery();
	       while(result.next()){
	    	   voiturelouer carr = new voiturelouer(
	               result.getString("immatricule"), 
	               result.getInt("cin_user"), 
	               result.getString("datedebut"), 
	               result.getString("datefin")
	              
);
	           listcar.add(carr);  
	          

	       }
	    }
	    catch (SQLException e1) {
	       e1.printStackTrace();
	    }
	   return listcar;
	}
public void deletecarlouer(String a){
    try {  statement = con.prepareStatement("DELETE FROM carlouer WHERE immatricule = ?");
    statement.setString(1, a);
       statement.executeUpdate();
       
      
    }
    catch (SQLException e1) {
       e1.printStackTrace();
    }}
public List<voiturelouer> getsinglecarlouer(String immat){


   List<voiturelouer> listcar = new ArrayList<voiturelouer>();

    try {con = DriverManager.getConnection(url, "root", "root");
       statement = con.prepareStatement("select * from carlouer where immatricule = ?");
       statement.setString(1, immat);
       ResultSet result = statement.executeQuery();
       
       
       while(result.next()){     
       	 voiturelouer car=new voiturelouer(
       			 result.getString("immatricule"), 
		               result.getInt("cin_user"), 
		               result.getString("datedebut"), 
		               result.getString("datefin")
		            
);
		           listcar.add(car);  
       
       }            
       
    }
    catch (SQLException e1) {
       e1.printStackTrace();
    }

   return listcar;
   
}
public Boolean existscar(String a){
	   boolean test=false;
	     try {
	        statement = con.prepareStatement("SELECT * FROM carlouer where immatricule = ?");
	        statement.setString(1, a);
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

}
