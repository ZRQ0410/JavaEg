import java.util.Scanner;

public class Array3ReturnArray 
{
	public static void main(String[] args)
	{
		double[] temperature ; 
		temperature = enterTemps();
		
		for (int i = 0; i < temperature.length; i++)
		{
			System.out.println(temperature[i]);
		}
	}
	
	// return an array, type: double[]
	static double[] enterTemps()
	{ 
		Scanner keyboard = new Scanner(System.in); 
		double[] temperatureOut = new double[7]; 
		for (int i = 0; i < temperatureOut.length; i++)
		{
			System.out.println("enter max temperature for day " + (i+1)); 
			temperatureOut[i] = keyboard.nextDouble(); // assign
		}
		keyboard.close();
		return temperatureOut;
	}
}
