public class UserImpl implements User {
	private String name;
	private int id;

	public UserImpl(String name) {
		this.name = name;
		id = 0;
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
}