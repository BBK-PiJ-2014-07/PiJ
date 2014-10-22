public class Matrix {
	private int[][] matrix;

	public Matrix(int rows, int columns){

		matrix = new int[rows][columns];
		//initiate all values of matrix as 1
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = 1;
			}
		}
		
	}

	public void setElement (int x, int y, int newValue) {
		if (x >= matrix.length || y >= matrix[0].length ) {
			return;
		} else {
			matrix[x][y] =  newValue;
		}
		/* to modify one element of the array, given its position (the first two
		integers) and the new value to be put in that position (the third integer). 
		The method must check that the indeces are valid before modifying 
		the array to avoid an IndexOutOfBoundsException. If the indeces are
		invalid, the method will do nothing and the third argument will be ignored.*/
		
	}

	public void setRow (int position, String numbersIn) {
		String[] numbers = numbersIn.split(",");
		if (position >= matrix.length || numbers.length > matrix[0].length) {
			return;

		} else {
			int[] newRow = new int[numbers.length];
			for(int i =0; i<numbers.length; i++) {
				newRow[i] = Integer.parseInt(numbers[i]);
			}
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[position][i] = newRow[i];
			}
		}
	}

	public void setColumn(int position, String numbersIn) {
		String[] numbers = numbersIn.split(",");
		if (position >= matrix[0].length || numbers.length > matrix.length) {
			return;
		} else {
			int[] newCol = new int[numbers.length];
			for(int i =0; i<numbers.length; i++) {
				newCol[i] = Integer.parseInt(numbers[i]);
			}
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][position] = newCol[i];
			}
		}
	}

	public String toString() {		

		String semicolon = "; ";
		StringBuffer values = new StringBuffer();
		values.append("[");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				values.append(matrix[i][j]);
			}
			values.append(semicolon);
		}
		values.setLength(values.length() - semicolon.length());
		values.append("]\n");
		return values.toString();

	}

	public void prettyPrint() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j= 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}
}