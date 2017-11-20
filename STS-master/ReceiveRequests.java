
import java.io.*;
import java.net.*;

public class ReceiveRequests
{
	public String ReceiveMessages(){
        try{
        Socket clientSocket = new Socket("10.5.40.36", 5000);
		InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());			
		BufferedReader in = new BufferedReader(input);
		
		String userInput;	
		userInput = in.readLine();
		return userInput;
        }catch(Exception e){}
     
     return "null";
	}
}