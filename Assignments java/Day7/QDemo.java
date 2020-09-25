package day7;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QDemo {
public static void main(String[] args) {
	Queue<String>names=new LinkedList<>();
	names.add("Hello");
	names.add("Hello");
	names.add("Hello");
	
	names.poll();
}
}
