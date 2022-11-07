import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerPedidos = new Scanner(System.in);
		
		int numeroPedido, quantidadeProduto;
		double valorTotal = 0.0;
		
		System.out.println("Codigo do pedido: ");
		numeroPedido = lerPedidos.nextInt();
		
		System.out.println("Quantidade: ");
		quantidadeProduto = lerPedidos.nextInt();
		
		switch (numeroPedido) {
			case 1:
				valorTotal = 4.0 * quantidadeProduto;
				break;
			case 2:
				valorTotal = 4.5 * quantidadeProduto;
				break;
			case 3:
				valorTotal = 5.0 * quantidadeProduto;
				break;
			case 4:
				valorTotal = 2.0 * quantidadeProduto;
				break;
			case 5:
				valorTotal = 1.5 * quantidadeProduto;
				break;
			default:
				System.out.println("Pedido Invalido!!");
				break;
		}
		
		System.out.printf("Valor final: R$%.2f", valorTotal);

		lerPedidos.close();
	}
}
