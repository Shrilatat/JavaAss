package com.hsbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class WriteEmployee {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee obj=new Employee(11,"abhinav",80000);
	
	FileOutputStream fos = null;
	try {
		fos = new FileOutputStream("emp.txt");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	ObjectOutputStream oos = null;
	try {
		oos = new ObjectOutputStream(fos);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    try {
		oos.writeObject(obj);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    FileInputStream fin=new FileInputStream("emp.txt");
    ObjectInputStream oin=new ObjectInputStream(fin);
    Employee obj2=(Employee)oin.readObject();
    
    System.out.println(obj2.getEmpid()+" "+obj2.getEmpname());
}
}
