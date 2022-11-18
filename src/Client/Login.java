package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Login extends Thread {

private Stage stage;
private Scene scene;
private Parent root;
	Client client = Client.getInstance();
	String email, password;
	
	public static Boolean isLogged = false;
	
	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	
	public void run() {
		BufferedReader in;
		PrintWriter out;
		try {
			
			out = new PrintWriter(client.getSocket().getOutputStream());
			out.println(email+"/"+password);
			out.flush(); 
			System.out.println(email+"/"+password);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			in = new BufferedReader(new InputStreamReader(client.getSocket().getInputStream()));
			String msg = in.readLine();
			System.out.println("msg"+msg);
			
			if(Boolean.parseBoolean(msg) == true) {
				Login.isLogged = true;
				System.out.println("here : "+Login.isLogged);
				
			}else if (Boolean.parseBoolean(msg) == false){
				Login.isLogged = false;
				System.out.println("here : "+Login.isLogged);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
