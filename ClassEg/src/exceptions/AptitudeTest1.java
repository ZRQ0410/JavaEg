package exceptions;

// Pass the error on to the caller of the method: (ineffective)

import java.io.IOException;
public class AptitudeTest1 {

	public static void main (String[] args) throws IOException {
		int score;
		System.out.print("Enter aptitude test score: ");
		
		// getInteger() may throw and IOException
		score = TestException.getInteger();
		if (score >= 50) {
			System.out.println("You have a place on the course!");
		} else {
			System.out.println("Sorry, you failed your test.");
		}
	}
}
