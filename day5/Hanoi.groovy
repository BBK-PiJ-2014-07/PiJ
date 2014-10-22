/* TOWERS OF HANOI
	Write a program that shows the minimum number of moves required for a tower of n blocks.
*/

long getMoves(int n) {
	if (n <=1) {
		return 1;
	}
	return (2*getMoves(n-1))+1;

}

println(getMoves(9));

