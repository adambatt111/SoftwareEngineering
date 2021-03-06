import java.io.*;
import java.net.*;

public class SocketClient
{
	Socket clientSocket;
	SendRequests sendReq;
	
	public SocketClient(String IP){
		try
		{	
			clientSocket = new Socket(IP, 5000);  
			sendReq = new SendRequests(clientSocket, "Sending");
			ReceiveRequests recReq = new ReceiveRequests(clientSocket, "Receive");
			sendReq.start();
			recReq.start();
			sendReq.SetCommand("REGI");
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	}

	public void GetAction(String action){
		try{
			sendReq.SetCommand(action);
		}catch(Exception e){
			
		}
	}
}
