package object_orientation.bank_account.program;

import java.util.Scanner;

import object_orientation.bank_account.entities.Bank;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank account = null;

		String name, accountNumber;
		char type;
		int option;
		double value;
		boolean choice;

		cabecalho();
		System.out.println("Creating Account:");

		choice = true;
		System.out.print("Name: ");
		name = scanner.next();

		do {
			System.out.print("Want to include balance [Y/N]: ");
			type = scanner.next().charAt(0);

			if (type == 'Y' || type == 's') {
				
				System.out.print("Saldo Inicial: ");
				value = scanner.nextDouble();
				account = new Bank(name, value);

			} else if (type == 'N' || type == 'n') {

				account = new Bank(name);

			} else {

				System.out.println("Invalid Option");
				choice = false;
			}
			
		} while (choice != true);

		System.out.println();
		
		cabecalho();
		System.out.println("Access the account: ");

		do {
			choice = true;

			System.out.print("Name: ");
			name = scanner.next();

			System.out.print("Number account: ");
			accountNumber = scanner.next();

			if (name.equals(account.getName()) && accountNumber.equals(account.getAccountNumber())) {

				System.out.println("Access was Allowed");
			} else {
				System.out.println("Access was Denied");
				choice = false;
			}

		} while (choice != true);

		clearScreen();

		do {
			choice = true;
			cabecalho();

			System.out.println(
					"[0] Leave" 
					+ "\n[1] Deposit " 
					+ "\n[2] Withdraw " 
					+ "\n[3] Change Name" 
					+ "\n[4] Show Data");
			option = scanner.nextInt();

			switch (option) {
			case 0:
				choice = false;
				break;
			case 1:
				System.out.println("What amount do you want to deposit: R$");
				value = scanner.nextDouble();
				account.deposit(value);
				break;
			case 2:
				System.out.println("What amount do you want to withdraw: R$");
				value = scanner.nextDouble();
				account.withdraw(value);
				break;
			case 3:
				System.out.println("Enter new name: ");
				name = scanner.next();
				account.setName(name);
				break;

			case 4:
				account.accountData();
				break;
			default:
				System.out.println("Invalid option!!");

			}
			clearScreen();
			scanner.nextInt();
			

		} while (choice != false);

		scanner.close();
	}

	public static void clearScreen() {
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

	public static void cabecalho() {
		System.out.println("#####################################");
		System.out.println("                Bank Account                ");
		System.out.println("#####################################");
	}

}
