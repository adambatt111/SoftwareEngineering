import java.io.*;
import java.net.*;

public class SendRequests
{
	public void SendMessages(Socket clientSocket, String action){
		try{
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			//System.out.println("Testing");
		    out.println(action);
			
        }catch(Exception e){}
	}
}