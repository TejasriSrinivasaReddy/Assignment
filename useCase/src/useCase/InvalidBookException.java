package useCase;

public class InvalidBookException extends Exception {

	int isbn;
	public InvalidBookException(int isbn) {
		this.isbn=isbn;
	}
	
	public String toString() {
		return "Invalid Book";
	}
}
