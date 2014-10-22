print ("Enter word, all lowercase: ");
String input = System.console().readLine();

int i= 0;
int same = 0;

for (int j = (input.length()) - 1; j >= 0; j--) {
	print (input.charAt(j));
	if (input.charAt(j) == input.charAt(i)) {
		same++;
	}
	i++;
}

if (same == input.length()){
	println "\nIt's a palindrome!"
	} else { 
	println "\nNot a palindrome."
	}
