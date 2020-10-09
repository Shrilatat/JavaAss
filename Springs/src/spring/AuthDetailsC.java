package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuthDetailsC {
		public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("authdetails.xml");
		AuthDetails ad=ctx.getBean("ad",AuthDetails.class);
		
		
		System.out.println(ad.toString());
		
	}

}
