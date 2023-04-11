package vectors_lists.personal_data.entities;

import java.util.Scanner;

public class Person {
	private String name;
	private char gender;
	private float height;
	
	Scanner sc = new Scanner(System.in);
	public Person(int i) {
		
		System.out.println("Enter the name of the " + i + "th Person");
		this.name = sc.next();

		System.out.println("Gender: ");
		this.gender = checkGender();
		
		System.out.println("Height: ");
		this.height = sc.nextFloat();
	}
	
	public String getName() {
		return name;
	}

	public float getHeight() {
		return this.height;
	}

	public char getGender() {
		return gender;
	}

	private char checkGender() {
		char gender = ' ';
		boolean validador = false;
		
		while (validador == false) {
			gender = sc.next().charAt(0);
			
			if (gender == 'F' || gender == 'M') {
				validador = true;
			} else {
				System.out.println("Invalid Gender!!\nType Again (M/F): ");
			}
		}
		
		return gender;
	}
}
