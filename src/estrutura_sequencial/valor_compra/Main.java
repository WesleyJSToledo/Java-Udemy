package estrutura_sequencial.valor_compra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValores = new Scanner(System.in);
		
		int codigoPeca, quantidadePeca;
		double valorPeca, valorTotal;
		
		System.out.println("Primeiro Produto: ");
		
		System.out.println("Codigo do Produto: ");
		codigoPeca = lerValores.nextInt();
		
		System.out.println("Quantidade de Produtos: ");
		quantidadePeca = lerValores.nextInt();
		
		System.out.println("Valor da Produto:");
		valorPeca = lerValores.nextDouble();
		
		valorTotal = quantidadePeca * valorPeca;
		
		System.out.println("Primeiro Produto: ");

		System.out.println("Codigo do Produto: ");
		codigoPeca = lerValores.nextInt();
		
		System.out.println("Quantidade de Produtos: ");
		quantidadePeca = lerValores.nextInt();
		
		System.out.println("Valor da Produto:");
		valorPeca = lerValores.nextDouble();
		
		valorTotal += quantidadePeca * valorPeca;
		
		System.out.println("Valor total: R$" +valorTotal);
		
		lerValores.close();
	}

}
