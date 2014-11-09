public class ArrayStack<N extends Number> implements Stack<N> {
	private N[] contents;
	private int headIndex;
	private static final int INITIAL_SIZE = 5;

	public ArrayStack() {
		headIndex = 0;
		contents = (N[]) Object[INITIAL_SIZE];   // = new N[10]
	}


	public void push(N newElement) {
		contents[headIndex] = newElement;
		headIndex++;
	}

	public N pop() {
		if (headIndex == 0) {
			return null;
		} 
		
		headIndex--;
		N result = contents[headIndex];
		contents[headIndex] = null;
		return result; 

	}

	public boolean isEmpty() {
		if (headIndex == 0) {
			return true;
		} else {
			return false;
		}
	}

}