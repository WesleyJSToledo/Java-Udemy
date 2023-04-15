package file_manipulation.sell_items.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import file_manipulation.sell_items.entities.Product;

public class Main {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		
		final String READER_PATH = "res\\itens\\in.csv";
		final String WRITER_PATH = "res\\itens\\out.csv";
		
		

		try (BufferedReader br = new BufferedReader(new FileReader(READER_PATH)); 
			BufferedWriter bw = new BufferedWriter(new FileWriter(WRITER_PATH))){
			
			String itens = br.readLine();
			
			while(itens != null) {
				String[] fields = itens.split(",");
				productList.add(new Product(fields[0], Double.parseDouble(fields[1]), Double.parseDouble(fields[2])));
				itens = br.readLine();
			}
			
			for (Product product : productList) {
				bw.write(product.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
