import java.util.*;

public class LibraryImpl implements Library {
	private String libraryName;
	private int maxBooks;
	private ArrayList<String> users;
	private ArrayList<Integer> userIds;
	private ArrayList<Book> books;


	public LibraryImpl(String libraryName) {
		this.libraryName = libraryName;
		maxBooks = 0;
		users = new ArrayList<String>();
		userIds = new ArrayList<Integer>();
		books = new ArrayList<Book>();

	}

	public String getName() {
		return libraryName;
	}

	public ArrayList<User> setMaxBooks(int number){
		maxBooks = number;
		return new ArrayList<User>();
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public int getId(String name){
		if (users.contains(name)){
			return userIds.get(users.indexOf(name));
		} else {
			users.add(name);
			userIds.add(Math.abs(name.hashCode()));
			return getId(name);
		}

	}

	public void addBook(String title, String author){
		Book newBook = new BookImpl(author, title);
		if (!books.contains(newBook)) {
			books.add(newBook);
		}
	}


	public ArrayList<Book> getBookList(){
		return books;
	}

	public void takeBook(String title){
		for (Book b : books) {
			if (b.getTitle() == title) {
				if (!b.isTaken()){
					b.setTaken(true);
					
				} else {
					System.out.println("Book is already taken");
				}
				break;
			}
		}
	}

	public void returnBook(String title){
		for (Book b : books) {
			if (b.getTitle() == title){
				b.setTaken(false);
				break;
			}
		}
	}

	public int getReaderCount(){
		return users.size();
	}

	public int getBookCount(){
		return books.size();
	}

	public int getBookBorrowedCount(){
		int result = 0;
		for (Book b : books) {
			if (b.isTaken()){
				result++;
			}
		}
		return result;
	}

}