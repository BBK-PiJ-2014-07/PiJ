import org.junit.*;
import static org.junit.Assert.*;

public class UserTest  {
	@Test
	public void testGetId(){
		User user1 = new UserImpl("John");
		assertEquals(user1.getId(),0);
	}

	@Test
	public void testGetName(){
		User user1 = new UserImpl("John");
		assertEquals(user1.getName(),"John");
	}

	@Test
	public void testSetId(){
		User user1 = new UserImpl("John");
		user1.setId(1234);
		assertEquals(user1.getId(),1234);
	}
}
