
import java.io.*;
import java.net.*;
import java.util.concurrent.TimeUnit;

public class SendRequests implements Runnable
{
	PrintWriter out;
	Socket socketClientSend;
	
	private Thread s;
	private String threadName;
	public String action;
	boolean RecLoop;
	
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
				Thread.sleep(1);
			    if(this.action != ""){
					out.println(this.action);
					this.action = "";
				}
			}
        }catch(Exception e){
			System.out.println("Error in Send" + e);
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