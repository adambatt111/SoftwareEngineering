import java.io.*;
import java.net.*;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{	
			Socket clientSocket = new Socket("10.5.40.36", 5000); 
			SendRequests sendReq = new SendRequests();
			ReceiveRequests recReq = new ReceiveRequests();
			sendReq.SendMessages(clientSocket, "Helo");	
			String input = recReq.ReceiveMessages();
			System.out.println(input);
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	
	}

}