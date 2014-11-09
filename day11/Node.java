public interface Node<T> {

	public T getValue();

	public ListNode getPrev();

	public ListNode getNext();

	public void add(T newValue);

}