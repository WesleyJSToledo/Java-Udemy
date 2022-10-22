import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero;
		
		System.out.println("Primeiro Valor: ");
		primeiroNumero = lerNumero.nextInt();
		
		System.out.println("Segundo Valor: ");
		segundoNumero = lerNumero.nextInt();
		
		if(primeiroNumero % segundoNumero == 0 
				|| segundoNumero % primeiroNumero == 0) {
			
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}
	}
}