import java.io.*;

public class Tr {
	String firstString;
	String secondString;

	public Tr(String firstString, String secondString){
		this.firstString = firstString;
		this.secondString = secondString;
	}

	public void translateFile(File file){
		BufferedReader in = null;
		String line;
		try {
			in = new BufferedReader(new FileReader(file));
			while ((line = in.readLine()) != null){
				System.out.println(line.replace(firstString, secondString));
			}
		} catch (FileNotFoundException ex){
			System.out.println("File " + file + " not found!");
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
	public void launch(File file){
		translateFile(file);
	}
	public static void main(String[] args){
		Tr translator = new Tr(args[1], args[2]);
		File file = new File(args[0]);
		translator.launch(file);
	}
}