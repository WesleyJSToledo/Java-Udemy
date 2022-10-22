import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerX = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o valor X: ");
		x = lerX.nextInt();
		
		System.out.println("Valores Impares: ");
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
