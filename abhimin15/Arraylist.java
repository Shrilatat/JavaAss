
public class Arraylist {
	public int[] square(int arr[]) {
		int n = arr.length;
		int ans[]=new int[n];
		int j=0;
		for(int i:arr) {
			ans[j]=i*i;
			j+=1;	
		}
		return ans;
	}
	public int[] subarray(int arr[],int start,int end) {
		int n=end-start+1;
		int[] ans = new int[n];
		int j=0;
		for(int i=start;i<=end;i++) {
			ans[j]=arr[i];
			j+=1;
		}
		return ans;
	}
	public void evenNumber(int arr[]) {
		for(int i:arr) {
			if(i%2==0)
				System.out.printf("%d ",i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Arraylist lst = new Arraylist();
		int arr[]= {2,4,6,8,10};
		
		//first
		int summ=0;
		for(int i:arr){
			summ+=i;
		}
		System.out.println(summ+" "+summ/arr.length);
		
		//second
		int a[]=lst.square(arr);
		for(int i:a) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		//third
		int b[]=lst.subarray(a,1,3);
		for(int i:b) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		//fourth
		lst.evenNumber(arr);
		
	}
}
