package assignment8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Prompt 5: Write a program for BufferedReader and BufferedWriter

//This file takes in input from a text file through a BufferedReader and writes it to another text file via BufferedWriter

public class Prompt5 {
	public static void main(String[] args) throws Exception {
		String fileName1 = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File2.txt";
		String fileName2 = "C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\File3.txt";
		FileReader file = new FileReader(fileName1);
		FileWriter file2 = new FileWriter(fileName2);
		BufferedReader read = new BufferedReader(file);
		BufferedWriter write = new BufferedWriter(file2);
		
		int value;
		while ((value = read.read()) != -1) {
			write.write(value);
		}
		read.close();
		write.close();
		System.out.println("Process Complete...");
	}
}
