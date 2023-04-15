package generics_set_map.set.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
	private String name;
	private Teacher teacher;
	private int code;
	private List<Student> students = new ArrayList<Student>();

	public Course(String name, Teacher teacher, int code) {
		this.name = name;
		this.teacher = teacher;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public int getCode() {
		return code;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Scanner sc) {
		
		
		System.out.println("How many students for course " + this.name + ": ");
		int j = sc.nextInt();
		
		String name;
		int code; 
		
		for(int i = 0; i < j; i++) {
			
			System.out.println("Name: ");
			name = sc.next();
			
			System.out.println("Code: ");
			code = sc.nextInt();
			
			students.add(new Student(name, code));
		}

	}
	
}
