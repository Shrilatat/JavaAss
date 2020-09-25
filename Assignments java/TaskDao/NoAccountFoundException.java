package com.hsbc.modelaccount;

public class NoAccountFoundException extends Exception{
String s;
public NoAccountFoundException(String s) {
	super(s);
}
}