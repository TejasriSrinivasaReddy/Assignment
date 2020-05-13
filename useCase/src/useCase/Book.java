package useCase;

import java.util.ArrayList;
import java.util.List;

public class Book implements Library{

	protected int isbn;
	protected String title;
	protected double price;
	protected boolean reference=true;
	ArrayList<Book> a=new ArrayList<Book>();
	Book(){
		
	}
	Book(String title,int isbn,double price,boolean ref){
		this.title =title;
		this.isbn =isbn;
		this.price =price;
		this.reference=ref;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isReference() {
		return reference;
	}
	public void setReference(boolean reference) {
		this.reference = reference;
	}
	@Override
	public void add(Book add) throws InvalidBookException, DuplicateBookException {
		if(add.getIsbn()<1)throw new InvalidBookException(isbn);
		a.add(add);
		System.out.println("Book added");
	}
	@Override
	public ArrayList<Book> list() {
		// TODO Auto-generated method stub
		
		return a;
	}
	@Override
	public Book search(int isbn) throws InvalidISBNException {
		for(Book b5:a) {
			if(b5.isbn==isbn) {
				return b5;
			}
		}
		return null;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", reference=" + reference + ", a=" + a
				+ "]";
	}
	
	
}
