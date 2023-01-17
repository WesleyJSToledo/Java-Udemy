import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double [] valorA, valorB;
		
		System.out.println("Quantos valores irá digitar: ");
		n = sc.nextInt();
		
		valorA = new double [n];
		valorB = new double [n];
		
		for (int i = 0; i < valorA.length; i++) {
			System.out.print("Digite o " +(i+1)+ "º valor do vetor A: ");
			valorA[i] = sc.nextDouble();
		}
		
		System.out.println();
		for (int i = 0; i < valorB.length; i++) {
			System.out.print("Digite o " +(i+1)+ "º valor do vetor B: ");
			valorB[i] = sc.nextDouble();
		}
		
		System.out.println();
		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Soma dos" +(i+1)+ "valores: " +(valorA[i] + valorB[i]));
		}
		
		sc.close();
	}

}
