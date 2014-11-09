public class NewString extends String {
	public void printEven(String s) {
		for (int i=1; i<s.length; i = i+2) {
			System.out.println(s.charAt(i));
		}
	}
}