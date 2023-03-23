package manipulacao_arquivos.vendas_intens.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import manipulacao_arquivos.vendas_intens.entities.Produto;

public class Main {
	public static void main(String[] args) {
		ArrayList<Produto> listaProduto = new ArrayList<Produto>();
		
		final String CAMINHO = "res/itens/venda_itens.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO))){
			
			String itens = br.readLine();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
