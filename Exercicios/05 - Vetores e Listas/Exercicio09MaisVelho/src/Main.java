import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, id = 0;
		String[] nome;
		int[] idade;
		int maisVelho = 0;

		System.out.println("Digite quantas pessoas irá cadastrar: ");
		n = sc.nextInt();

		nome = new String[n];
		idade = new int[n];

		for (int i = 0; i < idade.length; i++) {
			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				id = i;
			}
		}

		System.out.println("Pessoa Mais Velha :" + nome[id]);

		sc.close();
	}
}
