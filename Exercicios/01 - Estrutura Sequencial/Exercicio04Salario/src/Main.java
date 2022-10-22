import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		
		int numeroFuncionario;
		double horaTrabalhada, valorHora, salario;
		
		System.out.println("Digite seu Numero: ");
		numeroFuncionario = lerNumero.nextInt();
		
		System.out.println("Quan você quanta por hora: ");
		horaTrabalhada = lerNumero.nextDouble();
		
		System.out.println("Quanta horas você trabalha por mês: ");
		valorHora = lerNumero.nextDouble();
		
		salario = horaTrabalhada * valorHora;
		
		System.out.println("Numero: " +numeroFuncionario);
		System.out.println("Salario: R$" +salario);
	}
}
