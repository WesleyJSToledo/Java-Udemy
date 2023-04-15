package vectors_lists.older;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, id = 0;
		String[] name;
		int[] age;
		int older = 0;

		System.out.println("Enter how many people will register: ");
		n = sc.nextInt();

		name = new String[n];
		age = new int[n];

		for (int i = 0; i < age.length; i++) {
			System.out.print("Name: ");
			name[i] = sc.next();

			System.out.print("Age: ");
			age[i] = sc.nextInt();

			if (age[i] > older) {
				older = age[i];
				id = i;
			}
		}

		System.out.println("Elder Person:" + name[id]);

		sc.close();
	}
}
