package orientacao_objeto.conversor_dolar.entities;


public class Dolar {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double cotacao, double valor) {
		return cotacao * valor * (1.0 + IOF);
	}
	
	
}
