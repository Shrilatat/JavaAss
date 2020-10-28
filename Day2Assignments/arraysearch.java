
public class arraysearch {
	public static void main(String[] args) {
		String []websites= {"www.amazon.com","www.flipkart.com","www.facebook.com","www.hsbc.co.in","en.wikipedia.com","indianrail.gov.in","www.irctc.co.in"};
		int counter=0;
		for(String s:websites) {
			if(s.indexOf("www.")==0)
				counter++;
		}
		System.out.println("Number of websites starting with www. is "+counter);
	}
}
