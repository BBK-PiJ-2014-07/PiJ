public class PhoneLauncher {
	public PhoneLauncher(){

	}

	public void testPhone(Phone p) {
		SmartPhone sp = (SmartPhone) p;
		p.call("02081231234");
		sp.browseWeb("www.twitter.com");
	}

	public static void main(String[] args) {
		PhoneLauncher pl = new PhoneLauncher();
		MobilePhone mob = new MobilePhone("Nokia");
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

		System.out.println("Testing testPhone():");
		pl.testPhone(iphone);

	}
}