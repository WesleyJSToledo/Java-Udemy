package vectors_lists.approved.program;

import java.util.Scanner;

import vectors_lists.approved.entities.Students;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("How many Students will register: ");
		n = sc.nextInt();

		Students[] Students = new Students[n];

		for (int i = 0; i < Students.length; i++) {
			Students[i] = new Students((i + 1));
		}
		
		System.out.println("Approved: ");
		for (Students i : Students) {
			if(i.avg() >= 6.0) {
				System.out.println(i.getName());
			}
		}
		sc.close();
	}

}
