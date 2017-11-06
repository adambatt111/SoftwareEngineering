import java.io.*;
import java.net.Socket;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{
			Socket clientSocket = new Socket("10.5.38.127", 5000);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			
			while((userInput = stdIn.readLine()) != null){
				
				out.println("HELO");
			
			}
		}
		        catch(IOException e)
        {
            System.out.println("Error in setting up socket " + e);
            System.exit(1);
        }
	}
}

