
public class Q5 {
	private int[] myNum = {10, 20, 30, 40,50,80,40};
	
	public int[] subArr(int start,int end)  
	{  
		int [] arr = new int[end - start +1];
		for( int i =0; i <end-start+1;i++) {
			arr[i] =myNum[i+start];
			
		} 
	  
	return arr;  
	}   



	public Q5() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Q5(int[] myNum) {
		super();
		this.myNum = myNum;
	}

	public static void main(String[] args) {
		
		Q5 q= new Q5();
		int [] t = q.subArr(3, 6);
		for(int i : t) {
			System.out.println(i);

			
		}
				
		
	}


	
}
