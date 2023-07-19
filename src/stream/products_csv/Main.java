package stream.products_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import stream.products_csv.entities.Product;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("res/stream/in.csv"))) {

			List<Product> products = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String [] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			double avg = products.stream().map(p -> p.getValue()).reduce(0.0, (x, y) -> x + y) / products.size();
			System.out.printf("Average price: %.2f \n", avg);
			
			List<String> productsNames = products.stream()
					.filter(p -> p.getValue() < avg)
					.map(p -> p.getName())
					.collect(Collectors.toList());
			
			productsNames.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
