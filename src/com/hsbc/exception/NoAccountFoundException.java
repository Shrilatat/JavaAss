package com.hsbc.exception;


public class NoAccountFoundException extends Exception{
String s;

public NoAccountFoundException(String s) {
	super(s);

}
}