import java.util.Scanner;

public class Array5TwoD {
	public static void main(String[] args) {
		double[][] temperature;
		temperature = new double [4][7]; 
		enterTemp(temperature);
		displayAllTemps(temperature);
	}
	
	static void enterTemp(double[][] temperatureIn) {
		Scanner keyboard = new Scanner (System.in);
		// control the week row
		for (int week = 1; week <= temperatureIn.length; week++) {
					
			// control the day column
			for (int day = 1; day <= temperatureIn[0].length; day++) {
				System.out.println("enter temperature for week " + week + " and day " + day);
				temperatureIn[week-1][day-1] = keyboard.nextDouble(); } 
			} }
	
	static void displayAllTemps(double[][] temperatureIn) {
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED***"); 

		for (int week = 1; week <= temperatureIn.length; week++) {
			for (int day = 1; day <= temperatureIn[0].length; day++) {
				System.out.println("week " + week + " day " + day + ": "+ temperatureIn[week-1][day-1]);
			} } }
}
