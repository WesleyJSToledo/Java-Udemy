package object_orientation.enums.product_order.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Client {
	
	final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:ss");

	private String name;
	private String email;
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " " + birthDate  + " " + email + " ";
	}	
	
	
}
