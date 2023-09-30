package dependencyinjectionconst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dependencyinjection.Company;

public class Driver {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("dependencyconst.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Company company = beanFactory.getBean("comp", Company.class);
		System.out.println(company);
		Trainer trainer = beanFactory.getBean("trainer",Trainer.class);
		System.out.println(trainer);
		
		
	}
	

}
