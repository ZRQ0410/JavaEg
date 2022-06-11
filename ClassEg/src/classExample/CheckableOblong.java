package classExample;

public class CheckableOblong extends Oblong implements Checkable {
	
	public CheckableOblong (double lengthIn, double heightIn) {
		super(lengthIn, heightIn);
	}
	
	@Override
	public boolean check() {
		return getLength() > 0 && getHeight() > 0;
	}
}
