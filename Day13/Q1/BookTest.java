import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {

	@Test
	public void testGetAuthor() {
		Book book1 = new BookImpl("Joyce", "Ulysses");
		assertEquals(book1.getAuthor(),"Joyce");
	}

	@Test
	public void testGetTitle() {
		Book book1 = new BookImpl("Joyce", "Ulysses");
		assertEquals(book1.getTitle(), "Ulysses");
	}
}