public class MobilePhoneTest {
	public static void main(String[] args) {
		MobilePhone mob = new MobilePhone();

		mob.call("07948200200");
		mob.call("01234567664");
		mob.call("02081234123");
		mob.call("01234434434");
		mob.call("07948200200");
		mob.call("111");
		mob.call("02072345678");
		mob.call("118118");

		mob.playGame("Snake");

		mob.ringAlarm("buy milk");

		mob.call("Dad");

		mob.call("Mum");

		mob.call("Work");
		mob.call("003273242422");

		mob.printLastNumbers();
	}
}