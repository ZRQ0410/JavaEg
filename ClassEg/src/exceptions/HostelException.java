package exceptions;

public class HostelException extends RuntimeException {

	
	// constructor without parameter
	public HostelException() {
		super("error in this program"); // default error info
	}
	
	// constructor with parameter
	public HostelException(String message) {
		super (message);
	}
}
