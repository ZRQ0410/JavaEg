package collection_framework;

public class Book implements Comparable<Book> {

	private String isbn;
	private String title;
	private String author;
	
	public Book(String isbnIn, String titleIn, String authorIn) {
		isbn = isbnIn;
		title = titleIn;
		author = authorIn;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "(" + isbn + ", " + title + ", " + author + ")";
	}
	
	@Override
	public boolean equals(Object objIn) {
		// type cast to a book
		Book bookIn = (Book) objIn;
		return isbn.equals(bookIn.isbn);
	}
	
	@Override
	// define a suitable hashCode method for Book class
	public int hashCode() {
		// derive hash code by returning hash code of ISBN string 
		return isbn.hashCode(); 
	}
	
	@Override
	public int compareTo(Book bIn) {
		return isbn.compareTo(bIn.isbn);
	}
}
