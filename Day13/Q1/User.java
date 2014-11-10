import java.util.*;

public interface User {
	String getName();
	
	int getId();

	void register(Library library);

	Library getLibrary();

	void borrowBook(Book book);

	void returnBook(Book book);

	ArrayList<String> getBorrowedList();
}