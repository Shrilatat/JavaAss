
public class Q6 {
	private int[] myNum = {10, 7, 35, 40,55,80,40};
	private int size = 7;



	public Q6() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void evenArr()  
	{  
		
		for( int i =0; i <size;i++) {
			
			if(myNum[i]%2 == 0)
			{
				System.out.println(myNum[i]);
			}
		
			
			
		} 
	  
	}   



	public Q6(int[] myNum, int size) {
		super();
		this.myNum = myNum;
		this.size = size;
	}


	public static void main(String[] args) {
		
		Q6 q= new Q6();
		q.evenArr();
			
		

}
}
