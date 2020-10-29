
public class WageEmp extends Ename{
	int hrs,rate;
public WageEmp(int id,String name,int hrs,int rate) {
	//super (id,name);
	super();
	this.hrs=hrs;
	this.rate=rate;
}

  public int calcSal() {
	  return hrs *rate;
  }

public void displayWageEmp() {
	super.displayEmp();
	System.out.println("WageEmp [hrs="+ hrs+",name="+name+"]");
}


public static void main(String [] args)
{
	WageEmp we1=new WageEmp(101,"Tul",80,2000);
	we1.displayWageEmp();
	System.out.println(we1.calcSal());
}

}
