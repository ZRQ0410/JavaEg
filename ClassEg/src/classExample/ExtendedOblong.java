package classExample;
public class ExtendedOblong extends Oblong {
	private char symbol;

	// constructor
	public ExtendedOblong(double lengthIn, double heightIn, char symbolIn) {
		/*
		 * inherited from superclass constructor 
		 * when the attributes in the superclass are private, must be in the first line
		 * we don't need that when the attributes in the superclass are protected
		 */
		super(lengthIn, heightIn);
		symbol = symbolIn;
	}

	public void setSymbol(char symbolIn) {
		symbol = symbolIn;
	}

	public String draw() {
		String s = new String(); // start off with an empty string
		int l, h;
		/*
		 * in the next two lines we type cast from double to integer so that we are able
		 * to count how many times we print the symbol
		 */
		l = (int) getLength();
		h = (int) getHeight();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= l; j++) {
				s = s + symbol; // add the symbol to the string
			}
			s = s + '\n'; // add the <NEWLINE> character
		}
		return s; // return the string representation
	}

	public static void main(String[] args) {
		ExtendedOblong extOblong = new ExtendedOblong(10.2, 5.3, '*');
		System.out.println(extOblong.draw());
		extOblong.setSymbol('+');
		System.out.println(extOblong.draw());
	}
}