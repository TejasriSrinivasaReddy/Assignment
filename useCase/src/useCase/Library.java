package useCase;

import java.util.List;

public interface Library {
	
	public void add(Book add)throws InvalidBookException,DuplicateBookException;
	public List<Book> list();

	public Book search(int isbn) throws InvalidISBNException;


}
