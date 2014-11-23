import java.io.*;
import java.util.Arrays;

public class Ls {

	public static void main(String[] args){
		File dir = new File("/Users/Sophie/Documents/PiJ/day16/");
		for (String s: dir.list())	{	
			System.out.println(s);
		}	
	}

}