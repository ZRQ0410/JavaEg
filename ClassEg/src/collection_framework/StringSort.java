package collection_framework;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class StringSort {
	
	public static void main(String[] args) {
		
		// Array
		String[] citysArray = {"London", "Birmingham", "Manchester", "Liverpool"};

		System.out.println("Original Array " + Arrays.toString(citysArray));
	
		// convert Array to List
		List<String> citysList = Arrays.asList(citysArray);
		System.out.println("Original List " + citysList);
		
		// sort Array
		Arrays.sort(citysArray);
		System.out.println("Sorted Array " + Arrays.toString(citysArray));
		
		// sort List
		Collections.sort(citysList);
		System.out.println("Sorted List " + citysList);
	}
}
