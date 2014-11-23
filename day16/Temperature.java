import java.io.*;
import java.util.ArrayList;

public class Temperature {

	public void readFile(File file){
		BufferedReader in = null;
		String line;
		int lineCount = 1;
		ArrayList<Integer> overallAvg = new ArrayList<Integer>(); 
		try {
			in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null) {
				ArrayList<Integer> thisLine = new ArrayList<Integer>();
				String[] splitInput = line.split(",");
				for (String s: splitInput){
					thisLine.add(Integer.parseInt(s));
				}
				int avg = getAverage(thisLine);
				overallAvg.add(avg);
				System.out.println("The average for line "+ lineCount + " is " + avg);
				lineCount++;

			}
			System.out.println("The overall average is " + getAverage(overallAvg));
		} catch (FileNotFoundException ex) {
			System.out.println("File " + file + " not found.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public int getAverage(ArrayList<Integer> numbers){
		int total = 0;
		for (int i: numbers){
			total = total + i;
		}
		return total/numbers.size();
	}

	public void launch(File file){
		readFile(file);
	}

	public static void main(String[] args){
		Temperature temp = new Temperature();
		File file = new File(args[0]);
		temp.launch(file);

	}


}