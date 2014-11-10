import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {

	@Test
	public void testGetName() {
		Library lib = new LibraryImpl("Library");
		assertEquals(lib.getName(),"Library");
	}

	@Test
	public void testGetMaxBooks(){
		Library lib = new LibraryImpl("Library");
		assertEquals(lib.getMaxBooks(),0);
	}

	@Test
	public void testSetMaxBooks() {
		Library lib = new LibraryImpl("Library");
		lib.setMaxBooks(4);
		assertEquals(lib.getMaxBooks(),4);
	}

	@Test
	public void testGetId(){
		Library lib = new LibraryImpl("Library");
		assertEquals(lib.getId("John"), 2314539);
	}

	@Test
	public void testAddBook(){
		LibraryImpl lib = new LibraryImpl("Library");
		lib.addBook("Austen", "Emma");
		assertFalse(lib.getBookList().isEmpty());

	}

	@Test
	public void testTakeBook(){
		LibraryImpl lib = new LibraryImpl("Library");
		lib.addBook("Emma", "Austen");
		lib.takeBook("Emma");
		assertTrue(lib.getBookList().get(0).isTaken());
	}

	@Test
	public void testReturnBook(){
		LibraryImpl lib = new LibraryImpl("Library");
		lib.addBook("Emma", "Austen");
		lib.takeBook("Emma");
		lib.returnBook("Emma");
		assertFalse(lib.getBookList().get(0).isTaken());
	}

	@Test
	public void testBookCount(){
		LibraryImpl lib = new LibraryImpl("Library");
		lib.addBook("a", "a");
		lib.addBook("b", "b");
		lib.addBook("c", "c");
		lib.addBook("d", "d");
		lib.addBook("e", "e");
		assertEquals(lib.getBookCount(), 5);
	}

	@Test
	public void testReaderCount(){
		LibraryImpl lib = new LibraryImpl("Library");
		LibraryUser lu1 = new LibraryUser("Jane");
		lu1.register(lib);
		LibraryUser lu2 = new LibraryUser("Bob");
		lu2.register(lib);
		LibraryUser lu3 = new LibraryUser("Sarah");
		lu3.register(lib);
		assertEquals(lib.getReaderCount(), 3);
	}

	@Test
	public void testBorrowedCount(){
		LibraryImpl lib = new LibraryImpl("Library");
		lib.addBook("a", "a");
		lib.addBook("b", "b");
		lib.addBook("c", "c");
		lib.addBook("d", "d");
		lib.addBook("e", "e");
		lib.takeBook("a");
		lib.takeBook("c");
		lib.takeBook("e");
		assertEquals(lib.getBookBorrowedCount(), 3);
	}
}