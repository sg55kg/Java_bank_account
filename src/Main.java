//import java.util.HashMap;
import java.util.Scanner;

public class Main extends Account {
	
	//static HashMap<String, String> loginInfo ;
	//static double accountBalance;
	static boolean loggedIn = false; //implement this in main method and change true/false based on if logged in.
	public static Scanner scan = new Scanner(System.in);
	
	
	
	public static void login(String username) {
			
		System.out.println("Enter your password");
		String password = scan.next();
			
		while(!(loginInfo.get(username).equals(password))) {
			System.out.println("Incorrect password, try again.");
			password = scan.next();
		}
		
		loggedIn = true; //set this as true, so main method will call manageAccount function			
		System.out.println("Logged in");
		
		//Account account = new Account();
		
		System.out.println("Your current balance is: " + Account.getAccountBalance());
		
	}
	
	
	
	public static void createAccount() {
		
		System.out.println("Enter a new username");
		String username = scan.next();
		System.out.println("Enter a new password");
		String password = scan.next();
		System.out.println("Enter how much you will open your account with: ");
		double initialBalance = scan.nextDouble();
		
		//Account account = new Account();
		
		accountBalance = initialBalance;		
		setUserAndPass(username, password);
		//setAccountName(loginInfo);
		
	}
	
	
	public static boolean manageAccount() {
		//Account account = new Account();
		String message = "Would you like to withdraw, deposit, see balance, or logout?";
		double amount;
		
		System.out.println(message);
		
		while(loggedIn) {
			String choice = scan.next();
			
			if(choice.equals("withdraw")) {
				System.out.println("How much would you like to withdraw?");
				amount = scan.nextDouble();
				accountBalance = withdraw(amount);
				System.out.println("Your current balance is now: " + getAccountBalance());
				System.out.println(message);
				continue;
				
			} else if(choice.equals("deposit")) {
				
				System.out.println("How much would you like to deposit?");
				amount = scan.nextDouble();
				accountBalance = deposit(amount);
				System.out.println("Your current balance is now: " + getAccountBalance());
				System.out.println(message);
				continue;
				
			} else if(choice.equals("see")) {
				System.out.println("Your current balance is: " + getAccountBalance());
				System.out.println(message);
				continue;
				
			} else if(choice.equals("logout")) {
				return loggedIn = false;
			}
		}
		return loggedIn = false;
	}
	
	

	public static void main(String[] args) {
	
		while(true) {
			while(!loggedIn) {
				System.out.println("Would you like to open an account or login?");
				String choice = scan.next();
				
				if(choice.equals("open")) {
					
					createAccount();
					
					System.out.println("Enter your username: ");
					String username = scan.next();
					
					for(String s : loginInfo.keySet()) {
						while(!(loginInfo.containsKey(username))) {
							System.out.println("User not found. Try again. ");
							username = scan.next();
						}
					}	
					
					login(username);
					
					
				} else if(choice.equals("login")) {
					System.out.println("Enter username: ");
					String username = scan.next();
					
					for(String s : loginInfo.keySet()) {
						while(!(loginInfo.containsKey(username))) {
							System.out.println("User not found. Try again. ");
							username = scan.next();
						}
					}				
					login(username);				
				}
			}
			
			while(loggedIn) {
				manageAccount();
			}
		}
	}
}
