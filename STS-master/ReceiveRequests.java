
import java.io.*;
import java.net.*;

public class ReceiveRequests
{
	public void ReceiveMessages(Socket clientSocket){
		boolean Onward = true;
        try{
			
		InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());			
		BufferedReader in = new BufferedReader(input);
		
		String userInput;
		while(Onward == true){		
		userInput = in.readLine();
		System.out.println(userInput);
		}
		
        }catch(Exception e){
			
		}
     
	}
}