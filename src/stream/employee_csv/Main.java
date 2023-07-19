package stream.employee_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import stream.employee_csv.entities.Employee;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("res/stream/employee.csv"))){
			
			String line = br.readLine();
			List<Employee> employees = new ArrayList<>();
			
			
			while(line != null) {
				String [] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary:");
			Double salary = sc.nextDouble();
			
			List <String> employeeNames = employees.stream()
					.filter(e -> e.getSalary() >= salary)
					.map(e -> e.getEmail()).collect(Collectors.toList());
					
			employeeNames.sort((x, y) -> x.compareTo(y));
			
			
			System.out.printf("Email of people whose salary is more than: %.2f \n", salary);
			employeeNames.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
