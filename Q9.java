
public class Q9 {
	
	private int id,sal;
	private static int num = 0;
	private String name;

	public Q9(String name) {
		super();
		this.id = num;
		this.name = name;
		num = num + 1;
		
		// TODO Auto-generated constructor stub
	}
	public Q9(int sal, String name) {
		super();
		this.id = num; 
		this.sal = sal;
		this.name = name;
		num = num + 1;
	}
	
	
	@Override
	public String toString() {
		return "Q9 [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Q9 q1 = new Q9("Ram");
		Q9 q2 = new Q9(4500,"Sam");
		Q9 q3 = new Q9(3400,"Kam");
				
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
				
	}
	
	
	
	

}
