package com.hsbc.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendClass {
	public static void main(String[] args) {
		Student s = new Student(101, 25, "Vishnu", "Pune", 170);
		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);
			oos.close();
			fos.close();
			System.out.println("Serialization done!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}