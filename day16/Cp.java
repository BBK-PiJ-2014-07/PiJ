import java.io.*;

import java.io.*;

public class Cp {

/** 
** Checks whether the target file already exists,
** and if so, asks the user if they want to overwrite it.
**/
	public void overwrite(File oldFile, File newFile){
		System.out.println("File " + newFile + " already exists. Would you like to overwrite? Y/N");
		String input = System.console().readLine();
		if (input.equals("y") || input.equals("Y")){
			System.out.println("File " + newFile + " will be overwritten.");
			copy(oldFile, newFile);
		} else if (input.equals("n") || input.equals("N")){
			System.out.println("The file will not be overwritten.");
		} else {
				System.out.println("Please enter Y or N.");
		}
	}

/**
** Copies the old file to the new file.
**/
	public void copy(File oldFile, File newFile){
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader(oldFile));
			out = new PrintWriter(newFile);
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + oldFile + " not found.");
		} catch (IOException ex){
			ex.printStackTrace();		
		} finally {
			//close the reader and writer.
			System.out.println("File copied!");
			closeReader(in);
			out.close();
		}
		
	}

	public void closeReader(Reader reader){
		try { 
			if (reader != null) {
				reader.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Cp copier = new Cp();
		File oldFile = new File(args[0]);
		File newFile = new File(args[1]);

		copier.launch(oldFile, newFile);
	}

	public void launch(File oldFile, File newFile){
		if (newFile.exists()){
			overwrite(oldFile, newFile);
		} else {
			try {
				newFile.createNewFile();
				copy(oldFile, newFile);
			} catch (IOException ex){
				ex.printStackTrace();
			}
		}
	}
}