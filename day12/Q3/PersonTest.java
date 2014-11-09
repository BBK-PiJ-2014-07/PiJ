import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Robert  Alan Fred Smith";
		String output = p.getInitials(input);
		String expected = "RAFS";
		assertEquals(output, expected);
	}

	public static void main(String[] args) {
		PersonTest pt = new PersonTest();
		pt.run();
	}

	public void run(){
		Person test = new Person();
		test.getInitials("Robert  Alan Fred Smith");

	} 
}