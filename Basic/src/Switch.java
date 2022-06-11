import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int security;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Secret Agents***");
		System.out.print("Enter security level (1,2,3) ");
		security = keyboard.nextInt();
		switch (security) { // no 'break': execute the rest instructions
		case 3:
			System.out.println("The code to access the safe is 007.");
		case 2:
			System.out.println("Jim Kitt is really a double agent.");
		case 1:
			System.out.println("Martinis in the hotel bar may be poisoned.");
			break;
		default:
			System.out.println("No such security level.");
		}
		keyboard.close();
	}
}
