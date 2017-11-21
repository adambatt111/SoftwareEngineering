import java.io.*;
import java.net.*;

public class SocketClient
{

	public static void main(String args[])
	{
		try
		{	
			Socket clientSocket = new Socket("10.5.41.31", 5000);  
			SendRequests sendReq = new SendRequests(clientSocket, "Sending");
			ReceiveRequests recReq = new ReceiveRequests(clientSocket, "Receive");
			sendReq.start();
			recReq.start();
			
			sendReq.SetCommand("HELO");
			System.out.println("waitttttttttttt");
			sendReq.SetCommand("REGI");
			
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	//connects to server but doesnt retreive info or send command.
	}

}