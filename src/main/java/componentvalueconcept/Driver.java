package componentvalueconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("different.xml");
		Mobile mobile = ac.getBean("mobile",Mobile.class);
		System.out.println(mobile);
		
	}
	
	
}