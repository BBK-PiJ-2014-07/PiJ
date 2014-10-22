class Point {
	int x;
	int y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}


Point left = new Point();
print ("Please enter the top left x coordinate. ");
String lx = System.console().readLine();
left.x = Integer.parseInt(lx);

print ("Please enter top left y coordinate. ");
String ly = System.console().readLine();
left.y = Integer.parseInt(ly);

Point right = new Point();
print ("Please enter bottom right x coordinate. ");
String rx = System.console().readLine();
right.x = Integer.parseInt(rx);

print ("Please enter bottom right y coordinate. ");
String ry = System.console().readLine();
right.y = Integer.parseInt(ry);

Rectangle rect = new Rectangle(); 
rect.upLeft = left;
rect.downRight = right;

 
int length = (rect.downRight.x - rect.upLeft.x);
int height = (rect.upLeft.y - rect.downRight.y);

int perimeter = (2*height) + (2*length)
int area = height*length

println ("The perimeter of the rectangle is " + perimeter);
println ("The area of the rectangle is " + area);