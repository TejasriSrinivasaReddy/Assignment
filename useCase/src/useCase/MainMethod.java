package useCase;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) throws InvalidBookException, DuplicateBookException, InvalidISBNException {
		Book b=new Book();
		
		 Scanner s= new Scanner(System.in);
		 System.out.println("WELCOME TO LIBRARY");
		 System.out.println("Please select your chocie");
		 int op;
		 do {
		 System.out.println("1.Add\t2.ListOfBooks\t3.Search\t4.exit");
		
			 
			  op=s.nextInt();
			 switch(op) {
			 
			 case 1:System.out.println("Book Title:");
				String title=s.next();
				
				System.out.println("Book ISBN:");
				int isbn=s.nextInt();
				
				System.out.println("Book Price");
				double price=s.nextDouble();
				System.out.println("Is it a reference book");
				boolean ref=s.nextBoolean();
				Book b1=new Book(title,isbn,price,ref);
				 	b.add(b1);break;
			 case 2:
				 ArrayList<Book>array=b.list();
				 for(Book b4:array) {
					 System.out.println(b4);
				 }break;
			 case 3:
				 System.out.println("Enter isbn");
				 int isb=s.nextInt();
				 System.out.println(b.search(isb));
				 break;
			 case 4:System.exit(0);		 
			 	break;
			 default: System.out.println("invalid");
			 break;
			 //case 3:i.list();break;
			 }
		 }while(op!=4);
		 
			 s.close();
			
	}
	
}
