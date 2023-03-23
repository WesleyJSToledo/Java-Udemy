package orientacao_objeto.notas_trimestrais.entities;

import java.util.Scanner;

public class Notas {
	private String nome;
	private double primeiroTrimestre;
	private double segundoTrimestre;
	private double terceiroTrimestre;
	private double media;
	private String estado;
	
	public void instanciarNotas() {
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Nome do Aluno:");
		nome = lerDados.next();
		
		System.out.println("Digite as Notas entre (0 - 100):");
		
		System.out.print("Primeiro Temestre:");
		primeiroTrimestre = lerDados.nextDouble();
		
		System.out.print("Segundo Temestre:");
		segundoTrimestre = lerDados.nextDouble();
		
		System.out.print("Terceiro Temestre:");
		terceiroTrimestre = lerDados.nextDouble();
		
		System.out.println();
		
		lerDados.close();
	}
	
	public void calcularMedia() {	
		media = ((primeiroTrimestre * 30) 
				+ (segundoTrimestre * 35) 
				+ (terceiroTrimestre * 35))/100;
		
		if (media >= 60) {
			estado = "Passou";
		} else {
			estado = "Não Passou";
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: " +nome);
		System.out.println("Media: " +media);
		System.out.println(estado);
	}
}
