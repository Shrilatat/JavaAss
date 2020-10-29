
public class Ename {
	int id;
	String name;
	public Ename() {}
	
	public Ename(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void displayEmp()
	{
		System.out.println("Emp[id=" +id +",name="+name+"]");
	}
	
	public static void main(String [] args)
	{
		Ename e1=new Ename(101,"KK");
		System.out.println(e1);
	}
}
