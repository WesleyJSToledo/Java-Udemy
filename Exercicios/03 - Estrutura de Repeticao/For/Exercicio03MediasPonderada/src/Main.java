import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerNotas = new Scanner(System.in);
		
		double primeiraNota, segundaNota, terceiraNota, media;
		int numNotas;
		
		System.out.println("Digite quantas voce ira cadastrar: ");
		numNotas = lerNotas.nextInt();
		
		for (int i = 1; i <= numNotas; i++) {
			System.out.println(i+"º Aluno(a)");
			
			System.out.print("1º Nota:");
			primeiraNota = lerNotas.nextDouble();
			

			System.out.print("2º Nota:");
			segundaNota = lerNotas.nextDouble();
			

			System.out.print("3º Nota:" );
			terceiraNota = lerNotas.nextDouble();
			
			media = ((primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5)) / 10;
			
			System.out.println("Media Ponderada: " +media);
		}
	}
}
