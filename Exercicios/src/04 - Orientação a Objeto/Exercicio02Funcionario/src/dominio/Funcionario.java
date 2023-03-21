package dominio;

import java.util.Scanner;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public void instaciarFuncionario() {
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		nome = lerDados.next();
		
		System.out.print("Digite o salario Bruto \nR$");
		salarioBruto = lerDados.nextDouble();
		
		System.out.println("Digite a Porcentagem do Imposto: ");
		imposto = lerDados.nextInt();
		lerDados.close();
	}
	
	public void imprimir() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Salario: " +this.salarioBruto);
		System.out.println();
	}

	public void calcularSalarioLiquido() {
		salarioBruto += salarioBruto  * (imposto /100);
	}
}
