public class Mammal extends Animal {

	public Mammal(String name){
		super(name);
	}

	public void giveBirth(){
		System.out.println(this.getName() + "had a baby");
	}

	@Override
	public void reproduce() {
		giveBirth();
	}

}