public class testCalculator {

	public static void main (String[] args) {
		System.out.print("Please enter a number: ");
		String num1 = System.console().readLine();
		int x1 = Integer.parseInt(num1);
		System.out.print("Please enter another number: ");
		String num2 = System.console().readLine();
		int y1 = Integer.parseInt(num2);

		Calculator calc = new Calculator(x1,y1);

		System.out.println("Adding the two numbers: " + calc.add());
		System.out.println("Subtracting second number from first: " + calc.subtract());
		System.out.println("Multiplying the two numbers: " + calc.multiply());
		System.out.println("Dividing first number by second: " + calc.divide());
		System.out.println("Modulus of the two numbers: " + calc.modulus());
	}
}
