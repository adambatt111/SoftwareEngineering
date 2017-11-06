import java.io.*;
import java.net.*;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{	
			Socket clientSocket = new Socket("10.5.40.36", 5000);
			SendRequests.SendMessages(clientSocket, "Helo");	
			String input = ReceiveRequests.ReceiveMessages();
			System.out.println(input);
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	
	}

}

public class SendRequests
{
	public void SendMessages(Socket clientSocket, String action){
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		out.print(action);
	}
}

public class ReceiveRequests
{
	public String ReceiveMessages(){
		InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());			
		BufferedReader in = new BufferedReader(input);
		
		String userInput;	
		userInput = in.readLine();
		return userInput;
	}
}

