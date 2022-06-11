package exceptions;

import classExample.EasyScanner;

public class ThrowException {
	public final int MAX;

	public ThrowException(int maxIn) {
		if (maxIn < 1) {
			// 1. use a predefined exception
			// throw new RuntimeException("invalid list size set " + maxIn);

			// 2. use a user-defined exception
			throw new HostelException("invalid list size set " + maxIn);
		} else {
			MAX = maxIn;
		}
	}

	public static void main(String[] args) {

		try {
			System.out.print("Enter size of list: ");
			int size = EasyScanner.nextInt();
			ThrowException p = new ThrowException(size);
		}
		catch (HostelException e) {
			System.out.println(e);
		} 
		catch (Exception e) {
			System.out.println("Some unforseen error");
			e.printStackTrace();
		}
		System.out.println("End of demo");
	}
}
