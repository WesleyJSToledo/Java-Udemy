package estrutura_condicional.intervalo_valores;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);
		
		float valor;
		String intervalo;
		
		System.out.println("Digite o Valor:");
		valor = lerValor.nextFloat();
		
		if(valor >= 0 && valor <= 25) {
			intervalo = "[0, 25]";
		} else if(valor > 25 && valor <= 50) {
			intervalo = "[25, 50]";
		} else if(valor > 50 && valor <= 75) {
			intervalo = "[50, 75]";
		} else if(valor >= 75 && valor <= 100) {
			intervalo = "[75, 100]";
		} else {
			intervalo = "Inválido";
		}
		
		System.out.println("Intervalo " +intervalo);

		lerValor.close();
	}

}
