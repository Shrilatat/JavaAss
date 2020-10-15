
public class VarargsDemo {

	public static int add(int...arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30,40,50));
		System.out.println(add(1,2,3,4,5,6,7,8,9,10));
	}
}
