import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		System.out.print("Valor do Dolar: ");
		double cotacao = lerValores.nextDouble();
		
		System.out.print("Quantos dolares você precisa: ");
		double valorDesejado = lerValores.nextDouble();

		System.out.printf("Voce precisa de R$ %.2f", Dolar.conversor(cotacao, valorDesejado));
		
		lerValores.close();
	}

}
