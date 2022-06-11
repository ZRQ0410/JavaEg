import java.util.Scanner;

public class Array1
{
	public static void main(String[] args)
	{
		double[] temperature;
		temperature = new double[7]; 
		/* or: double[] = new double[7];
		   no need to use 'new' if we know the values: double[] temperature = {9, 11.5, 11}; */
		
		enterTemps(temperature);
		displayTemps(temperature);
	}

	//*** actually fill on the original array: a copy of the array reference
	//*** void: modify the same array, no need to return the array
	static void enterTemps(double[] temperatureIn)
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < temperatureIn.length; i++) // enter temperatures
		{
			System.out.println("enter max temperature for day " + (i+1));
			temperatureIn[i] = keyboard.nextDouble();
		} 
		keyboard.close();
	}

	static void displayTemps(double[] temperatureIn)
	{
		System.out.println(); 
		System.out.println("***TEMPERATURES ENTERED***");
		System.out.println(); 
/*		for (int i = 0; i < temperatureIn.length; i++)
		{System.out.println("day "+ (i+1) +" "+ temperatureIn[i]);} */
		
		//*** for each loop:
		for (double item : temperatureIn)
		{System.out.println(item);}
	}
}
