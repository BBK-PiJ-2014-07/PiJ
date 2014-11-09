public abstract class Animal {
	private String name = null;

	public Animal(String name) {
		this.name = name;
	}
	public void call(){
		System.out.println(this.name + " coming...");
	}

	public String getName() {
		return name;
	}
	public abstract void reproduce();

	public String makeSound(){
		//make sound
		String sound = this.name + " is making a sound.";
		return sound;
	}

}