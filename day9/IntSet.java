public interface IntSet {

	void add(int newNumber);
	// adds a new int to the set; if it is there already, nothing happens.

	boolean contains(int n);
	// returns true if the number is in the set, false otherwise.

	boolean containsVerbose(int n);
	// returns the same values as previous method, but for every element that is checked, prints its value on screen.

	String toString();
	// returns a string with the values of the elements in the set separated by commas.

}