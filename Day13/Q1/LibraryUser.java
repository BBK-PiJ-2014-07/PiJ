public class LibraryUser extends UserImpl {
	Library library;

	public LibraryUser(String name) {
		super(name);
		library = null;
	}

	public void register(Library library){
		this.library = library;
		
	}

	public Library getLibrary() {
		return library;
	}

}
