import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner lerNumeros = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, soma;
		
		System.out.println("Digite o Primeiro Valor: ");
		primeiroNumero = lerNumeros.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		segundoNumero = lerNumeros.nextInt();
		
		soma = primeiroNumero + segundoNumero;
		
		System.out.println("Soma = " +soma);
	}
}
