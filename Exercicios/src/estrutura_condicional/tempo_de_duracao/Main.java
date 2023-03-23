package estrutura_condicional.tempo_de_duracao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerHora = new Scanner(System.in);
		
		int horaInicial,  horaFinal;
		int tempoTotal;
		
		System.out.println("Hora Inicial: ");
		horaInicial = lerHora.nextInt();
		
		System.out.println("Hora Final: ");
		horaFinal = lerHora.nextInt();
		
		if (horaInicial < horaFinal) {
			tempoTotal = horaFinal - horaInicial;
		} else {
			tempoTotal = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " +tempoTotal+ " HORA(S)");

		lerHora.close();
	}
}
