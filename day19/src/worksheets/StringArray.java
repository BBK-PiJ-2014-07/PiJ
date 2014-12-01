package worksheets;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args){
		StringArray sa = new StringArray();
		sa.launch();
		}
	
	public void launch(){
		
		String[] myArray = {"how", "i", "wish", "i", "could", "calculate", "pi"};
		System.out.println(Arrays.asList(myArray));
		
		System.out.println("Sorted by length: ");
		Arrays.sort(myArray, (s1, s2) -> s1.length() - s2.length());
		System.out.println(Arrays.asList(myArray));
		
		System.out.println("Sorted by reverse length: ");
		Arrays.sort(myArray, (s1, s2) -> s2.length() - s1.length());
		System.out.println(Arrays.asList(myArray));
		
		System.out.println("Sorted by first char: ");
		Arrays.sort(myArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println(Arrays.asList(myArray));

	} 
	
}
