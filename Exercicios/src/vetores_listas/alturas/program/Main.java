package vetores_listas.alturas.program;

import java.util.Scanner;

import vetores_listas.alturas.entities.Pessoas;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantasPessoas;
		float somaAtura = 0, mediaAltura;

		System.out.println("Quantas Pessoas Irá Cadastrar? ");
		quantasPessoas = sc.nextInt();

		Pessoas[] pessoas = new Pessoas[quantasPessoas];

		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoas();
			
			pessoas[i].instanciarValores();
			
			somaAtura += pessoas[i].getAltura();
		}

		mediaAltura = somaAtura / quantasPessoas;
		System.out.println("Media de Altura: " + mediaAltura);

		for (Pessoas pessoa : pessoas) {
			if (pessoa.getIdade() <= 16) {
				System.out.println(pessoa.getNome());
			}
		}
		sc.close();
	}

}
