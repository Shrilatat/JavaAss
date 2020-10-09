package practice;

public class NoAccountFoundException extends Exception{
String s;

public NoAccountFoundException(String s) {
	super();
	this.s = s;
}

@Override
public String toString() {
	return "NoAccountFound :" + s + "]";
}

}
