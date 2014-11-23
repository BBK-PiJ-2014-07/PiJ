import java.io.*;

import java.util.Arrays;

public class CpDir {

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
			System.out.println("File " + oldFile + " copied!");
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
		CpDir copier = new CpDir();
		File dir = new File(args[args.length-1]);
		//copy all the input filenames to an array
		String[] filesToCopy = new String[args.length-1];
		for (int i=0; i<args.length-1; i++) {
			filesToCopy[i] = args[i];
		}
		

		copier.launch(dir, filesToCopy);
	}

	public void launch(File dir, String[] filesToCopy){
		for (String filename : filesToCopy) {

			File oldFile = new File(filename);
			File newFile = new File(dir + "/" + filename);

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
}