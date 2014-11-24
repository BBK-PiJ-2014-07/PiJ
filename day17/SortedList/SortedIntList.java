public class SortedIntList {
	private SortedIntListNode head; 

	public SortedIntList(){
		sentinel = null;
	}

	public void makeHead(SortedIntListNode node) {
		sentinel = node;
	}

	public void add(int value) {
		if (head == null){
			makeHead(new SortedIntListNode(value));
		} else {
			head.addAtEnd(value);
		}
	}

	public int size(){
		return count(head);
	}

	public int count(SortedIntListNode node){
		if (node != null) {
			return 1 + count(node.getNext());
		} else {
			return 0;
		}
	}

	public void sort(SortedIntListNode node){
		//is this node bigger than the next one? if so, take it out and put it after
		if (node.getNext() != null ){
			SortedIntListNode thisNode = node;
			if (node.getValue() > node.getNext().getValue()) {
					if (node.equals(head)){
						int value = node.getValue();
						makeHead(node.getNext());
						head.addNext(value);
						node = head;
					} else {
						thisNode = node.getNext();
						node.getNext().addNext(node.getPrev().remove());
						System.out.println("It's larger");
					}
					
					
				}
			sort(thisNode.getNext());	
			}
	}

	public void printList(SortedIntListNode node){
		System.out.println(node.getValue());
		if (node.getNext() != null) {
			printList(node.getNext());
		}
	}

	public static void main(String[] args){
		SortedIntList sil = new SortedIntList();
		sil.launch();
	}

	public void launch(){
		add(6);
		add(3);
		add(1);
		add(2);
		add(5);
		add(8);
		add(4);
		add(7);

		sort(head);
		printList(head);
	}
}