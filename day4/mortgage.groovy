/*


Write a program that asks the user for the total amount borrowed for a mortgage, the number of years to pay it back, and the interest rate (in this exercise, we assume it is a fixed rate). The program can then calculate how much must be paid at the end
￼4
t=c(1+ (r/ 100))
where t is the total, c is the cost (amount borrowed), and r is the rate as a percentage. The program should print: • The total amount to be paid
• The money to be paid every year
• The number of years before the interest is paid and only the initial capital remains
Write a method to calculate each piece of data.


*/

Double getTotal(double borrowed, double rate) {
	double result = 0.0;
	result = borrowed * (1 + (rate/100))	
	return result;

}

Double getYearlyPayment(double total, double years) {
	double result = 0.0;
	result = total / years;
	return  result;

}

int getYearsLeft(double total, int years, double moneyPerYear, double borrowed) {
	int result = 0;
	
	while (total - moneyPerYear > borrowed) {
		total = total - moneyPerYear;
		result++;
	
	}
	/*
	for (int i = 0; i<years; i++) {
		this.total - yearly;
		if (Math.abs(this.total - borrowed) < 10E-6) {
			return i;	
		}
	}*/
	return result; 
	
	
}

println ("Please enter the amount borrowed: ");
String sborrowed = System.console().readLine();
double borrowed = Double.parseDouble(sborrowed);

println ("Please enter number of years to pay mortgage: ");
String syears = System.console().readLine();
int years = Integer.parseInt(syears);

println ("Please enter the interest rate: ");
String srate = System.console().readLine();
double rate = Double.parseDouble(srate);

// calling the methods

double total = getTotal(borrowed, rate);

double moneyPerYear = getYearlyPayment(total, years);

int yearsLeft = getYearsLeft(total, years, moneyPerYear, borrowed);


println ("The total amount to be paid is " + total);
println ("The amount to be paid yearly is " + moneyPerYear);
println ("The number of years left before interest is paid off is " + yearsLeft);
