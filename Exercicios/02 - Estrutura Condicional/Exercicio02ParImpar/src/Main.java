import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Numero: ");
		numero = lerNumero.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}
	}

}
