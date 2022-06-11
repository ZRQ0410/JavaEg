import java.util.Scanner; 

public class CallMethod 
{
	public static void main(String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		int year, month, day;
		System.out.println("Please enter the year of your birth");
		displayMessage(); 
		year = keyboard.nextInt();
		System.out.println("Please enter the month of your birth as a number from 1 to 12");
		displayMessage(); 
		month = keyboard.nextInt();
		System.out.println("Please enter the day of your birth as a number from 1 to 31");
		displayMessage(); 
		day = keyboard.nextInt();
		
		keyboard.close();
		
	 } 
		// the code for displayMessage method
		static void displayMessage()
	{ 
		System.out.println("Please note that all information supplied is confidential");
		System.out.println("No personal details will be shared with any third party");
	} 
}
