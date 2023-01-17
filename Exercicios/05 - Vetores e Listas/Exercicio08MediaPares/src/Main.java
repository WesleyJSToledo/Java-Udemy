import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, divisor = 0;
		int[] valores;
		double soma = 0.0, mediaPares = 0.0;

		System.out.println("Digite quantos valores irá digitar: ");
		n = sc.nextInt();

		valores = new int[n];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valores: ");
			valores[i] = sc.nextInt();

			if (valores[i] % 2 == 0) {
				soma += valores[i];
				divisor++;
			}
		}

		mediaPares = soma / divisor;

		if (divisor != 0) {
			System.out.println("MEDIA DOS PARES: " + mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
