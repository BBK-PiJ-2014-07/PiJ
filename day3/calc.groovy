print "First number: ";
String s1 = System.console().readLine();
double first = Double.parseDouble(s1);

print "Second number: ";
String s2 = System.console().readLine();
double second = Double.parseDouble(s2);

double total = 0;
boolean finished = false;


while (!finished) {

	println "Choose an option:";
	println "Choose 1 to add, 2 to subtract, 3 to multiply and 4 to divide.";
	String choice = System.console().readLine();
	int calc = Integer.parseInt(choice);


	switch (calc) {
		case 1:
		total = first + second;
		println total;
		finished = true;
		break;
	
		case 2:
		total = first - second;
		println total;
		finished = true;
		break;
		
		case 3:
		total = first * second;	 
		println total;
		finished = true;
		break;
	
		case 4:
		total = first / second;
		println total;
		finished = true;
		break;
	
		default:
		println "Incorrect option, please try again";
		break;
	}
}
