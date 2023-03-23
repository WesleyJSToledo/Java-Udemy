package vetores_listas.maior_posicao;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, posicao = 0;
		double [] valores;
		double maior = 0;
		
		System.out.println("Digite Quantos Valores irá digitar: ");
		n = sc.nextInt();
		
		valores = new double[n];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " +(i+1)+ "º valor: ");
			valores[i] = sc.nextDouble();
			
			if (i == 0) {
				maior = valores[i];
			} else if (valores[i] > valores[i - 1]) {
					maior = valores[i];
					posicao = i;
				}
		}
			
		System.out.println("Maior Valor: " + maior);
		System.out.println("Posicao do maior valor: "+ (posicao+1));
		
		sc.close();
	}

}
