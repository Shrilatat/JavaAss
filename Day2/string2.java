
public class string2 {
	public static void main(String []args){
		String[] arr = {"www.google.com","www.msn.com","www.amazon.co.in","in.answers.yahoo.com","em.wikipedia.com","gitbooks.io","www.coderanch.com"};
		
		int answer = 0;
		
		for(int a=0; a < arr.length; a++) {
			if (arr[a].startsWith("www")) {
				answer = answer+1;
			}
		}
		System.out.println(answer);
	}
}
