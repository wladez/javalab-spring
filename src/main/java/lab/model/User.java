package lab.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component("userFormBean")
public class User {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
}
