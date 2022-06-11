import java.util.Scanner;

public class If_Switch 
{ /* Using 1. if..else if statement
	       2. switch statement */
	public static void main(String[] args) 
	{
		char group;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Lab Times***");
		System.out.print("Enter your group (A,B,C) ");
		group = keyboard.next().charAt(0);
		
		// 1 ++++++++++++++++++++++++++++++++++++++++
/*		if (group == 'A' || group == 'a' ) //*** '' refers to char; "" refers to String
		{
			System.out.println("10.00 a.m.");
		}
		else if (group == 'B' || group == 'b' )
		{
			System.out.println("1.00 p.m.");
		}
		else if (group == 'C' || group == 'c' )
		{
			System.out.println("11.00 a.m.");
		}
		else
		{
			System.out.println("No such group.");
		} */
		
		// 2 ++++++++++++++++++++++++++++++++++++++++
		switch(group)
		{
		// cases are processed together
		case 'A': case 'C': case 'a': case 'c': System.out.println("10.00 a.m.");
		break;
		case 'B': case 'b': System.out.println("1.00 p.m.");
		break;
		// if no default: the program will stop, no output here
		default: System.out.println("No such group."); 
		}
	}
}
