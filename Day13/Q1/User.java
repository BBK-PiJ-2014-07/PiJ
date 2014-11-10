import java.util.*;

public interface User {
	String getName();
	
	int getId();

	void register(Library library);

	void borrowBook(Book book);

	void returnBook(Book book);

	ArrayList<String> getBorrowedList();
}