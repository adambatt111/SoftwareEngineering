import java.io.*;
import java.net.Socket;

public class SocketClient
{
	public static void main(String args[])
	{
		try
		{
			Socket clientSocket = new Socket("10.5.38.127", 5000);
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
			
			out.println("HELO");
			
			while((userInput = in.readLine()) != null){
				
				System.out.prinln(userInput);
			
			}
		}
		        catch(IOException e)
        {
            System.out.println("Error in setting up socket " + e);
            System.exit(1);
        }
	}
}

