package useCase;

public class InvalidISBNException extends Exception{

	int isbn;
	public InvalidISBNException(int isbn) {
		this.isbn=isbn;
	}
	
	public String toString() {
		return "Invalid ISBN";
	}
}
