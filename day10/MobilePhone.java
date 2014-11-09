public class MobilePhone extends OldPhone {
	private String[] lastNumbers;

	public MobilePhone(String brand) {
		super(brand);
		lastNumbers = new String[10];
		for (int i=0; i<10; i++) {
			lastNumbers[i] = "empty";
		}
	}

	public void ringAlarm(String reminder) {
		System.out.println("BRRRING! Don't forget: " + reminder);
	}

	@Override
	public void call(String number) {
		System.out.println("Calling " + number + "...");
		rememberNumber(number);
	}

	public void rememberNumber(String number) {
		for (int i=9; i>0; i--) {
			//move every number in the list up one position
			lastNumbers[i] = lastNumbers[i-1];
		}
		lastNumbers[0] = number;
	}

	public void playGame(String game){
		System.out.println("Playing " + game);
	}

	public void printLastNumbers() {
		System.out.println("Last 10 numbers called: ");
		for (int i=0; i<10; i++) {
			//if (lastNumbers[i] != "empty") {
				System.out.println(lastNumbers[i]);
			//}
		}
	}

}