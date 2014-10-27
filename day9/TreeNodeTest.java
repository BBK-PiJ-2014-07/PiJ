public class TreeNodeTest {
	
	public TreeNodeTest() {

	}

	public static void main(String[] args) {
		IntegerTreeNode tree = new IntegerTreeNode(9);
		tree.add(5);
		tree.add(8);
		tree.add(11);
		tree.add(15);
		tree.add(1);
		tree.add(3);
		tree.add(13);
		tree.add(4);
		tree.add(149);

		System.out.println(tree.depth()); 
	}
}