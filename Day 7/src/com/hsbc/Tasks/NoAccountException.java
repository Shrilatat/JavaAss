package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : User-defined exception if no account as specified exists

public class NoAccountException extends Exception{

	public NoAccountException() {
		super();
	}

	public NoAccountException(String message) {
		super(message);
	}

}
