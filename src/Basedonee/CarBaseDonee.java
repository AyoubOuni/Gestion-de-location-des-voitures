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





public class CarBaseDonee extends Connecte {
	
	
	    public static  void addCar(Car c) throws IOException {
      try {
    	  con = DriverManager.getConnection(url, user, "root");	  
    	  java.sql.Statement st =Connecte.con.createStatement();
						st.executeUpdate("insert into car(marque,modele,année,immatricule,energie,boite,puissance,etat) values ('"+c.getMarque()+"','"+c.getModele()+"','"+c.getAnnée()+"','"+c.getImmatricule()+"','"+c.getEnergie()+"','"+c.getBoite()+"','"+c.getPuissance()+"','"+c.isEtat()+"') ");
				
				        JOptionPane.showMessageDialog(null,"The new car with immatricule : "+ c.getImmatricule()+"  is added  ","Error",1);
	    }catch (SQLException e4) {

	        System.out.println(e4.getMessage());
	    }


}
	    PreparedStatement statement  ;
		  public List<Car> getCar(){
				 

			    List<Car> listcar = new ArrayList<Car>();
			    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
			       statement = con.prepareStatement("select * from car");
			       ResultSet result = statement.executeQuery();
			       while(result.next()){
			           Car carr = new Car(
			               result.getString("marque"), 
			               result.getString("modele"), 
			               result.getString("année"), 
			               result.getString("immatricule"), 
			               result.getString("energie"), 
			               result.getString("boite"), 
			               result.getString("puissance")
);
			           listcar.add(carr);  
			          

			       }
			    }
			    catch (SQLException e1) {
			       e1.printStackTrace();
			    }
			   return listcar;
			}
		  public List<Car> getsingleCar(String immat){
				
			    List<Car> listcar = new ArrayList<Car>();
		
			     try {con = DriverManager.getConnection(url, "root", "root");
			        statement = con.prepareStatement("select * from car where immatricule = ?");
			        statement.setString(1, immat);
			        ResultSet result = statement.executeQuery();
			        
			        
			        while(result.next()){     
			        	 Car car=new Car(
			        			 result.getString("marque"), 
					               result.getString("modele"), 
					               result.getString("année"), 
					               result.getString("immatricule"), 
					               result.getString("energie"), 
					               result.getString("boite"), 
					               result.getString("puissance")
);
					           listcar.add(car);  
			        
			        }            
			        
			     }
			     catch (SQLException e1) {
			        e1.printStackTrace();
			     }

			    return listcar;
			    
			 }

		  public Car getSinglecars(String a){
		     Car etd = new Car("nom", "prenom", "filiere","123", "prenom", "filiere","hhhhh");
		      try {
		          statement = con.prepareStatement("select * from car where immatricule = ?");
			        statement.setString(1, a);
		         ResultSet result = statement.executeQuery();
		         
		         
		         while(result.next()){     
		        	   etd.setmarque( result.getString("marque"));
		               etd.setmodele(result.getString("modele")); 
		               etd.setyear(result.getString("année"));
		               etd.setImmatricule(result.getString("immatricule")); 
		               etd.setenerg(result.getString("energie"));
		               etd.setboi(result.getString("boite"));
		               etd.setpuiss(result.getString("puissance"));
		               etd.setEtat(result.getString("etat"));
		         }            
		         
		      }
		      catch (SQLException e1) {
		         e1.printStackTrace();
		      }

		     return etd;
		     
		  }


		  public List<Car> getCarlouer(){
				 

			    List<Car> listcar = new ArrayList<Car>();
			    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
			    statement = con.prepareStatement("select * from car where etat =?");
			       statement.setString(1,"Louer");
			       ResultSet result = statement.executeQuery();
			       while(result.next()){
			           Car carr = new Car(
			               result.getString("marque"), 
			               result.getString("modele"), 
			               result.getString("année"), 
			               result.getString("immatricule"), 
			               result.getString("energie"), 
			               result.getString("boite"), 
			               result.getString("puissance")
 );
			           listcar.add(carr);  
			          

			       }
			    }
			    catch (SQLException e1) {
			       e1.printStackTrace();
			    }
			   return listcar;
			}
		  public List<Car> getCarlibre(){
				 

			    List<Car> listcar = new ArrayList<Car>();
			    try {Connecte.con = DriverManager.getConnection(url, "root", "root");
			       statement = con.prepareStatement("select * from car where etat =?");
			       statement.setString(1,"Libre");
			       ResultSet result = statement.executeQuery();
			       while(result.next()){
			           Car carr = new Car(
			               result.getString("marque"), 
			               result.getString("modele"), 
			               result.getString("année"), 
			               result.getString("immatricule"), 
			               result.getString("energie"), 
			               result.getString("boite"), 
			               result.getString("puissance")
			             );
			           listcar.add(carr);  
			          

			       }
			    }
			    catch (SQLException e1) {
			       e1.printStackTrace();
			    }
			   return listcar;
			}
		  public void deletecar(String a){
			     try {  statement = con.prepareStatement("DELETE FROM car WHERE immatricule = ?");
			     statement.setString(1, a);
			        statement.executeUpdate();
			        
			       
			     }
			     catch (SQLException e1) {
			        e1.printStackTrace();
			     }}
		  public Boolean existcar(String a){
			   boolean test=false;
			     try {
			        statement = con.prepareStatement("SELECT * FROM car where immatricule = ?");
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
		  public void updatecar(Car car,String a){
			    try {
			        statement = con.prepareStatement("update car set marque =?, modele =?, année =?, immatricule =?, energie =?, boite =? , puissance =? where immatricule =?");
			        statement.setString(1, car.getMarque());
			        statement.setString(2,car.getModele());
			        statement.setString(3,car.getAnnée());
			        statement.setString(4, car.getImmatricule());
			        statement.setString(5, car.getEnergie());
			        statement.setString(6, car.getBoite());
			        statement.setString(7, car.getPuissance());
			        statement.setString(8,a);
			        
			    
			        statement.executeUpdate();

			    } catch (SQLException e) {
			        
			        e.printStackTrace();
			    }
			 }
		  public void locationcar(String a){
			    try {
			        statement = con.prepareStatement("update car set etat =? where immatricule =?");
			        statement.setString(1,"Louer");
			        statement.setString(2,a);
			        
			    
			        statement.executeUpdate();

			    } catch (SQLException e) {
			        
			        e.printStackTrace();
			    }
			 }
		  public void liberercar(String a){
			    try {
			        statement = con.prepareStatement("update car set etat =? where immatricule =?");
			        statement.setString(1,"Libre");
			        statement.setString(2,a);
			        
			    
			        statement.executeUpdate();

			    } catch (SQLException e) {
			        
			        e.printStackTrace();
			    }
			 }
		

}
