package classExample;

public class Checker {
	public static void main(String[] args) {
		CheckableOblong oblong1 = new CheckableOblong(10, 8);
		CheckableOblong oblong2 = new CheckableOblong(0, 8);
		
		System.out.println("oblong1 is " + oblong1.check());
		System.out.println("oblong2 is " + oblong2.check());
		
	}
}
