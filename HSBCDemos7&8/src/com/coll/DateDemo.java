package com.coll;

import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date d1 = new Date();
	System.out.println(d1);
	
	System.out.println(d1.getDate()); //Deprecated
	System.out.println(d1.getDay());  //deprecated
	
}
}
