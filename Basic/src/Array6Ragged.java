
public class Array6Ragged {
	
	public static void main(String[] args) {
		// ragged array
		char[][] animals = {
				{'M', 'O', 'N', 'K', 'E', 'Y'}, 
				{'C', 'A', 'T' }, 
				{'B', 'I', 'R', 'D'} 
				};
		// display
		for (int row = 0; row < animals.length; row++) {
			for (int col = 0; col < animals[row].length; col++) {
				System.out.print(animals[row][col]);
			}
			System.out.println(); // new line after one row displayed
		} } 
}

