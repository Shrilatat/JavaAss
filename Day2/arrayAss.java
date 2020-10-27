

public class arrayAss {
	public static void main(String[] args) {
		String s = "12345";
		int l=s.length();
		int arr[]=new int[l];
				
		int summ=0,j=0;
		int n = Integer.parseInt(s);
		while(n>0) {
			summ+=n%10;
			arr[j]=n%10;
			n=(int)n/10;
			j+=1;
		}
		System.out.println(summ);
		for(int i:arr)
			System.out.printf("%d ",i);
		System.out.println();
	}

}
