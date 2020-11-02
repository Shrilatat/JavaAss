
public class NumberOfSites {
	public static void main(String[] args) {
		String[] sites = {"www.amazon.com", "www.facebook.com", "in.answers.yahoo.com","codehs.gitbooks.io"}; 
		int count=0;
		String compare="www";
		for(int i=0; i<sites.length;i++) {
			if(compare.equals(sites[i].substring(0, 3))) {
				count+=1;
			}
		}
		System.out.println("Count is: "+count);
	}
}
