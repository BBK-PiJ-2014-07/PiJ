public class NonMammal extends Animal {

	public NonMammal(String name) {
		super(name);
	}

	public void layEggs(){
		System.out.println(this.getName() + "laid an egg");
	}
	@Override
	public void reproduce() {
		layEggs();
	}
}