import java.io.*;
import java.net.*;

public class SocketClient
{
	public Socket clientSocket;
	public ReceiveRequests recReq;
	public SendRequests sendReq;
	public String ID = "";
	
	public SocketClient(String IP){
		try
		{	
			clientSocket = new Socket(IP, 5000);  
			sendReq = new SendRequests(clientSocket, "Sending");
			recReq = new ReceiveRequests(clientSocket, "Receive");
			sendReq.start();
			recReq.start();
			sendReq.SetCommand("REGI");
			retreiveID();
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
	
	public void retreiveID(){
		boolean IDCheck = true;
			
			while(IDCheck){
				ID = recReq.GetID();
				if(ID != null){
					IDCheck = false;
				}
			}
			String[] Tokens = ID.split(":");
			System.out.println(Tokens[2]);
			ID = Tokens[2];
	}	
	
	public void buyShares(){
		String action = "BUY:AVIVA:2:" + ID;
		//System.out.println(ID);
		sendReq.SetCommand(action);
	}
	
	public void callHello(){
		sendReq.SetCommand("HELO");
	}
	
	
}
