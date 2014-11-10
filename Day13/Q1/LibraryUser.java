import java.util.*;

public class LibraryUser implements User {
	private String name;
	private int id;
	private ArrayList<Book> booksBorrowed;

	private Library library;

	public LibraryUser(String name) {
		this.name = name;
		id = 0;
		library = null;
		booksBorrowed = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public int getId(){
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void register(Library library){
		this.library = library;
		id = library.getId(name);
	}

	public Library getLibrary() {
		return library;
	}

	public void borrowBook(Book book){
		booksBorrowed.add(book);
	}

	public void returnBook(Book book){
		booksBorrowed.remove(book);
	}

	public ArrayList<String> getBorrowedList(){
		ArrayList<String> bookList = new ArrayList<String>();
		for (Book b: booksBorrowed){
			bookList.add(b.getTitle());
		}
		return bookList;
	}
}