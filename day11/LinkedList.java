public class LinkedList<T> {
	private ListNode<T> head = null;

	public LinkedList() {
	}

	public void makeHead(T newValue) {
		head = new ListNode<T>(newValue);

	}

	public ListNode<T> getHead() {
		return head;
	}

	public void populate(T[] array) {
		for (int i=0; i<array.length; i++) {
			add(array[i]);
		}
	}

	public String findValue(T value) {
		int result = head.findValue(value);
		if (result == -1) {
			return "Key not found";
		} else {
			for (int i=0; i==result; i++) {
				//iterate through values 
			
				return value;
			}
		}
	}

	public void add(T newValue) {
		head.add(newValue);
	}

	public void printList() {
		head.printNodes();
	}


}