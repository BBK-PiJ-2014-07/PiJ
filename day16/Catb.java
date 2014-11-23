import java.io.*;

public class Catb {

	public static void main(String[] args){
		for (String s: args){
			File dir = new File("/Users/Sophie/Documents/Pij/" + s);
			if (dir.exists()){
				System.out.println(dir);
				for (String filename: dir.list()){
					System.out.println(filename);
				}
			} else {
				System.out.println("File " + dir + " does not exist.");
			}
			System.out.print("\n");
		}
	}
}