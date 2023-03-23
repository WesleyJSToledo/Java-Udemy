package manipulacao_arquivos.vendas_intens.entities;

public class Produto {
	private String nome;
	private double valor;
	private double qntVendida;
	
	public Produto(String nome, double valor, double qntVendida) {
		this.nome = nome;
		this.valor = valor;
		this.qntVendida = qntVendida;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public double getQntVendida() {
		return qntVendida;
	}
	
	
}
