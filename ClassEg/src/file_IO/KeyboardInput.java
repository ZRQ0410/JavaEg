package file_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) {
		
		// handle low-level info
		InputStreamReader input = new InputStreamReader(System.in);
		// handle high-level info
		BufferedReader reader = new BufferedReader(input);
		
		try {
			System.out.print("Enter a string: ");
			String test = reader.readLine();
			System.out.println("You entered: " + test);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
