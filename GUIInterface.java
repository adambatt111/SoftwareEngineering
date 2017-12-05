import java.io.*;
import java.net.*;
public class GUIInterface {
	public static SocketClient sc;
	public static void main(String args[]){
		
		System.out.println("Welcome to the Stock take system");
		System.out.println("Connecting to the system now");
		try{
			ServerConnect();
		}
		catch(Exception ex){
			System.out.println("Could not connect to the server. Make sure server is online");
			System.out.println("Error:" + ex);
			System.out.println("Closing program now...");
			System.exit(0);
		}
		
	
		
		boolean programOn = true;
		while (programOn == true){
			System.out.println("What would you like to do? \n 1. Buy Stocks(will be implemented soon) \n 2. Sell Stocks(will be implemented soon)\n 3. Look at stocks (will be implemented soon)\n 4. Live feed (will be implemented soon) \n 5. list profits (will be implemented soon) \n 6. Veiw money (will be implemented soon)\n7. View owned shares (will be implemented soon) \n8. past 5 changes (will be implemented soon)\n9. exit\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				String input = br.readLine();
				switch(input){
					case "1":
					System.out.println("Buying Stocks");
					buyShares();
					//programOn = false;
					break;
					case "2":
					System.out.println("Selling Stocks");
					//programOn = false;
					break;
					case "3":
					System.out.println("Looking at Stocks");
					//programOn = false;
					break;
					case "4":
					System.out.println("Live Feed");
					//programOn = false;
					break;
					case "5":
					System.out.println("My Profits");
					//programOn = false;
					break;
					case "6":
					System.out.println("Money");
					//programOn = false;
					break;
					case "7":
					System.out.println("Owned Shares");
					//programOn = false;
					break;
					case "8":
					System.out.println("Past 5 Changes");
					//programOn = false;
					break;
					case "9":
					System.exit(0);
					//Call exit from Server before quitting
					programOn = false;
					break;
					case "10":
					System.out.println("HELO being used");
					callHello();
					//programOn = false;
					break;
					default:
					System.out.println("\nPlease Choose Valid Option\n");
					//programOn = true;
					break;					
				}
			}catch(Exception e){
				System.out.println("Error" + e);
			}
		}
		
	}
	
	private static void ServerConnect()
	{
			sc = new SocketClient("10.5.38.18");
	}
	
	public static void callHello(){
		sc.GetAction("HELO");
	}
	
	public static void buyShares(){
		sc.GetAction("BUY:AVIVA:2:60406");
	}
}
