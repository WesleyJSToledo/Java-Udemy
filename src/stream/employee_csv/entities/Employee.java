package stream.employee_csv.entities;

public class Employee {
	private String name;
	private String email;
	private Double salary;
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalary() {
		return salary;
	}
}
