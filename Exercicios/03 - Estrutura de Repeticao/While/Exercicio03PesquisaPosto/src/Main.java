import java.awt.dnd.DragSource;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerOpcao = new Scanner(System.in);
		
		int opcao = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while (opcao != 4) {
			System.out.println("PESQUISA DO POSTO");
			System.out.println(":1 Alcool");
			System.out.println(":2 Gasolina");
			System.out.println(":3 Diesel");
			System.out.println(":4 Sair");
			
			System.out.print("Digite uma Opção: ");
			opcao = lerOpcao.nextInt();
			
			System.out.println("\n");
			
			switch (opcao){
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				break;
				
			default:
				System.out.println("Digite uma opção valida");
			}
		}
		
		System.out.println("Alcool: " +alcool);
		System.out.println("Gasolina: " +gasolina);
		System.out.println("Diesel: " +diesel);
	}

}
