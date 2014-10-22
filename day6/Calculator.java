public class Calculator {
	private int x;
	private int y;

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int add() {
		return x+y;
	}

	public int subtract() {
		return x-y;
	}

	public int multiply() {
		return x*y;
	}

	public double divide() {
		double dx = (double) x;
		double dy = (double) y;
		return dx / dy;
	}

	public int modulus() {
		return x % y;
	}

}