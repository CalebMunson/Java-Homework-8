package assignment8;

import java.io.File;
import java.io.FileInputStream;

//Prompt 1: Write a program for reading binary file

//This file reads in data from a .dat file and prints the contents to output

public class Prompt1 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File1.dat";
		
		try {
			FileInputStream file =  new FileInputStream(new File(fileName));
			
			int value;
			while ((value = file.read()) != -1) {
				System.out.println((char) value);
			}
			
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
