package vetores_listas.abaixo_media;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, divisor = 0;
		double[] valores;
		ArrayList<Double> abaixoMedia = new ArrayList<Double>();
		double soma = 0, media = 0;

		System.out.println("Digite quantos valores irá digitar: ");
		n = sc.nextInt();

		valores = new double[n];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			valores[i] = sc.nextDouble();

			if (valores[i] >= 10) {
				soma += valores[i];
				divisor++;
			} else {
				abaixoMedia.add(valores[i]);
			}
		}

		media = soma / divisor;

		System.out.println("Media :" + media);
		System.out.println("Abaixo da Media: ");

		for (double i : abaixoMedia) {
			System.out.println(i);
		}

		sc.close();
	}

}
