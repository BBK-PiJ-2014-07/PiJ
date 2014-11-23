import java.io.*;

public class Mkdir {
	public static void main(String[] args){
		File dir = new File("/Users/Sophie/Documents/PiJ/day16/" + args[0]);
		dir.mkdir();
	}
}