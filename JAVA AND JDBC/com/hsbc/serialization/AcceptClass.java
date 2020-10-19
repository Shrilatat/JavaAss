package com.hsbc.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.hsbc.difference.Display;

public class AcceptClass {
	public static void main(String[] args) {
		Student o = null;
		try{
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			o = (Student)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Student Class not found!");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student name : " + o.getStuName());
		System.out.println("Student Age : " + o.getStuAge());
		System.out.println("Student roll No : " + o.getRollNo());
		System.out.println("Student Address : " + o.getStuAddress());
		System.out.println("Student Height : " + o.getStuHeight());
		
	}
}	
