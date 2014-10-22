package lesson6;

print("Please enter a number: ")
String num1 = System.console().readLine();
int x1 = Integer.parseInt(num1);
print("Please enter another number: ")
String num2 = System.console().readLine();
int y1 = Integer.parseInt(num2);

Calculator calc = new Calculator(x1,y1);

println("Adding the two numbers: " + add(calc));
println("Subtracting second number from first: " + subtract(calc));
println("Multiplying the two numbers: " + multiply(calc));
println("Dividing first number by second: " + divide(calc));
println("Modulus of the two numbers: " + modulus(calc));