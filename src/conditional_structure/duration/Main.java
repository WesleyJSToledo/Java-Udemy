package conditional_structure.duration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startTime,  endTime;
		int tempoTotal;
		
		System.out.println("Start Time: ");
		startTime = sc.nextInt();
		
		System.out.println("End Time: ");
		endTime = sc.nextInt();
		
		if (startTime < endTime) {
			tempoTotal = endTime - startTime;
		} else {
			tempoTotal = 24 - startTime + endTime;
		}
		
		System.out.println("The Game Lasted " +tempoTotal+ " HORA(S)");

		sc.close();
	}
}
