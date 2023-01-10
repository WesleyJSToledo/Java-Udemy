import java.util.Scanner;

public class Pessoas {
	public String nome;
	public int idade;
	public float altura;
	
	public void instanciarValores() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		this.nome = sc.next();
		System.out.println("Idade: ");
		this.idade = sc.nextInt();
		System.out.println("Altura: ");
		this.altura = sc.nextFloat();
		System.out.println();
		
		sc.close();
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public float getAltura() {
		return altura;
	}

}
