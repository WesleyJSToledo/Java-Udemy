package vectors_lists.heights.entities;

import java.util.Scanner;

public class Person {
	public String name;
	public int age;
	public float height;
	
	public void instanciarValores() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		this.name = sc.next();
		System.out.println("Age: ");
		this.age = sc.nextInt();
		System.out.println("Height: ");
		this.height = sc.nextFloat();
		System.out.println();
		
		sc.close();
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

}
