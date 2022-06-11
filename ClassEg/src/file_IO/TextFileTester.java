package file_IO;

import classExample.EasyScanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileTester {
	public static void main(String[] args) {
		char choice;
		
		// create an empty list to hold cars
		List<Car> carList = new ArrayList<>();
		
		// read the list from file when program starts
		readList(carList);
		
		// menu
		do {
			System.out.println("\nText File Tester");
			System.out.println("1. Add a car");
			System.out.println("2. Remove a car");
			System.out.println("3. List all cars");
			System.out.println("4. Quit\n");
			choice = EasyScanner.nextChar();
			System.out.println(); 
			switch(choice) {
				case '1' : addCar(carList);
				break;
				case '2' : removeCar(carList);
				break;
				case '3' : listAll(carList);
				break;
				case '4' : writeList(carList); // write to the file
				break;
				default : System.out.print("\nPlease choose a number from 1 - 4 only.\n ");
			}
		} while(choice != '4');
	}

	
	// add a new car to the list
	static void addCar(List<Car> carListIn) {
		String tempReg;
		String tempMake;
		double tempPrice;
		
		System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
		System.out.print("Please enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Please enter the price: ");
		tempPrice = EasyScanner.nextDouble();
		carListIn.add(new Car(tempReg, tempMake, tempPrice));
	}
	
	
	// remove a car from the list
	static void removeCar(List<Car> carListIn) {
		int pos;
		
		System.out.print("Enter the position of the car to be removed: ");
		pos = EasyScanner.nextInt();
		carListIn.remove(pos - 1);
	}
	
	
	// display all cars in the list
	static void listAll(List<Car> carListIn) {
		for(Car item: carListIn) {
			System.out.println(item.getRegistration()
					+ " "
					+ item.getMake()
					+ " "
					+ item.getPrice());
		}
	}
	
	
	// write to the file
	static void writeList(List<Car> carListIn) {
		try(
				FileWriter carFile = new FileWriter("Cars.txt");
				PrintWriter carWriter = new PrintWriter(carFile);
			) {
			for(Car item: carListIn) {
				carWriter.println(item.getRegistration());
				carWriter.println(item.getMake());
				carWriter.println(item.getPrice());
			}
		}
		
		catch(IOException e) {
			System.out.println("There was a problem writing the file");
		}
	}
	

	// read the file
	static void readList(List<Car> carListIn) {
		String tempReg;
		String tempMake;
		String tempStringPrice;
		double tempDoublePrice;
		
		try(
				FileReader carFile = new FileReader("Cars.txt");
				BufferedReader carStream = new BufferedReader(carFile);
			) {
			// read first line
			tempReg = carStream.readLine();
			
			// read the rest
			while(tempReg != null) {
				tempMake = carStream.readLine();
				tempStringPrice = carStream.readLine();
				// convert price to double
				tempDoublePrice = Double.parseDouble(tempStringPrice);
				carListIn.add(new Car(tempReg, tempMake, tempDoublePrice));
				tempReg = carStream.readLine();
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("\nNo file was read.");
		}
		catch(IOException e) {
			System.out.println("\nThere was a problem reading the file.");
		}
	}


}
