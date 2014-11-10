public interface Book {
	String getAuthor();
	//returns the author of the book

	String getTitle();
	//returns the title of the book

	boolean isTaken();

	void setTaken(boolean status);
}