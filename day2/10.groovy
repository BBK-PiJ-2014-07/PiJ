int j = 0; // counter
int prev = 0; //indicates what the previous value is

boolean finished = false;
boolean up = false; // set a boolean to tell if it's going up
boolean down = false; //boolean for down

while (!finished){
	print("Please enter a number, end with -1: ");
	String s = System.console().readLine();
	int num = Integer.parseInt(s);
	if (num != -1) {	//while not -1
			
		if (j == 1) {	//for the second value entered
			if (num == prev + 1){	//if it's one higher then going up
				up = true;
			} else if (num == prev - 1){ //if it's one lower, going down
				down = true;
			} else {
				up = false;
				down = false;
			}
		} else if (j > 1) { 	// for all values after the second one
			if (up == true) {
				if (num != prev + 1) {	// check to see if consecutive
					up = false;
					//finished = true; 	//if not, stop
				} else {
		 		   up = true;
				   prev = num; 
				}
			} else if (down == true) {
				if (num != prev - 1) {
					down = false;
					//finished = true;
				} else {
					down = true;
					prev = num;
				}
			} else {
				finished = true;
				up = false;
				down = false;
			}
		}
		prev = num;
		j++;
	} else {	// if -1 is entered, finish 
		finished = true;
	}
}
//if count is same as number of entries, print yes
if (up == true || down == true) {
	println("Yes");
} else {
	println("No");
}

	