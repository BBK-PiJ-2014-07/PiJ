public class AquaticNonMammal extends NonMammal {
	
	public AquaticNonMammal(String name){
		super(name);
	}

	@Override 
	public void call() {
		System.out.println(this.getName() + " will not come...");
	}

}