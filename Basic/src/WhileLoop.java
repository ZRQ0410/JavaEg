import java.util.Scanner;

public class WhileLoop 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// while loop ++++++++++++++++++++++++++++++++++
		System.out.println("What exam mark did you get?");
		int mark = keyboard.nextInt();
		// mark validation
		while (mark < 0 || mark > 100)
		{
			System.out.println("Invalid markL please re-enter:");
			mark = keyboard.nextInt();
		}
		
		if (mark >= 40)
		{System.out.println("Congratulations, you passed.");}
		else
		{System.out.println("I'm sorry, you failed.");}
		System.out.println("Good luck with your other exams.");
		
		// do... while loop ++++++++++++++++++++++++++++
		char group, response;
		System.out.println(); 
		System.out.println("***Lab Times***");
		do
		{ 
		// menu 
		System.out.println(); 
		System.out.println("[1] TIME FOR GROUP A");
		System.out.println("[2] TIME FOR GROUP B");
		System.out.println("[3] TIME FOR GROUP C");
		System.out.println("[4] QUIT PROGRAM");
		System.out.print("enter choice [1,2,3,4]: ");
		response = keyboard.next().charAt(0); 
		System.out.println(); 
		switch(response) 
		{ 
		case '1': System.out.println("10.00 a.m ");
		break;
		case '2': System.out.println("1.00 p.m ");
		break;
		case '3': System.out.println("11.00 a.m ");
		break;
		case '4': System.out.println("Goodbye ");
		break;
		default: System.out.println("Options 1-4 only!");
		} 
		} while (response != '4');
	}
}
