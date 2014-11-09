import org.junit.*;
import static org.junit.Assert.*;

public class ArrayStringStackTest {
	@Test 
	public void testFirstPush(){
		ArrayStringStack stack = new ArrayStringStack();
		stack.push("Hello world!");
		assertNotNull(stack.peek());

	}

	@Test
	public void testEmptyPeek() {
		ArrayStringStack stack = new ArrayStringStack();
		assertNull(stack.peek());
	}

	@Test
	public void testEmpty() {
		ArrayStringStack stack = new ArrayStringStack();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testPeek() {
		ArrayStringStack stack = new ArrayStringStack();
		stack.push("Hello world!");
		stack.push("Message 2");
		stack.push("Message 3");
		stack.push("Message 4");
		assertEquals(stack.peek(),"Message 4");

	}
}