import java.util.*;

public interface Library {
	String getName();

	int getMaxBooks();

	ArrayList<User> setMaxBooks(int number);

	int getId(String name);

	void addBook(String title, String author);

	void takeBook(String title);

	ArrayList<Book> getBookList();

	int getReaderCount();

	int getBookCount();

	int getBookBorrowedCount();
}