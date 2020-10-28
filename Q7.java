public class Q7 {
	private int num ;
	private String str;
	
	
	
	public Q7(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}



	public void printStr()
	{
		for(int i =0 ;i < this.num;i++)
		{
			System.out.println(this.str);
		}
	}
	
	public static void main(String[] args) {
		Q7 q = new Q7(5,"Temp");
		q.printStr();
	}

}
