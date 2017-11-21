
import java.io.*;
import java.net.*;

public class SendRequests implements Runnable
{
	PrintWriter out;
	Socket socketClientSend;
	
	private Thread s;
	private String threadName;
	
	boolean RecLoop;
	public String action = "HELO";
	
	SendRequests(Socket socketClient, String name){
		try{
		threadName = name;
		socketClientSend = socketClient;
		RecLoop = true;
		out = new PrintWriter(socketClientSend.getOutputStream(), true);
		}catch(Exception e){
			
		}
	}

	public void run(){
        try{
			while(RecLoop){	
				if(action != ""){
					out.println(action);
					action = "";
				}
			}
        }catch(Exception e){
			
		}
     
	}
	
	public void start () {
		if (s == null) {
			s = new Thread (this, threadName);
			s.start ();
		}
   }
   
   public void SetCommand(String command){
	   action = command;
   }
}