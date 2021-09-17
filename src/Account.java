import java.util.HashMap;

public class Account {
	private HashMap<String, String> loginInfo;
	private double accountBalance;
	
//	Account(HashMap<String,String> login, double balance) {
//		this.loginInfo = login;
//		this.accountBalance = balance;
//	}
	
//	Account() {
//		loginInfo = this.loginInfo;
//		accountBalance = this.accountBalance;
//		return;
//	}
	
	public void setUserAndPass(String username, String password) {
		loginInfo.put(username, password);
		
	}
	
	public void setBalance(double balance) {
		this.accountBalance = balance;
	}
	
	public String[] getUserAndPass() {
		String username = "test";
		String password = "test";
		String[] userAndPass = {username, password};
		return userAndPass;
	}
	
	public double deposit(double amount) {
		return this.accountBalance += amount;
	}
	
	public double withdraw(double amount) {
		return this.accountBalance -= amount;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
}
