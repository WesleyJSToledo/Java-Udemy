package vectors_lists.heights.program;

import java.util.Scanner;

import vectors_lists.heights.entities.Person;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantityPerson;
		float sumHeight = 0, avgHeight;

		System.out.println("How many Person will Register? ");
		quantityPerson = sc.nextInt();

		Person[] Person = new Person[quantityPerson];

		for (int i = 0; i < Person.length; i++) {
			Person[i] = new Person();
			
			Person[i].instanciarValores();
			
			sumHeight += Person[i].getHeight();
		}

		avgHeight = sumHeight / quantityPerson;
		System.out.println("Average Height: " + avgHeight);

		for (Person pessoa : Person) {
			if (pessoa.getAge() <= 16) {
				System.out.println(pessoa.getName());
			}
		}
		sc.close();
	}

}
