import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Math.*;

public class HashTest {
	
	@Test
	public void testNumberHash(){
		int randomInput = (int) Math.random();
		String inputAsString = "" + randomInput;
		int hashOut = inputAsString.hashCode();
		int smallHashOut = HashUtilities.shortHash(hashOut);
		assertTrue("Less than 1000", smallHashOut<1000);
	}

	@Test 
	public void testWordHash(){
		String wordString = "testy test test";
		int wordHashOut = wordString.hashCode();
		int wordSmallHash = HashUtilities.shortHash(wordHashOut);
		assertTrue("Works!", wordSmallHash<1000);
	}
	@Test
	public void testZero(){
		String zero = "0";
		int zeroHashOut = zero.hashCode();
		int zeroSmallHash = HashUtilities.shortHash(zeroHashOut);
		assertTrue("Less than 1000", zeroSmallHash<1000);
	}

	//Null test - always fails (NullPointerException)
	/*@Test
	public void testNull(){
		String nullString = null;
		int nullHashOut = nullString.hashCode();
		int nullSmallHash = HashUtilities.shortHash(nullHashOut);
		assertTrue("Works!", nullSmallHash<1000);
	}*/

	@Test
	public void testEmptyString(){
		String emptyString = "";
		int emptyHashOut = emptyString.hashCode();
		int emptySmallHash = HashUtilities.shortHash(emptyHashOut);
		assertTrue("Works!", emptySmallHash<1000);
	}
}