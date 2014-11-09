public class PhoneLauncher {
	public PhoneLauncher(){

	}

	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone("Apple iPhone");
		iphone.browseWeb("www.google.com");
		iphone.findPosition();
		
		iphone.call("02072345678");
		iphone.call("118118");

		iphone.playGame("Snake");

		iphone.ringAlarm("buy milk");

		iphone.call("Dad");

		iphone.call("Mum");

		iphone.call("Work");
		iphone.call("006173242422");

		System.out.println(iphone.getBrand());
	}
}