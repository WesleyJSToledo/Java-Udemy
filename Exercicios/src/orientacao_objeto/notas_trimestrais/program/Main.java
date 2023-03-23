package orientacao_objeto.notas_trimestrais.program;

import orientacao_objeto.notas_trimestrais.entities.Notas;

public class Main {

	public static void main(String[] args) {
		Notas notas = new Notas();

		notas.instanciarNotas();
		notas.calcularMedia();
		notas.imprimir();

	}
}
