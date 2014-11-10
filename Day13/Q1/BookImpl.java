public class BookImpl implements Book {
	private String author;
	private String title;
	private boolean taken;

	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
		taken = false;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public boolean isTaken(){
		if (taken == true){
			return true;
		} else {
			return false;
		}
	}

	public void setTaken(boolean status){
		taken = status;
	}
}