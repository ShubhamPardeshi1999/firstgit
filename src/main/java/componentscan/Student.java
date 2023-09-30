package componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Student {

	public void duty() {
		System.out.println("to study");

	}
	
	@Value("1")
	private int id;
	@Value("sj")
	private String name;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}









