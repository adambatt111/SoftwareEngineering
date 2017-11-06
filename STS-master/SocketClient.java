import java.io.*;
import java.net.*;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{	
			Socket clientSocket = new Socket("10.5.40.36", 5000);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());			
			BufferedReader in = new BufferedReader(input);
			
			out.println("HELO");
			String userInput;	
			userInput = in.readLine();	
			
			System.out.println(userInput);
		}
		        
		catch(IOException e)
        	{
		 	System.out.println("Error in setting up socket " + e);
			System.exit(1);
        
		}
	
	}

}

