public class TreeTest {
	
	public static void main(String[] args) {
		TreeIntSet tree = new TreeIntSet(5);
		
		for (int i = 1; i<11; i++) {
			tree.add(i);
		}
		System.out.println(tree.containsVerbose(4)? "True": "False");

		System.out.println(tree);

	}
}