import org.junit.*;
import static org.junit.Assert.*;

public class FibTest {
	@Test
	public void testFib() {
		Fib fib1 = new Fib();
		assertEquals(fib1.fib(40),102334155);
	}



}