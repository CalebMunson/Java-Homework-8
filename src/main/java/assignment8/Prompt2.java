package assignment8;

import java.io.File;
import java.io.FileOutputStream;

//Prompt 2: Write a program for writing binary data into a file

//This file simply takes a string and writes it to a .dat file

public class Prompt2 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File1.dat";
		
		try {
			FileOutputStream fout = new FileOutputStream(new File(fileName));
			fout.write("abcdefghijklmnopqrstuvwxyz".getBytes());
			fout.write("\"".getBytes());
			
			fout.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
