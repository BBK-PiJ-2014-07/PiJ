public class SortedIntList {
	private SortedIntListNode head; 
	private int listSize;

	public SortedIntList(){
		head = null;
		listSize = 0;

	}

	public void makeHead(SortedIntListNode node) {
		head = node;
		head.setHeadNode();
	}

	public void add(int value) {
		SortedIntListNode newNode = new SortedIntListNode(value);
		if (head == null){
			makeHead(newNode);
		} else {
			head.addAtEnd(newNode);
		}
		newNode.setNext(head);
		listSize++;
	}

	public int size(){
		return listSize;
	}

	public void sort(SortedIntListNode node){
		//is this node bigger than the next one? if so, take it out and put it after
		if (node.getNext() != null ){
			if (node.getValue() > node.getNext().getValue()) {
					// if we are sorting the head node and it's bigger
					if (node.equals(head)){
						//int value = node.getValue();
						
						makeHead(node.getNext());
						head.addNext(node);
						node = head;
					} else {
						node = node.getNext();
						node.addNext(node.getPrev().remove());
						System.out.println("It's larger");
					}
					
					
				}
			sort(node.getNext());	
			}
	}

	public void printList(SortedIntListNode node){
		System.out.println(node.getValue());
		if (node.getNext() != head) {
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