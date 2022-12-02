import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco conta = null;

		String nome, numeroConta;
		char tipo;
		int opcao;
		double valor;
		boolean escolha;

		cabecalho();
		System.out.println("Criando Conta:");

		escolha = true;
		System.out.print("Nome: ");
		nome = scanner.next();

		do {
			System.out.print("Deseja incluir Saldo [S/N]: ");
			tipo = scanner.next().charAt(0);

			if (tipo == 'S' || tipo == 's') {
				
				System.out.print("Saldo Inicial: ");
				valor = scanner.nextDouble();
				conta = new Banco(nome, valor);

			} else if (tipo == 'N' || tipo == 'n') {

				conta = new Banco(nome);

			} else {

				System.out.println("Opção Invalida");
				escolha = false;
			}
			
		} while (escolha != true);

		System.out.println();
		
		cabecalho();
		System.out.println("Acessar Conta: ");

		do {
			escolha = true;

			System.out.print("Nome: ");
			nome = scanner.next();

			System.out.print("Numero Conta: ");
			numeroConta = scanner.next();

			if (nome.equals(conta.getNome()) && numeroConta.equals(conta.getNumeroConta())) {

				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Acesso Negado");
				escolha = false;
			}

		} while (escolha != true);

		limpaTela();

		do {
			escolha = true;
			cabecalho();

			System.out.println(
					"[0] Sair" + "\n[1] Depositar " + "\n[2] Sacar " + "\n[3] Alterar Nome" + "\n[4] Mostrar Dados");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 0:
				escolha = false;
				break;
			case 1:
				System.out.println("Quanto deseja Deposita: R$");
				valor = scanner.nextDouble();
				conta.deposito(valor);
				break;
			case 2:
				System.out.println("Quanto deseja Sacar: R$");
				valor = scanner.nextDouble();
				conta.saque(valor);
				break;
			case 3:
				System.out.println("Digite o Novo Nome: ");
				nome = scanner.next();
				conta.setNome(nome);
				break;

			case 4:
				conta.dadosConta();
				break;
			default:
				System.out.println("Escolha Invalida!!");

			}
			limpaTela();
			scanner.nextInt();
			

		} while (escolha != false);

		scanner.close();
	}

	public static void limpaTela() {
		for (int i = 0; i < 200; i++) {
			System.out.println("\n\n");
		}
	}

	public static void cabecalho() {
		System.out.println("#####################################");
		System.out.println("                BANCO                ");
		System.out.println("#####################################");
	}

}
