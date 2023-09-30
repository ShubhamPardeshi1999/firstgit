package componentscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("component.xml");
		BeanFactory beanFactory = new XmlBeanFactory(res);
		Student strudent = beanFactory.getBean("student", Student.class);
		Trainer trainer = beanFactory.getBean("trainer", Trainer.class);
		strudent.duty();
//		trainer.duty();
		
	}
	
	
}
