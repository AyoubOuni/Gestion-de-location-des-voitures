package Serveur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ReadWriteThread extends Thread {
	
	
	
	static String url ="jdbc:mysql://localhost:3306/location_voiture";
    static String user = "root";
	static String driver ="com.mysql.cj.jdbc.Driver"; 
	static Connection con = null;
	private Socket s;
	private boolean stop = false;
	public ReadWriteThread(Socket s) {
		this.s = s;
	}
	
	
	public void run(){
		
		while (!stop) {
			
		try{ 
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String msg = in.readLine();
			System.out.println(msg);
			String[] a=msg.split("/");
			String adress=a[0];
			String password=a[1];
			System.out.println(adress);
			try {
	            Class.forName(driver);
	        } catch (ClassNotFoundException e1) {
	            
	            e1.printStackTrace();
	            
	        }
	        try {
	        	String motDePass = null;
	            con = DriverManager.getConnection(url, user, "root");
	            java.sql.Statement st =con.createStatement();
	            
	           
	                String sql = "SELECT * FROM admin WHERE  email = '"+adress+"' ";
	                ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
	                
	                if(rs.next()){
	                	motDePass = rs.getString("password");
	                }
	                
	                PrintWriter out = new PrintWriter(s.getOutputStream());
	                
	                if (motDePass == null){
	                	out.println("false");
	                	out.flush();
	                	//stop = true;
	                	
			}
	                else if(!motDePass.equals(password))  {
	                	
	                	
	                out.println("false");
	                out.flush();
	                //stop = true;
	                }
	                else if(motDePass.equals(password)) {
	                	out.println("true");
	                	out.flush();
	                	
	                	//stop = true;
	                }
			
			
			; // Envoyer le msg au client
			//in.close();
		
	    }catch(Exception e){
			System.out.println(e.getMessage());
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		}}
	


