public class ListNode<T> implements Node<T> {
	T value;
	ListNode<T> next;
	ListNode<T> prev;
	int index;

	public ListNode(T value) {
		this.value = value;
		next = null;
		index = 0;
	}

	public T getValue() {
		return this.value;
	}

	public ListNode<T> getPrev() {
		return this.prev;
	}

	public ListNode<T> getNext() {
		return this.next;
	}

	public void printNodes() {
		if (this.next == null) {
			System.out.println(this.value.toString());
		} else {
			System.out.println(this.value.toString());
			this.next.printNodes();
		}
	}

	public int findValue(T key) {
		if (key.equals(this.value)) {
			return index;
		} else {
			if (this.next == null) {
				return -1;;
			} else {
			index++;
			this.next.findValue(key);
			}
		}
		return -1;
	}

	public void iterate(int index) {
		for (int i=0; i==index; i++) {
			
		}
	}

	public void add(T newValue) {
		if (this.next == null) {
			this.next = new ListNode<T>(newValue);
			this.next.prev = this;
		} else {
			this.next.add(newValue);
		}
	}

}
