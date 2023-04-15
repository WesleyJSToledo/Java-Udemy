package object_orientation.quarterly_notes.program;

import object_orientation.quarterly_notes.entities.Grades;

public class Main {

	public static void main(String[] args) {
		Grades grades = new Grades();

		grades.getAverage();
		grades.printGrades();

	}
}
