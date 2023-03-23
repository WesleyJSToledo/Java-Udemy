package orientacao_objeto.funcionario.program;
import orientacao_objeto.funcionario.entities.Funcionario;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();		
		
		funcionario.instaciarFuncionario();
		funcionario.imprimir();
		funcionario.calcularSalarioLiquido();
		
		System.out.println("Salario Reajustado: ");
		funcionario.imprimir();
	}
}
