public class Fib {

	public static int fib(int n){
		if ((n == 1) || (n==2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}

}