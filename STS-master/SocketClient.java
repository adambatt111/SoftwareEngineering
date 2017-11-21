import java.io.*;
import java.net.*;

public class SocketClient
{
	Socket clientSocket;
	SendRequests sendReq;
	
	public void SocketStartUp(String IP)
	{
		
		try
		{	
			clientSocket = new Socket(IP, 5000);  
			sendReq = new SendRequests(clientSocket, "Sending");
			ReceiveRequests recReq = new ReceiveRequests(clientSocket, "Receive");
			sendReq.start();
			recReq.start();
			/*
			sendReq.SetCommand("HELO");
			System.out.println("waitttttttttttt");
			sendReq.SetCommand("REGI");*/
			
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	//connects to server but doesnt retreive info or send command.
	}

	public void GetAction(String action){
		try{
			sendReq.SetCommand(action);
		}catch(Exception e){
			
		}
	}
}
