print ("Enter text: ");
String input = System.console().readLine();

println ("Choose a character to count: ");
String character = System.console().readLine();
char mychar = character.charAt(0);

int count = 0;
for (int i=0; i < input.length(); i++) {
	if (input.charAt(i) == mychar) {
		count++;
	} 
}
println (mychar + " occurs "+ count + " times!");