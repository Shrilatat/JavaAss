package JavaAss;

public class website {
	public static void main(String[] args) {
		String[] siteNames = {"www.google.com", 
							"www.msn.com", 
							"www.amazon.co.in", 
							"in.answers.yahoo.com", 
							"en.m.wikipedia.com", 
							"codehs.gitbooks.io", 
							"www.coderanch.com" };
		int total = 0;
		for (String s : siteNames)
			if (s.startsWith("www"))
				total++;
		
		System.out.println("Total Websites beginning with www = " + total);
	}
}