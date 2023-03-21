import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantosValores;
		double soma = 0, media;
		
		System.out.println("Quantos numero você vai digitar?");
		quantosValores = sc.nextInt();
		
		double [] valores = new double [quantosValores];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i+1) + " Valor: ");
			valores [i] = sc.nextDouble();
		}
		System.out.print("Valores: ");
		for(double valor : valores) {
			System.out.print(valor+ " ");
			soma += valor;
		}
		
		media = soma / quantosValores;
		System.out.println();
		System.out.println("Soma: " +soma);
		System.out.println("A media é: " + media);
		
		sc.close();
	}

}
