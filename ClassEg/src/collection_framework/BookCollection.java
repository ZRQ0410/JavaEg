package collection_framework;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class BookCollection {
	
	Map<String, Book> books;
	
	public BookCollection() {
		books = new HashMap<>();
	}
	
	public boolean addBook(Book bookIn) {
		String keyIn = bookIn.getISBN();
		if(books.containsKey(keyIn)) {
			return false;
		}
		else {
			books.put(keyIn, bookIn);
			return true;
		}
	}
	
	public boolean removeBook(String isbnIn) {
		if(books.remove(isbnIn) != null) {
			return true;
		}
		else { return false; }
	}
	
	public int getTotalNumberOfBooks() {
		return books.size();
	}
		
	public Book getBook(String isbnIn) {
		return books.get(isbnIn);
	}
	
	public Set<Book> getAllBooks() {
		Set<Book> bookSet = new HashSet<>();
		books.forEach((key, book) -> bookSet.add(book));
		return bookSet;
	}
}
