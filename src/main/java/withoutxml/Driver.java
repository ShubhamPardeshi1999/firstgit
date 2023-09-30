package withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		Mobile mobile = ac.getBean("mobile",Mobile.class);
		System.out.println(mobile);
	}
	
	
}
