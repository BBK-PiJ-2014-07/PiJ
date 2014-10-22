String ranks = "A23456789JQK"

print "Please enter your first card.";
println "Rank (A 2 3 4 5 6 7 8 9 10 J Q K) and Suit (H D C S):"
String c1 = System.console().readLine();
int len = c1.length() 
int i = 0;

if (len == 2) { //for all ranks except 10
	while i < 12 {}
		if (r1.substring(0) != ranks.substring(i)) { 
			println "Invalid rank. Please re-enter your first card."
			println "Rank (A 2 3 4 5 6 7 8 9 10 J Q K) and Suit (H D C S):"
			String c1 = System.console().readLine();
	
			} else if (s1 != "C" || s1 != "S" || s1 != "H" || s1 != "D") {
				println "Invalid suit. Please re-enter your first card."
				println "Rank (A 2 3 4 5 6 7 8 9 10 J Q K) and Suit (H D C S):"
				String c1 = System.console().readLine();

			} else {
				println "Please input next card:"
			}
		

println (r1);






/*

//define enum with possible hands
enum Hand {
	STRFLUSH; //straight flush
	POKER;
	FULL;	//full house
	FLUSH;
	STRAIGHT;
	THREE;	//three of a kind
	TWO; //two pairs
	PAIR;
	NOTHING;
}
//cases with different possible hands
*/