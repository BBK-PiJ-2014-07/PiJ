print ("Enter text:");
String input = System.console().readLine();
int count = 0;
for (int i=0; i < input.length(); i++) {
	if (input.charAt(i) == 'e') {
		count++;
	} 
}
println ("You typed " + count + " Es!");