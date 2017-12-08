
import java.io.*;
import java.net.*;

public class ReceiveRequests implements Runnable
{
	InputStreamReader input;
	Socket clientSocketRec;
	BufferedReader in;
	
	private Thread t;
	private String threadName;

	public String ID = "";
	boolean RecLoop;
	String serverInput;
	
	ReceiveRequests(Socket clientSocket, String name){
		try{
			RecLoop = true;
			threadName = name;
			clientSocketRec = clientSocket;
			input = new InputStreamReader(clientSocketRec.getInputStream());
			in = new BufferedReader(input);
			
			
		}catch(Exception e){
			
		}
	}
	
	public void run(){
        try{
			while(RecLoop){	
				serverInput = in.readLine();
				System.out.println(serverInput);
			}
        }catch(Exception e){
			
		}
     
	}
	
	public void start () {
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
   
   public String GetID(){
	   //String[] IDString = serverInput.split(":");
	   //ID = IDString[2];
	   
	   return serverInput;
   }
}