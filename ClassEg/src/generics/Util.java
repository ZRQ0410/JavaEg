package generics;

//generic method with bounded type

public class Util {

	// use bounded type parameters, declare T&U to be subtype of Number
	public static <T extends Number, U extends Number> double sum(Template<T> t, Template<U> u) {
		return t.get().doubleValue() + u.get().intValue();
	}
	
	public static void main(String args[]) {
		Template<Double> d = new Template<>();
		d.set(10.0);
		Template<Integer> i = new Template<>();
		i.set(10);
		System.out.println(Util.sum(d,i));
	}
}
