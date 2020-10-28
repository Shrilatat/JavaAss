public class digitsum {
	public static void main(String []args){
		int number = 123456;
		int sum = 0;
		int temp = 0;
		while (number !=0) {
			temp = number%10;
			sum = sum + temp;
			number /= 10;
			System.out.print(temp+" ");
		}
		System.out.println("");
		System.out.println(sum);
	}
}