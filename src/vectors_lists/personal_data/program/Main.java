package vectors_lists.personal_data.program;

import java.util.Scanner;

import vectors_lists.personal_data.entities.Person;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, count = 0, countMale = 0;
		float greaterHeight = 0, smallestHeight, avgFamale = 0;

		System.out.println("How many Person will register:");
		n = sc.nextInt();

		Person[] Person = new Person[n];

		for (int i = 0; i < Person.length; i++) {
			Person[i] = new Person((i + 1));
		}
		
		smallestHeight = Person[0].getHeight();
		for(Person i : Person) {
			if(i.getHeight() > greaterHeight) {
				greaterHeight = i.getHeight();
			}
			
			if(i.getHeight() <	smallestHeight) {
				smallestHeight = i.getHeight();
			}
			
			if(i.getGender() == 'F') {
				avgFamale += i.getHeight();
				count++;
			} else {
				countMale++;
			}
		}
		
		avgFamale = avgFamale/count;
		
		System.out.println("Highest Height: " +greaterHeight);
		System.out.println("Smallest Height: " + smallestHeight);
		System.out.println("Average Height Female: " +avgFamale);
		System.out.println("Number of Person of the Male Gender: " +countMale);
		sc.close();
	}

}
