package classExample;

public class BankAccount {
	
	private String accountNumber;
	private String accountName;
	private double balance;
	/* static: interestRate becomes a class attribute
	 * change to it is effective for any object of the class */
	
	//	initialize the variable or you'll get an error!
	private static double interestRate = 0;
	
	// constructor
	public BankAccount(String numberIn, String nameIn) {
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amountIn) {
		balance = balance + amountIn;
	}
	public boolean withdraw(double amountIn) {
		if(amountIn > balance) {
			return false;
		}
		else {
			balance = balance - amountIn;
			return true;
		}
	}
	
	/* use static 
	 * these methods belong to the class, not to a specific object
	 * we can use ClassName.method directly */
	public static void setInterestRate(double rateIn) {
		interestRate = rateIn;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	
	public void addInterest() {
		balance = balance + (balance * interestRate)/100;
	}
}
