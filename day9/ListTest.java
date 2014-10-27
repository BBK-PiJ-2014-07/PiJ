public class ListTest {
	
	public static void main(String[] args) {
		ListIntSet list = new ListIntSet(5);
		
		for (int i = 1; i<11; i++) {
			list.add(i);
		}
		System.out.println(list.containsVerbose(4)? "True": "False");

		System.out.println(list);

	}
}