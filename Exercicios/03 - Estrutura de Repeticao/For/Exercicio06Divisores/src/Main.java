import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um Valor: ");
		valor = lerValor.nextInt();
		
		System.out.println("Divisores: ");
		for (int i = 1; i <= valor; i++) {
			if(valor % i == 0) {
				System.out.println(i);
			}
		}
	}
}
