print "Please enter a number.";
String s = System.console().readLine();
int i = Integer.parseInt(s); // user inputted number
int j = 1; // no of iterations over the pyramid

while (j <= i){
	int k = 0;
	println(" ");
	while (k < j) {
		print(j);
		k++;
	}
	j++;
}
println(" "); // add a new line at the end