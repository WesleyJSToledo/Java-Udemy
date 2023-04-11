package object_orientation.employee.program;

import object_orientation.employee.entities.Employee;

public class Main {
	public static void main(String[] args) {
		Employee funcionario = new Employee();		
		
		funcionario.registerEmployee();
		funcionario.print();
		funcionario.calculateNetSalary();
		
		System.out.println("Readjusted Salary: ");
		funcionario.print();
	}
}
