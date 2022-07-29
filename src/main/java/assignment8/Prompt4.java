package assignment8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//Prompt 4: Write a program for writing to text file using char stream

//This f ile takes input from a txt file and outputs it to another txt file

public class Prompt4 {
	public static void main(String[] args) throws Exception {
		String fileName1 = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File2.txt";
		String fileName2 = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File3.txt";
		File file1 = new File(fileName1);
		File file2 = new File(fileName2);
		FileReader fReader = new FileReader(file1);
		FileWriter fWriter = new FileWriter(file2);
		
		char stream[] = new char[(int) file1.length()];
		fReader.read(stream);
		
		fWriter.write(stream);
		fWriter.flush();
	}
}
