package principal;

import dominio.Notas;

public class Main {

	public static void main(String[] args) {
		Notas notas = new Notas();

		notas.instanciarNotas();
		notas.calcularMedia();
		notas.imprimir();

	}
}
