package lastconcept;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		Animal animal = ac.getBean("lion",Lion.class);
		Zoo zoo = ac.getBean("zoo", Zoo.class);
		zoo.zooSound();

		
		
		
		
	}
}
