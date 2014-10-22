public class matrixTest {
	public static void main(String[] args) {
		Matrix matrix = new Matrix(3,3);

		matrix.setElement(0,2,4);
		matrix.setRow(1,"1,2,3");
		matrix.setColumn(1,"4,5,6");
		matrix.prettyPrint();

		System.out.println(matrix.toString());

	}
}