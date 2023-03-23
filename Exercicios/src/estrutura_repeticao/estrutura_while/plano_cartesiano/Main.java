package estrutura_repeticao.estrutura_while.plano_cartesiano;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerCoordenadas = new Scanner(System.in);
		
		double x = 1, y = 1;
		
		boolean escolha  = false;
		
		while(escolha == false) {
			System.out.println("Digite a coordenada X: ");
			x = lerCoordenadas.nextDouble();
			
			System.out.println("Digite a coordenada Y: ");
			y = lerCoordenadas.nextDouble();
			
			escolha = (x == 0 && y == 0) ? true : false;
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x <= 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x <= 0 && y <= 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y <= 0) {
				System.out.println("Quarto");
			} else {
				System.out.println("Fim do Programa");
			}
		}

		lerCoordenadas.close();
	}
}
