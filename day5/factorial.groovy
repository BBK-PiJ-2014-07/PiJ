/*
Write a small program with a method that calculates the factorial of
an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways a
nd see which is more natural for you. If
one takes too long, try the other way.
*/


long factorial(int n) {
	if (n == 0) {
		return 1;
		} else {
			long factorial = n;
			for (int i = 1; i < n; i++) {
				factorial *= i;
			}
			return factorial;
		}

}

println factorial(16);