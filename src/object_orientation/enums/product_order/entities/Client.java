package object_orientation.enums.product_order.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Client {
	
	final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private String birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = sdf.format(birthDate);
	}

	@Override
	public String toString() {
		return name + " (" + birthDate + ") - " + email + " ";
	}	
	
	
}
