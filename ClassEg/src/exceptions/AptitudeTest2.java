package exceptions;

// Catching the exception

import java.io.IOException;
public class AptitudeTest2 {
	public static void main (String[] args) {
		try {
			int score;
			System.out.print("Enter aptitude test score: ");
			score = TestException.getInteger();
			if (score >= 50) {
				System.out.println("You have a place on the course!");
			} else {
				System.out.println("Sorry, you failed your test.");
			}
		}
		catch (NumberFormatException e) {
			System.out.println("You entered an invalid number!");
			System.out.println(e); // same as System.out.println(e.toString());
		}
		catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Goodbye");
	}
}
