package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> estoque = new ArrayList<>();
		
		// Ler um arquivo .csv contendo nome, preco unitario, quantidade.
		// TV LED, 1290.99, 1 - Video Game Chair, 350.50, 3 - Iphone X, 900, 2 - Samsung Galaxy 9, 850, 2
		
		//CASO 1 MANUAL - NECESSITA DE DADOS FORNECIDOS PELO USUARIO

		System.out.println("Digite o caminho do arquivo a ser lido: ");
		String path = sc.nextLine();
		
		File file = new File(path);
			
		System.out.println();
		System.out.println("LEITURA DE ARQUIVO SOLICITADO\n");
		System.out.println("Caminho do arquivo: ");
		System.out.println(file.getPath());
		System.out.println();
		System.out.println("Diretorio do arquivo: ");
		System.out.println(file.getParent());
		System.out.println();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			System.out.println("Conteudo do arquivo solicitado: ");
			System.out.println();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();				
				}
			}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println();

		//CASO 2 AUTOMATIZADO - SEM DADOS FORNECIDOS PELO USUARIO
		
		String[] item = new String[] {
				"TV LED, 1290.99, 1",
				"Video Game Chair, 350.50, 3",
				"Iphone X, 900, 2",
				"Samsung Galaxy 9, 850, 2"
		};
		
		File newFile = new File("C:\\temp\\item.csv");
		boolean dirTemp = new File("C:\\Temp").mkdir();
		System.out.println("LEITURA DE ARQUIVO CRIADO AUTOMATICO\n");
		System.out.println("Diretorio criado pelo programa: ");
		System.out.println(newFile.getParentFile());
		System.out.println();
		System.out.println("Arquivo criado pelo programa: ");
		System.out.println(newFile.getPath());
		System.out.println();
		System.out.println("Conteudo do arquivo texto criado: ");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){
			for(String line : item) {
				bw.write(line);
				System.out.println(line);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(newFile))){
			String line = br.readLine();
			while(line != null) {
				String[] items = line.split(", ");
				String name = items[0];
				Double price = Double.parseDouble(items[1]);
				Integer qtd = Integer.parseInt(items[2]);
				estoque.add(new Produto(name, price, qtd));
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Criar um novo arquivo em uma subpasta "out" chamado summary.csv contendo nome, valor total ( preco unitario * quantidade )
		
		File fileSummary = new File("C:\\Temp\\out\\summary.csv");
		boolean dirOut = new File(newFile.getParent() + "\\out").mkdir();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileSummary))){
			
			for(Produto estoqueItem : estoque) {
				
				bw.write(estoqueItem.getName() + "," + estoqueItem.total());
				bw.newLine();
			}
			System.out.println(); 
			System.out.println(fileSummary + " Criado");
		}catch(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		System.out.println();
		System.out.println("Total em estoque");
		try(BufferedReader br = new BufferedReader(new FileReader(fileSummary))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
