package com.hsbc.modelacc;

/**
* class for throwing user defined exception
*
/
public class NoAccountFoundException extends Exception{
String s;

public NoAccountFoundException(String s) {
	super(s);

}
}