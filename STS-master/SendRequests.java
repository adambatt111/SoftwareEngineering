import java.io.*;
import java.net.*;

public class SendRequests
{
	public void SendMessages(Socket clientSocket, String action){
		try{
           // Socket clientSocket = new Socket("10.5.40.36", 5000);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		    out.print(action);
        }catch(Exception e){}
	}
}