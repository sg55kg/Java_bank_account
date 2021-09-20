import java.util.HashMap;


public class Account {
	protected static HashMap<String, String> loginInfo = new HashMap<>();
	protected static double accountBalance;
	
//	Account(double accountBalance, HashMap<String, String> loginInfo) {
//		this.loginInfo = loginInfo;
//		this.accountBalance = accountBalance;
//		
//	}


	
	public static void setAccountName(HashMap<String,String> login) {
		loginInfo = login;
	}
	
	public static void setUserAndPass(String username, String password) {
		loginInfo.put(username, password);
	}
	
	public void setBalance(double balance) {
		this.accountBalance = balance;
	}
	
//	public String[] setAccountName() {
//		return 
//	}
	
	public static double deposit(double amount) {
		return accountBalance += amount;
	}
	
	public static double withdraw(double amount) {
		return accountBalance -= amount;
	}
	
	public static double getAccountBalance() {
		return accountBalance;
	}
	
}
