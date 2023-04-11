package object_orientation.bank_account.entities;

import java.util.Random;

public class Bank {
	private String name;
	private String accountNumber;
	private double accoutBalance;

	public Bank(String name, double accoutBalance) {
		this.name = name;
		this.accoutBalance = accoutBalance;
		this.accountNumber = generateAccountNumber();
		accountData();
	}
	
	public Bank(String name) {
		this.name = name;
		this.accountNumber = generateAccountNumber();
		accountData();
	}
	
	
	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String generateAccountNumber() {
		Random randomNumber = new Random();
		
		String accountNumber = "";
		
		for(int i = 1; i <= 5; i++) {
			accountNumber = accountNumber.concat("" +(randomNumber.nextInt(10)));
		}
		
		return accountNumber;
	}

	public void accountData() {
		System.out.println("Name: " +name);
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Account Balance: R$" +accoutBalance);
		
	}

	public void deposit(double valor) {
		this.accoutBalance += valor;
		accountData();
	}
	
	public void withdraw(double valor) {
		this.accoutBalance -= (valor + 5);
		accountData();
	}
}
