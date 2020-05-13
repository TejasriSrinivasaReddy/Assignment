package useCase;

public class DuplicateBookException extends Exception{
	int isbn;
	public DuplicateBookException(int isbn) {
		this.isbn=isbn;
	}
	
	public String toString() {
		return "Duplicate Book";
	}

}
