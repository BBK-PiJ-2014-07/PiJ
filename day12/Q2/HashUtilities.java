public class HashUtilities {
	public HashUtilities(){}

	public static int shortHash(int num) {
		int result = num % 1000;
		return Math.abs(result);
	}

}