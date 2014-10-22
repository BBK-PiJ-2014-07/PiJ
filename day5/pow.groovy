/* Create a class with a static method pow that takes two integers ( base and exponent ) 
and calculates the power, e.g. pow(2,3) calculates 2 3 . 
Is it easy to do this both iteratively and recursively? */

class Power {
	int base;
	int exponent;
	
	static int pow(Power p) {
		if (p.exponent == 0) {
			return 1;
			} else if (p.exponent == 1) {
				return p.base;
			}
		p.base = p.base * p.base;
		pow(p.base);
		p.exponent--;
	}
}

Power pwr = new Power();
pwr.base = 2;
pwr.exponent = 3;

println pow(pwr);