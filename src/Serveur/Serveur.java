package Serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Serveur {
	

	public static void main(String[] args) {
		 
		ServerSocket service = null;
		Socket socketSRV = null;
		int nb =0;
		
		try { 
		service = new ServerSocket(5750);
		System.out.println("Serveur sur Ecoute ");
		while(nb < 210){
	// Serveur en attente des clients
		socketSRV = service.accept();
		//System.out.println("hhhhhh");
	    new ReadWriteThread(socketSRV).start();
	    nb++;
		}
			
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		}
		



