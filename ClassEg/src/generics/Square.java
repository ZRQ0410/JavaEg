package generics;

public class Square {
	private int sideLength;
	
	public Square(int length) {
		sideLength = length;
	}
	
	public int getArea() {
		return sideLength * sideLength;
	}
	
	public void set(int length) {
		sideLength = length;
	}
	
	public int getPerimeter() {
		return sideLength * 4;
	}
}
