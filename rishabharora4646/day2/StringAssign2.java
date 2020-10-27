
public class StringAssign2 {
	public static void  main(String[] args) {
		String[] arr = {"www.google.com","www.msn.com","www.amazon.in","in.answers.yahoo.com","en.m.wikipedia.com","codehs.gitbooks.io","www.coderanch.com"};
		int count = 0;
		for(String s: arr) {
			if (s.contains("www"))
				count = count + 1;
		}
		System.out.println(count);
	}
}
