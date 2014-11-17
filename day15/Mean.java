import java.util.ArrayList;
import java.util.List;

public class Mean {
	private List<Integer> intList;
	private int numbers;

	public Mean(){
		intList = new ArrayList<Integer>();
		numbers = 0;
	}

	public Double getMean(List<Integer> intList){
		Double total = 0.0;
		int counter = 0;
		for (int i: intList) {
			total = total + i;
			counter++;
		}
		total = total / counter;
		return total;
	}

	public int getHowManyNumbers(){
		try {
			System.out.println("How many numbers would you like to enter?: ");
			numbers = Integer.parseInt(System.console().readLine());
		} catch (NumberFormatException ex) {
			System.out.println("Not a valid input, please try again: ");
			getHowManyNumbers();
		}
		return numbers;
	}

	public List<Integer> getInput() {
		try { 				
				System.out.println("Please enter " + getHowManyNumbers() + " numbers, separated by spaces: ");
				String str = System.console().readLine();
				String[] inputAsString = str.split("\\s+");
				if (inputAsString.length != numbers) {
					System.out.println("You didn't enter " + numbers + " numbers... please try again!");
					getInput();
				} else {
					for (String s: inputAsString){
						intList.add(Integer.parseInt(s));
					}
				}
				
		} catch(NumberFormatException ex) {
			System.out.println("What you entered is not a number!");
		}
		return intList;
	}

	public static void main(String[] args) {
		Mean mean = new Mean();
		mean.run();
	}
	public void run(){
		System.out.println("The mean is " + getMean(getInput()));
	}
}