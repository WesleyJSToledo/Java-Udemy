import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantosValores, quantidadePares = 0;

		System.out.println("Quantos valores você irá digitar? ");
		quantosValores = sc.nextInt();

		int[] valores = new int[quantosValores];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º Valor: ");
			valores[i] = sc.nextInt();
		}

		System.out.println("Numeros Pares: ");
		for (int valor : valores) {
			if (valor % 2 == 0) {
				System.out.print(valor + " ");
				quantidadePares++;
			}
		}
		
		System.out.println();
		System.out.println("Tem " +quantidadePares+ " Numeros Pares");
		
		sc.close();
	}

}
