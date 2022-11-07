import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner lerSenha = new Scanner(System.in);
		
		int senha = 2002, chave = 0;
		
		while(chave != senha) {
			System.out.println("Digite a senha: ");
			chave = lerSenha.nextInt();
			
			if (chave != senha) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso permitido");
			}
			System.out.println();
		}

		lerSenha.close();
	}

}
