package classExample;
import java.util.ArrayList; // import ArrayList

public class BankAccountTester {
	
	//*** ArrayList class
	public static void main(String[] args) {
		// array of references 
		ArrayList<BankAccount> accountList = new ArrayList<>();
		// three new accounts
		accountList.add(new BankAccount("99786754", "Susan Richards"));
		accountList.add(new BankAccount("44567109", "Delroy Jacobs"));
		accountList.add(new BankAccount("46376205", "Sumana Khan"));
		
		// deposits and withdrawals 
		accountList.get(0).deposit(1000);
		accountList.get(2).deposit(150);
		accountList.get(0).withdraw(500);
		
		/* calculate interest
		 * setInterestRate() getInterestRate() are static
		 * we can use class name directly */
		BankAccount.setInterestRate(10);
		accountList.get(0).addInterest();
		accountList.get(2).addInterest();
		
		System.out.println(BankAccount.getInterestRate());
		
		for (BankAccount item : accountList) {
			System.out.println("Account number: " + item.getAccountNumber());
			System.out.println("Account name: " + item.getAccountName());
			System.out.println("Current balance: " + item.getBalance());
			System.out.println();
		}
		
		
	}
}