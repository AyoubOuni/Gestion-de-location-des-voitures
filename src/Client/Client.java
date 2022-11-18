package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	private	Socket socket ;
	private static Client instance;
	private Client() {
		
		try { 
		socket = new Socket("127.0.0.1",5750);
		
			}
				catch(Exception e){
					e.printStackTrace();
				}
			}
	public static Client getInstance() {
		if(instance==null) {
			instance =new Client();}
		return instance;}
	public Socket getSocket() {
		return socket;}}

		