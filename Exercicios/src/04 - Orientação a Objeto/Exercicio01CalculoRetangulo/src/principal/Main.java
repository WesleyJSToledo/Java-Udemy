package principal;
import dominio.Retangulo;

public class Main {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();

		System.out.println("Area: " +retangulo.area());
		System.out.println("Perimetro: " +retangulo.perimetro());
		System.out.println("Diagonal: " +retangulo.diagonal());
	}

}
