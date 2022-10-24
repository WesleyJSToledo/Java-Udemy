import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);
		
		int numLinhas, primeiro, segundo, terceiro;
		
		System.out.println("Digite o Numeros de Linhas: ");
		numLinhas = lerValor.nextInt();
		
		for(int i = 1; i <= numLinhas; i++) {
			primeiro = i;
			segundo = (int) Math.pow(i, 2);
			terceiro = (int) Math.pow(i, 3);
			System.out.println(primeiro+" " +segundo+ " " +terceiro);
		}
	}

}
