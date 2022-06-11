package exceptions;

import java.util.Scanner;

public class ClosingAResource2 {
	
	public static void main(String[] args) {
		
		// try-with-resource: open a Scanner resource
		// exceptions from closing the resource will be suppressed
		// the original uncaught exception is thrown
		
		try (Scanner keyboard = new Scanner (System.in)) {
			
			System.out.println("START TRY");
			String[] colours = { "RED", "BLUE", "GREEN" };
			System.out.print("Which colour? (1,2,3): ");
			String pos = keyboard.next();
			
			// this could throw NumberFormatException
			int i = Integer.parseInt(pos);
			// this could throw ArrayIndexOutOfBoundsException
			System.out.println(colours[i - 1]);
			System.out.println("END TRY");
		}
		
		// include a catch only for ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ENTER CATCH ");
			System.out.println(e);
		}
		
		// we don't need the finally clause here
		
		System.out.println("Goodbye");
	}
}