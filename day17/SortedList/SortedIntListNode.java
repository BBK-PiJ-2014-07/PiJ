public class SortedIntListNode {
	private int value;
	private SortedIntListNode next;
	private SortedIntListNode prev;
	private boolean isHeadNode;

	public SortedIntListNode(int value){
		this.value = value;
		next = null;
		prev = null;
		isHeadNode = false;
	}

	public void addAtEnd(SortedIntListNode newNode) {
		if (this.next.isHead()) {
			this.next = newNode;
			this.next.prev = this;

		} else {
			this.next.addAtEnd(newNode);
		}
	}

	public void setHeadNode(){
		isHeadNode = true;
	}

	public boolean isHead(){
		return isHeadNode;
	}
	public void addNext(SortedIntListNode newNode){
		SortedIntListNode temp = this.next;
		this.next = newNode;
		this.next.next = temp;
		this.next.prev = this;
	}

	public void setNext(SortedIntListNode node) {
		this.next = node;
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

	public SortedIntListNode remove(){
		SortedIntListNode deletedNode = this.next;
		this.next = this.next.next;
		this.next.prev = this;
		return deletedNode;
	}
}