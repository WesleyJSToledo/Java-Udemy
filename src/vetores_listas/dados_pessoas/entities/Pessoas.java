package vetores_listas.dados_pessoas.entities;

import java.util.Scanner;

public class Pessoas {
	private String nome;
	private char genero;
	private float altura;
	
	Scanner sc = new Scanner(System.in);
	public Pessoas(int i) {
		
		System.out.println("Digite o nome da " + i + "º Pessoa");
		this.nome = sc.next();

		System.out.println("Genero: ");
		this.genero = validadorGenero();
		
		System.out.println("Altura: ");
		this.altura = sc.nextFloat();
	}
	
	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return this.altura;
	}

	public char getGenero() {
		return genero;
	}

	private char validadorGenero() {
		char genero = ' ';
		boolean validador = false;
		
		while (validador == false) {
			genero = sc.next().charAt(0);
			
			if (genero == 'F' || genero == 'M') {
				validador = true;
			} else {
				System.out.println("Genero Invalido!!\nDigite Novamente (M/F): ");
			}
		}
		
		return genero;
	}
}
