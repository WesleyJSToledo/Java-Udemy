package vetores_listas.aprovados.entities;

import java.util.Scanner;

public class Alunos {
	private String nome;
	private double[] notas;

	public Alunos(int i) {
		Scanner sc = new Scanner(System.in);

		notas = new double[2];

		System.out.println("Digite o Nome do " + i + "º Aluno: ");
		this.nome = sc.next();

		System.out.println("Digite a nota do 1º Semestre:");
		this.notas[0] = sc.nextDouble();

		System.out.println("Digite a nota do 2º Semestre:");
		this.notas[1] = sc.nextDouble();
		
		System.out.println();
		
		sc.close();
	}

	public double media() {
		return ((this.notas[0] + this.notas[1]) / 2);
	}
	public String getNome() {
		return this.nome;
	}
}
