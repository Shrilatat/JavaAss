
public class SalesEmp extends WageEmp{

	int com;
	
	public SalesEmp(int id,String name,int hrs,int rate,int com)
	{
		super(id,name,hrs,rate);
		this.com=com;
	}
	public int Sal() {
		return com+super.calcSal();
	}

	public static void main(String[] args)
	{
		SalesEmp e1=new SalesEmp(101,"Tul",80,2000,1500);
		System.out.println(e1.Sal());
	}
}
