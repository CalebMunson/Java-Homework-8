package assignment8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Prompt 6: Create an object, serialize it, and store in the file or Database

//This file uses the serializable interface which allows the student object to be serialized.
//This allows the object to be saved into a text file or database.

public class Prompt6 {
	public static void main(String[] args) {
		Student stu = new Student(14, "Jane", 16);
		FileOutputStream file = null;
		ObjectOutputStream obj = null;
		
		try {
			file = new FileOutputStream("C:\\Users\\Caleb Munson\\Desktop\\HCL-GitDirectory\\Useful-Files\\Students.txt");
			obj = new ObjectOutputStream(file);
			obj.writeObject(stu);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

@Getter
@Setter
@AllArgsConstructor
class Student implements Serializable {
	private static final long serialVersionUID = 9999L;
	private int id;
	private String name;
	private int age;
}
