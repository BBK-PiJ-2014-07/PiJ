public class SortedIntListNode {
	private int value;
	private SortedIntListNode next;
	private SortedIntListNode prev;

	public SortedIntListNode(int value){
		this.value = value;
		next = null;
		prev = null;
	}

	public void addAtEnd(int num) {
		if (this.next == null) {
			this.next = new SortedIntListNode(num);
			this.next.prev = this;

		} else {
			this.next.addAtEnd(num);
		}
	}

	public void addNext(int num){
		SortedIntListNode temp = this.next;
		this.next = new SortedIntListNode(num);
		this.next.next = temp;
		this.next.prev = this;
	}

	public SortedIntListNode getNext(){
		return next;
	}

	public SortedIntListNode getPrev(){
		return prev;
	}

	public int getValue() {
		return value;
	}

	public int remove(){
		int deletedValue = this.next.getValue();
		this.next = this.next.next;
		this.next.prev = this;
		return deletedValue;
	}
}