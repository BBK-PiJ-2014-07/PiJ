public class StackTest {
	public static void main(String[] args) {
		StackNode<Integer> intStack = new StackNode<Integer>();
		StackNode<Double> doubleStack = new StackNode<Double>();

		intStack.push(53);
		doubleStack.push(35.34);
		System.out.println(intStack.isEmpty()? "It's empty" : "It's not empty");
		doubleStack.pop();
		System.out.println(doubleStack.isEmpty()? "It's empty" : "It's not empty");

	}
}