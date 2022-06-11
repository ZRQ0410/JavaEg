package exceptions;

import java.io.IOException;
public class TestException {

	public static int getInteger() throws IOException {
		// declare a large byte array
		byte[] buffer = new byte[512];
		System.in.read(buffer);
		String s = new String(buffer);
		s = s.trim(); // remove trailing spaces
		
		// convert string to a int
		int num = Integer.parseInt(s);
		return num;
	}
}
