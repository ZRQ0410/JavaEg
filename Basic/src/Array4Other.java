
public class Array4Other 
{
	public static void main (String[] args) {
		int[] someArray = {3, 9, 20, 36, 25};
		System.out.println(max(someArray));
		System.out.println(sum(someArray));
		System.out.println(contains(3, someArray));
		System.out.println(search(someArray, 20));
	}
	
	static int max (int[] arrayIn) {
		int result = arrayIn[0];
		for (int i = 1; i < arrayIn.length; i++) {
			if(arrayIn[i] > result) {
				result = arrayIn[i]; // reset result to new maximum
			} 
		}
		return result;
	}
	
	static int sum(int[] arrayIn) {
		int total = 0;
		for (int currentElement : arrayIn) {
			total = total + currentElement;
		}
			return total;
		}
	
	// find whether the value is in the array
	static boolean contains(int valueIn, int... arrayIn) {
		for (int currentElement : arrayIn) {
			if (currentElement == valueIn) {
				return true; // exit if found
			} 
		}
		return false;
	}
	
	// find the position
	static int search(int[] arrayIn, int valueIn) {
		for (int i=0; i < arrayIn.length; i++) {
			if (arrayIn[i] == valueIn) {
				return i; // exit loop with array index
			} 
		}
		return -999; // indicates value not in list
	}
}
