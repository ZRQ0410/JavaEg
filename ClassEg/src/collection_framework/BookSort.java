package collection_framework;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class BookSort {

	public static void main(String[] args) {
		Book b1 = new Book("9999999999", "Clowning Around", "Joe King"); 
		Book b2 = new Book("2222222222", "Travel With Me", "Sandy Beach");
		Book b3 = new Book("4444444444", "Interior Design", "Anita Room");
	
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		// Book objects are sorted on ISBN numbers
		// we can use sort method here because 
		// Book class implements Comparable interface & compareTo is defined in Book class
		System.out.println("***COMPARABLE DEMO***");
		System.out.println("\nBefore Sort\n"+bookList);
		Collections.sort(bookList);
		System.out.println("\nAfter sort\n"+ bookList);
		
		// sort list using sort method of List and a Comparator implementation
		bookList.sort((book1,book2) -> {
			return book1.getAuthor().compareTo(book2.getAuthor());
		});
		System.out.println("\nAfter Author sort\n"+ bookList);
	
		// comparing method: using getISBN method reference
		bookList.sort(Comparator.comparing(Book::getISBN));
		System.out.println("\nAfter ISBN sort\n"+ bookList);
	
	}
}
