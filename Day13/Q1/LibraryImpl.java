public class LibraryImpl implements Library {
	private String name;
	private int maxBooks;

	public LibraryImpl(String name) {
		this.name = name;
		maxBooks = 0;
	}

	public String getName() {
		return name;
	}

	public void setMaxBooks(int number){
		maxBooks = number;
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public int getId(String name){
		return 10;
	}
}