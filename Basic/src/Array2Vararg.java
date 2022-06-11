
public class Array2Vararg {
	public static void main(String[] args)
	{
		double[] temperature = {7.5, 8.2, 7.7, 11.3, 10.75};
		System.out.println("Sending Array");
		displayTemps(temperature);
		System.out.println();
		System.out.println("Sending individual items");
		
		//*** call method with individual values
		displayTemps(7.5, 8.2, 7.7, 11.3, 10.75);
		displayTemps(9.9); // 1 value
		displayTemps( ); // no values
	}
	
	// display temperatures using varargs
	//*** varargs parameter must come last in the parameter list!
	static void displayTemps(double... temperatureIn)
	{
		System.out.println("***TEMPERATURES***"); 
		System.out.println("Number of temperatures: "+ temperatureIn.length); // count items
		
		for (double item : temperatureIn)
		{
			System.out.println(item + " ");
		} 
	}
}
