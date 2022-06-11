package collection_framework;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetEg {

	public static void main(String[] args) {
		Set<String> regNums = new HashSet<>();
		regNums.add("abcde");
		regNums.add("aaaaa");
		regNums.add("12345");
		System.out.println(regNums);
		
		// if already exists, return false
		System.out.println(regNums.add("12345"));
		System.out.println(regNums.add("00000"));
		System.out.println(regNums);
		
		// if it was not in the set initially, return false
		System.out.println(regNums.remove("00001"));
		
		System.out.println(regNums);
		
		// Iterator
		Iterator<String> elements = regNums.iterator();
		while (elements.hasNext()) {
			String item = elements.next();
			if (item.charAt(0) == 'a') {
				elements.remove();
			}
		}
		System.out.println(regNums);
	}
	
}
