public class BookImpl implements Book {
	private String author;
	private String title;

	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}