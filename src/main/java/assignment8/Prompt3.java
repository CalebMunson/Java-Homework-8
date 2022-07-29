package assignment8;

import java.io.File;
import java.io.FileReader;

//Prompt 3: Write a program for reading text file using char stream

//This file takes input from a text file and prints the input

public class Prompt3 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File2.txt";
		File file = new File(fileName);
		FileReader fReader = new FileReader(file);
		
		char stream[] = new char[(int) file.length()];
		
		fReader.read(stream);
		System.out.println(stream);
	}
}
