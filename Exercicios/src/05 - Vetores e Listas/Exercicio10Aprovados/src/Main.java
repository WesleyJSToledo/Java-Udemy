import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantos alunos ira cadastrar: ");
		n = sc.nextInt();

		Alunos[] alunos = new Alunos[n];

		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Alunos((i + 1));
		}
		
		System.out.println("Aprovados: ");
		for (Alunos i : alunos) {
			if(i.media() >= 6.0) {
				System.out.println(i.getNome());
			}
		}
		sc.close();
	}

}
