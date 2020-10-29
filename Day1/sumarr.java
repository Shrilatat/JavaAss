public class sumarr {
	int[] b1 = {10,20,30,40,50};
	int[] b2 = new int[b1.length];
	
	public static void main(String[] args) {
		/*sumarr d = new sumarr();
		d.method();
		d.Square();*/
	}
	
	public void method() {
		int sum=0;
		for(int a : b1)
			sum+=a;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+(sum/b1.length));
	}
	
	public void Square() {
		for(int a=0; a < b1.length; a++) {
			b2[a] = b1[a]*b1[a];
		}
	}

	public int[] subArr(int start, int end) {
		int[] arr = new int[end-start];
		for(int a=0; a < arr.length; a++) {
			arr[a] = b2[start+a];
		}
		return arr;
		
	}
	


}
