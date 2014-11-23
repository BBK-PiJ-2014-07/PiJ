import java.io.*;

public class Cat {

	public static void main(String[] args){
		File dir = new File("/Users/Sophie/Documents/Pij/" + args[0]);
		if (dir.exists()){
			for (String filename: dir.list()){
				System.out.println(filename);
			}
		} else {
			System.out.println("The file does not exist.");
		}
	}
}