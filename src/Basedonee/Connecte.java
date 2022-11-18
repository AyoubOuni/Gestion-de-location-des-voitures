package Basedonee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class Connecte {
	public static   Connection con = null;
    public static String url ="jdbc:mysql://localhost:3306/location_voiture";
    public static String user = "root";
public String driver ="com.mysql.cj.jdbc.Driver"; 


public void driver() throws SQLException {try {
    Class.forName(driver);
    con = DriverManager.getConnection(url, user, "root");
   
} catch (ClassNotFoundException e1) {
    
    e1.printStackTrace();
    
}


}


}
