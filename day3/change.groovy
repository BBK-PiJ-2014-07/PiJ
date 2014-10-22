import java.lang.Math;

boolean validInput = false;
double cost = 0;
double tendered = 0;

while (!validInput) {
	print "Total of purchase: £";
	String strprice = System.console().readLine();
	cost = Double.parseDouble(strprice);

	print "Amount tendered: £"
	String strtendered = System.console().readLine();
	tendered = Double.parseDouble(strtendered);

	if (tendered < cost) {
		println "Amount tendered is less than total cost. Please try again."
		} else {
			validInput = true;
		}
}
//get the total change
int change = ((tendered - cost) * 100);
println "Your change is " + change + "p"; 
//IT WORKS UP TO HERE


//counters for denominations
int fifty = 0;
int twenty = 0;
int ten = 0;
int five = 0;
int two = 0;
int one = 0;
int fiftyp = 0;
int twentyp = 0;
int tenp = 0;
int fivep = 0; 
int twop = 0;
int onep = 0;

while (change != 0) {

	if (change >= 5000) {
		change = change - 5000;
		fifty++
		
		} else { 
			if (change >= 2000) {
				change = change - 2000;
				twenty++;
		
				} else {
					if (change >= 1000) {
						change = change - 1000;
						ten++;
			
						} else {
							if (change >= 500) {
								change = change - 500;
								five++;
				
								} else { 
									if (change >= 200) {
										change = change - 200;
										two++;
					
										} else {
											if (change >= 100) {
												change = change - 100;
												one++;
							
												} else {
													if (change >= 50) {
														change = change - 50;
														fiftyp++;
												
														} else {
															if (change >= 20) {
																change = change - 20;
																twentyp++;
															
																} else { 
																	if (change >= 10) {
																		change = change - 10;
																		tenp++;
																	
																		} else { 
																			if (change >= 5) {
																				change = change - 5;
																				fivep++;
																			
																				} else {
																					if (change >= 2) {
																						change = change - 2;
																						twop++;
																					
																						} else {
																							if (change >= 1) {
																								change = change - 1;
																								onep++;
																								}
																							
																							
																							}
																					}
																			}
																	}
															}
												}
										}
								}
						}
				}
		}
}
															
println "Change required: ";
println fifty + " x £50";
println twenty + " x £20";
println ten + " x £10";
println five + " x £5";
println two + " x £2";
println one + " x £1";
println fiftyp + " x 50p";
println twentyp + " x 20p";
println tenp + " x 10p";
println fivep + " x 5p";
println twop + " x 2p";
println onep + " x 1p";
