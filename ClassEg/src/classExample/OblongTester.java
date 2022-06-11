package classExample;
import java.util.Scanner;

public class OblongTester {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		double oblongLength, oblongHeight;
		Oblong myOblong1, myOblong2;
		
		// no parameters: call the empty constructor
		myOblong1 = new Oblong();
		
		System.out.print("Please enter the length of your Oblong: ");
		oblongLength = keyboard.nextDouble();
		System.out.print("Please enter the height of your Oblong: ");
		oblongHeight = keyboard.nextDouble();
		
		// create a new Oblong object
		myOblong2 = new Oblong(oblongLength, oblongHeight);

		System.out.println("Oblong length is " + myOblong2.getLength());
		System.out.println("Oblong height is " + myOblong2.getHeight());
		System.out.println("Oblong area is " + myOblong2.calculateArea());
		System.out.println("Oblong perimeter is " + myOblong2.calculatePerimeter()); 
	}
}
