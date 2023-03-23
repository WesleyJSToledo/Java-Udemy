package vetores_listas.dados_pessoas.program;

import java.util.Scanner;

import vetores_listas.dados_pessoas.entities.Pessoas;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, cont = 0, contMasculino = 0;
		float maiorAltura = 0, menorAltura, mediaFeminina = 0;

		System.out.println("Quantas pessoas ira cadastrar:");
		n = sc.nextInt();

		Pessoas[] pessoas = new Pessoas[n];

		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoas((i + 1));
		}
		
		menorAltura = pessoas[0].getAltura();
		for(Pessoas i : pessoas) {
			if(i.getAltura()> maiorAltura) {
				maiorAltura = i.getAltura();
			}
			
			if(i.getAltura() < menorAltura) {
				menorAltura = i.getAltura();
			}
			
			if(i.getGenero() == 'F') {
				mediaFeminina += i.getAltura();
				cont++;
			} else {
				contMasculino++;
			}
		}
		
		mediaFeminina = mediaFeminina/cont;
		
		System.out.println("Maior Altura: " +maiorAltura);
		System.out.println("Menor Altura: " +menorAltura);
		System.out.println("Media Altura Feminina: " +mediaFeminina);
		System.out.println("Numero de Pessoas do Genero Masculino: " +contMasculino);
		sc.close();
	}

}
