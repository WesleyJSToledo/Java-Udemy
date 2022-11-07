import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		
		int numero = 0, fatorial = 1;
		
		System.out.println("Digite um Valor: ");
		numero = lerNumero.nextInt();
		
		if(numero == 0) {
			System.out.println("Fatorial é: 1");
		} else {
			for (int i = numero; i > 1; i--) {
				fatorial = fatorial * i;
			}
			System.out.println("Fatorial é: " +fatorial);
		}

		lerNumero.close();
	}
}
