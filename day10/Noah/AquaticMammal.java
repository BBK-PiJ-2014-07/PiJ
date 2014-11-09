public class AquaticMammal extends Mammal {
	
	public AquaticMammal(String name){
		super(name);
	}

	@Override 
	public void call() {
		System.out.println(this.getName() + " will not come...");
	}

}