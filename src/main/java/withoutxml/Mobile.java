package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value("1")
	private int id;
	@Value("iphone")
	private String name;
	@Value("128")
	private String ram;
	
	@Autowired
	Charger charger;
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + ", charger=" + charger + "]";
	}
	
}
