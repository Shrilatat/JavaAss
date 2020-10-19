
public class SubClass extends PolymorphismExample{
	
	public void display() {
		System.out.println("In SubClass");  //Method Overriding runtime polymorphism example
	}
	
	public static void display1(){
		System.out.println("This method cannot be OVERRIDDEN because its static");  	//Static binding example
	}
	
	/* Method Overloading 
	 * compile time polymorphism example
	 */
	void add(int a){
		System.out.println(a+a);
	}
	
	void add(int a,int b){
		System.out.println(a+b);
	}
}
