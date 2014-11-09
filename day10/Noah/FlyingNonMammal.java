public class FlyingNonMammal extends NonMammal {

	public FlyingNonMammal (String name){
		super(name);
	}

	@Override 
	public void call() {
		System.out.println(this.getName() + " now flying, will come later when tired...");
	}

}