print ("Enter text:");
String input = System.console().readLine();

for (int i=0; i < input.length(); i++) {
	if (input.charAt(i) == ' ') {
		print ("\n");
	} else {
	print (input.charAt(i));
	}
}
print ("\n");