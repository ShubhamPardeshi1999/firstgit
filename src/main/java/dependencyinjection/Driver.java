package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructorinjection.Laptop;

public class Driver {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("company.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Company company =(Company) beanFactory.getBean("comp");
		System.out.println(company);
		
		
		
	}
	

}
