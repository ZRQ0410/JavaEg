import java.util.Scanner; // import java.util.*

public class FindCost 
{
	public static void main(String[] args) 
	{
		double price, tax;
		char reply;
		// a new instance: keyboard
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.println("***Product Price Check***");
			System.out.print("Enter initial price: ");
			// type: double--nextDouble(), others are similar
			//*** char: next().charAt(0)
			price = keyboard.nextDouble();
			System.out.print("Enter tax rate: ");
			tax = keyboard.nextDouble();
			
			// and: &&; or: ||; not: !; equal: ==
			if (price >= 250 || price == 200) 
			{
				System.out.println("Special Promotion: We pay half your tax!");
				tax = tax * 0.5;
			}
			price = addTax(price, tax);
			System.out.println("Cost after tax is: " + price);
			
			// see if user wants another go
			System.out.println();
			System.out.print("Would you like to enter another product (y/n)? ");
			reply = keyboard.next().charAt(0);
			System.out.println();
		} while (reply == 'y' || reply == 'Y');
	} 
	
	static double addTax(double priceIn, double taxIn)
	{
		return priceIn * (1 + taxIn/100);
	}
}
