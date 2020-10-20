package com.trg.annon;

interface I1 {
	abstract void m1();

}

/*
 * class myImp implements I1 {
 * 
 * @Override public void m1() { System.out.println("In m1()");
 * 
 * }
 * 
 * }
 */

public class Demo1
{

public static void main(String[] args) {
	I1 i1 = new I1() {
		
		@Override
		public void m1() {
			System.out.println("in m1()");
		}
	};

			
			
			
	i1.m1();
	
	//Lambda Expression
	
	I1 i2 = () -> System.out.println("innn m1()");
	i2.m1();
	
	

	
}
}
