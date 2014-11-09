public class RestrictedSmartPhone extends MobilePhone {
	public RestrictedSmartPhone(String brand){
		super(brand);
	}
	public void browseWeb(String url) {
		System.out.println("Connecting to " + url + "...");
		System.out.println("Now connected to " + url + ".");		

	}

	public void findPosition() {
		System.out.println("Waiting for GPS...");
		System.out.println("Your location: 51.506888, -0.169821");
	}

	@Override
	private void playGame(String game){
		System.out.println("Playing " + game);
	}

	@Override
	public void call(String number) {
		if (number.charAt(0) == '0' && number.charAt(1) == '0') {
			System.out.println("Calling " + number + " through the internet to save money.");
		} else {
			super.call(number);
		}
	}
}