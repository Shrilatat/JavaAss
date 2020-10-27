
public class Website {
	
	public static void main(String[] args) {
		
		
		String[] arr = {"www.google.com","www.msn.com","www.amazon.co.in","in.answers.yahoo.com","en.m.wikipidea.com","codehs.gitbooks.io","www.coderanch.com"};
		int cnt = 0;
		for(int i = 0;i<arr.length;i++) {
			if( arr[i].subSequence(0,3).equals("www")) {
				cnt+=1;
			}
		}
		
		System.out.println(cnt);
	}

}
