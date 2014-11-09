public interface IntSortedList {

	void add(int newNumber);
	//adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
	
	boolean contains(int n);
	//returns true if the number is in the list, false otherwise

	String toString();
	//returns a string with the values of the elements in the list separated by commas

}