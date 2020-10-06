package com.hsbc.anon;

interface I1
{
	void m1();
}

abstract class MyClass{
	abstract void m1();
}

//class MySubClass extends MyClass
//{
//
//	@Override
//	void m1() {
//		// TODO Auto-generated method stub
//		System.out.println("in m1");
//		
//	}
//	
//}

public class Demo1 {
	public static void main(String[] args) {
		//MyClass c = new MySubClass();
//		MyClass c = new MyClass() {
//			
//			@Override
//			void m1() {
//				// TODO Auto-generated method stub
//				System.out.println("in m1");
//				
//			}
//		};
		I1 i1 = new I1() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("in m1");
			}
		};
		
		i1.m1();
		
		
		I1 i2 = () -> System.out.println("in m1");
		i2.m1();
	}
}
