import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest  {
	@Test
	public void testGetId(){
		User user1 = new LibraryUser("John");
		assertEquals(user1.getId(),0);
	}

	@Test
	public void testGetName(){
		User user1 = new LibraryUser("John");
		assertEquals(user1.getName(),"John");
	}

	@Test
	public void testBorrow() {
		User user1 = new LibraryUser("John");
		Book b1 = new BookImpl("Austen", "Emma");
		user1.borrowBook(b1);
		assertEquals(user1.getBorrowedList().size(),1);
	}
}
