import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		int  numRepeticao;
		double primeiroValor, segundoValor, divisao;
		
		System.out.println("Quanas Divisão será feita: ");
		numRepeticao = lerValores.nextInt();
		
		for (int i = 1; i <= numRepeticao; i++) {
			System.out.println("Primeiro Numero: ");
			primeiroValor = lerValores.nextDouble();
			
			System.out.println("Segundo Numero: ");
			segundoValor = lerValores.nextDouble();
			
			if(segundoValor == 0) {
				System.out.println("Divisão impossivel!");
			} else {
				divisao = primeiroValor / segundoValor;
				System.out.println("Divisão é: " +divisao);
			}
		}
	}
}
