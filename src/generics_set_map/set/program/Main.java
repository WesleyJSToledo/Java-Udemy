package generics_set_map.set.program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import generics_set_map.set.entities.Course;
import generics_set_map.set.entities.Student;
import generics_set_map.set.entities.Teacher;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Course courseA = new Course("A", new Teacher("Alex", 01), 01);
		Course courseB = new Course("B", new Teacher("Alex", 01), 02);
		Course courseC = new Course("C", new Teacher("Alex", 01), 03);

		courseA.addStudents(sc);
		courseB.addStudents(sc);
		courseC.addStudents(sc);

		Set<Student> allStudents = new HashSet<>();

		allStudents.addAll(courseA.getStudents());
		allStudents.addAll(courseB.getStudents());
		allStudents.addAll(courseC.getStudents());
		
		System.out.println("Total students: " + allStudents.size());
		
		sc.close();
	}
}
