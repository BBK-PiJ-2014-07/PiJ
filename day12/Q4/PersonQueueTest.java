import org.junit.*;
import static org.junit.Assert.*;

public class PersonQueueTest {

	@Test
	public void testFirstInsert() {
		Till till1 = new Till("till1");
		Person p1 = new Person("Giles");
		till1.insert(p1);
		//assertNotEquals((Object) till1.getHead(), (Object) nullPerson);
      //assertNotEquals( Object unexpected,        Object  actual)
		assertNotNull(till1.getHead());
		
	}	
	@Test
	public void testSecondInsert() {
		Till till1 = new Till("till1");
		Person p1 = new Person("Bob");
		Person p2 = new Person("Alan");
		till1.insert(p1);
		till1.insert(p2);
		//assertNotEquals((Object) till1.getHead(), (Object) nullPerson);
      //assertNotEquals( Object unexpected,        Object  actual)
		assertNotSame(till1.getHead(), till1.getTail());
	}

	@Test
	public void testRetrieve() {
		Till till1 = new Till("till1");
		Person p1 = new Person("Emma");
		Person p2 = new Person("Fred");
		till1.insert(p1);
		till1.insert(p2);
		till1.retrieve();
		assertSame(till1.getHead(), till1.getTail());

	}

	@Test
	public void testAddRemoveAddAnother() {
		Till till1 = new Till("till1");
		Person p1 = new Person("Emma");
		Person p2 = new Person("Fred");
		Person p3 = new Person("Sarah");
		till1.insert(p1);
		till1.insert(p2);
		till1.retrieve();
		till1.insert(p3);
		assertNotSame(till1.getHead(), till1.getTail());
	}

	@Test
	public void testMoreThanTwo() {
		Till till1 = new Till("till1");
		Person p1 = new Person("Rob");
		Person p2 = new Person("Anna");
		Person p3 = new Person("Richard");
		till1.insert(p1);
		till1.insert(p2);
		till1.insert(p3);
		assertSame(till1.getPrev(p1), p2);
		assertSame(till1.getPrev(p2), p3);

	}


}