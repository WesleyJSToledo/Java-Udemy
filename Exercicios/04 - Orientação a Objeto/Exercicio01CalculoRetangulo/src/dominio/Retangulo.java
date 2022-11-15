package dominio;
import java.util.Scanner;
public class Retangulo {
	private double altura;
	private double base;

	public void instanciarRetangulo() {
		Scanner lerValores = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retangulo: ");
		base = lerValores.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo:");
		altura = lerValores.nextDouble();
		
		lerValores.close();
	}
	
	public double area() {
		return(altura * base);
	}
	
	public double perimetro() {
		return (2 * (altura + base));
	}
	
	public double diagonal() {
		return (Math.sqrt((base * base) + (altura * altura)));
	}
}
