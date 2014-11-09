public class SortedList<T> extends LinkedList<T> {
	private ListNode<T> head;

	public SortedList() {
		head = null;
	}

	@Override 
	public void add(T newValue){
		ListNode<T> newNode = new ListNode<T>(newValue);
		if (head == null) {
			head = newNode;

		} else {
			if (newValue < head.getValue()) {
				head.add(newValue);
			} else {	
				head.getNext().add(newValue);
			}
		}
	

	}


}