package generics;

// create a simple generic class

public class Template<T> {

	private T t;
	public T get() {
		return t;
	}
	public void set(T tIn) {
		t = tIn;
	}
	
	public static void main(String args[]) {
		Template<Double> d = new Template<>();
		d.set(10.0); // Autoboxing
		Template<Integer> i = new Template<>();
		i.set(10);
		Template<Square> s = new Template<>();
		s.set(new Square(5));
		
		System.out.println("Double: " + d.get());
		System.out.println("Integer: " + i.get());
		System.out.println("Square: " + s.get().getArea());
	}
}
