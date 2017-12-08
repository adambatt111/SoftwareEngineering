import java.io.*;
import java.net.*;

public class SocketClient
{
	public Socket clientSocket;
	public SendRequests sendReq;
	
	public SocketClient(String IP){
		try
		{	
			clientSocket = new Socket(IP, 5000);  
			sendReq = new SendRequests(clientSocket, "Sending");
			ReceiveRequests recReq = new ReceiveRequests(clientSocket, "Receive");
			sendReq.start();
			recReq.start();
			sendReq.SetCommand("REGI");
			
			boolean wow = true;
			String ID = "";
			while(wow){
				ID = recReq.GetID();
				if(ID != null){
					wow = false;
				}
			}
			String[] Tokens = ID.split(":");
			System.out.println(Tokens[2]);
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
			System.out.println("Error in setting");
		}
	}
}
