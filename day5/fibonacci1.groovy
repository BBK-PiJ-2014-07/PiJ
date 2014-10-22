/* Write a small program with a method that calculates the n
th
element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways a
nd see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare
the time that is needed in each case
to find F(40) or F(45). */

void getFibonacci(int n) {
	if (n <= 0) {
		return;
	}
	long currentNum = 1;
	long prevNum = 0;
	for (int i = 1; i<n; i++) {
		long tempNum = currentNum;
		currentNum = currentNum + prevNum;
		prevNum = tempNum;
	}
	print currentNum + " ";
	

}

getFibonacci(1);