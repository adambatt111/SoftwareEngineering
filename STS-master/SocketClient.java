import java.io.*;
import java.net.*;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{	
			Socket clientSocket = new Socket("10.5.41.41", 5000);  
			SendRequests sendReq = new SendRequests();
			ReceiveRequests recReq = new ReceiveRequests();
			sendReq.SendMessages(clientSocket, "HELO");	
			recReq.ReceiveMessages(clientSocket);
			//System.out.println(input);

		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	//connects to server but doesnt retreive info or send command.
	}

}