package orientacao_objeto.conta_bancaria.entities;

import java.util.Random;

public class Banco {
	private String nome;
	private String numeroConta;
	private double saldoConta;

	public Banco(String nome, double saldoConta) {
		this.nome = nome;
		this.saldoConta = saldoConta;
		this.numeroConta = gerarNumeroConta();
		dadosConta();
	}
	
	public Banco(String nome) {
		this.nome = nome;
		this.numeroConta = gerarNumeroConta();
		dadosConta();
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String gerarNumeroConta() {
		Random numeroRandomico = new Random();
		
		String numeroConta = "";
		
		for(int i = 1; i <= 5; i++) {
			numeroConta = numeroConta.concat("" +(numeroRandomico.nextInt(10)));
		}
		
		return numeroConta;
	}

	public void dadosConta() {
		System.out.println("Nome: " +nome);
		System.out.println("Numero da Conta: " +numeroConta);
		System.out.println("Saldo da Conta: R$" +saldoConta);
		
	}

	public void deposito(double valor) {
		this.saldoConta += valor;
		dadosConta();
	}
	
	public void saque(double valor) {
		this.saldoConta -= (valor + 5);
		dadosConta();
	}
}
