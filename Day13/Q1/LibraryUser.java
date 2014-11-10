public class LibraryUser implements User {
	private String name;
	private int id;
	private Library library;

	public LibraryUser(String name) {
		this.name = name;
		id = 0;
		library = null;
	}

	public String getName() {
		return name;
	}

	public int getId(){
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void register(Library library){
		this.library = library;
		setId(library.getId(name));
		
	}

	public Library getLibrary() {
		return library;
	}
}