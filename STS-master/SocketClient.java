
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
			
			sendReq.SendMessages(clientSocket, "HELO");	
			String input = recReq.ReceiveMessages(clientSocket);
			System.out.println(input);
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	
	}

}

////////////////////////////////////////////////////////////////////
import java.io.*;
import java.net.*;

public class SendRequests
{
	public void SendMessages(Socket clientSocket, String action){
		try
		{
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			System.out.println(action);
			out.print(action);
			System.out.println(action);
		}
		catch(Exception e){
			System.out.println("Error in setting up socket " + e);
			System.exit(1);
		}
	}
}

///////////////////////////////////////
import java.io.*;
import java.net.*;

public class ReceiveRequests
{
	public String ReceiveMessages(Socket clientSocket)
	{
		try
		{
			InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());			
			BufferedReader in = new BufferedReader(input);
			
			System.out.println("test");
			String userInput;	
			userInput = in.readLine();
			System.out.println("test");
			return userInput;
		}
		catch(Exception e)
		{
			System.out.println("Error in setting up socket " + e);
			System.exit(1);
			return "";
		}
	}
}


