public class testMatrix {
	public static void main (String args[]) {
	int[][] myMatrix;
	myMatrix = new int[6][4];

	for (int i = 0; i < rows-1; i++) {
		for (int j = 0; j < cols-1; j++) {
			myMatrix[i][j] = 1;
		}
	}

	for (int i = 0; i < rows-1; i++) {
		for (int j = 0; j < cols-1; j++) {
			System.out.println("The element at myMatrix[" + i + "] [" + j + "] is: " + myMatrix[i][j]);
		}

	}


	}
}