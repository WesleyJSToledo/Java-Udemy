import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantosValores, base;
		
		System.out.println("Quantos numero você vai digitar?");
		quantosValores = sc.nextInt();
		
		int [] valores = new int [quantosValores];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.print("Digite o "+ (i+1) + " Valor: ");
			base = sc.nextInt();
			
			if (base <= 10) {
				valores [i] = base;
			} else {
				System.out.println("Valor Invalido!!\ndigite um valor menor igual a 1010\n");
				i--;
			}
		}
		
		System.out.println("Numeros negativos: ");
		for (int valor : valores) {
			if (valor < 0) {
				System.out.println(valor);
			}
		}
		
		sc.close();
	}
	
	
}
