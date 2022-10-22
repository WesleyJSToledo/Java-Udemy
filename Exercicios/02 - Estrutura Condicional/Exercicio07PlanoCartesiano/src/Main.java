import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerCoordenadas = new Scanner(System.in);
		
		double x, y;
		String coordenadas;
		
		System.out.println("Cordenadas X: ");
		x = lerCoordenadas.nextDouble();

		System.out.println("Cordenadas Y: ");
		y = lerCoordenadas.nextDouble();
		
		if(x == 0 && y == 0) {
			coordenadas = "Origem";
			
		} else if(y >= 0 && x >= 0) {
				coordenadas = "Q1";
		
		} else if(y >= 0 && x <= 0){
				coordenadas = "Q2";
		
		} else if(y <= 0 && x <= 0){
				coordenadas = "Q3";
		
		} else {
				coordenadas = "Q4";
		}
		
		System.out.println(coordenadas);
	}
}
