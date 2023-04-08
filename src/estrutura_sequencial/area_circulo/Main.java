package estrutura_sequencial.area_circulo;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		double area, raio;
		
		System.out.println("Digite o Raio do Circulo: ");
		raio = lerValores.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("Area = " +area);
		
		lerValores.close();
	}

}
