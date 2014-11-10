import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest  {
	@Test
	public void testGetId(){
		LibraryUser user1 = new LibraryUser("John");
		assertEquals(user1.getId(),0);
	}

	@Test
	public void testGetName(){
		LibraryUser user1 = new LibraryUser("John");
		assertEquals(user1.getName(),"John");
	}

	@Test
	public void testSetId(){
		LibraryUser user1 = new LibraryUser("John");
		user1.setId(1234);
		assertEquals(user1.getId(),1234);
	}

	@Test
	public void testGetLibrary(){
		Library lib = new Library();
		LibraryUser user1 = new LibraryUser("John");
		user1.register(lib);
		assertEquals(user1.getLibrary(), lib);
	}

}
