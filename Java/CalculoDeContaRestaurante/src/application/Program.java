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

import restaurante.Categoria;
import restaurante.Modelo;
import restaurante.Nome;
import restaurante.Pedido;
import restaurante.Tipo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//CONTA É A LISTAGEM DE TODOS OS PEDIDOS DA RESPECTIVA MESA
		List<Conta> conta = new ArrayList<>();
		//PEDIDO É A LISTAGEM DE TODOS OS ITENS PEDIDOS EM CADA CONTATO COM O GARÇOM
		List<Pedido> pedido = new ArrayList<>();
		//ITEM SÃO TOODS OS ATRIBUTOS DE UM PRODUTO ( NOME, TIPO, TAMANHO, QUANTIDADE...)
		List<ItemCompleto> itemCompleto = new ArrayList<>();
		
		
		//VARIÁVEIS E SEUS TIPOS PARA COMPOR O ITEM DO PEDIDO
		Tipo tipo = null;
		Modelo modelo = null;
		Categoria categoria = null;
		Nome nome = null;
				
		int quantidade = 0;
		
		System.out.println("ABERTURA DE PEDIDO");

		//ABERTURA DO PEDIDO INSERINDO O NUMERO DA MESA 
		char addOutroPedido = 'S';
		System.out.print("Numero da mesa: ");
		int numPedido = sc.nextInt();
		int mesa = numPedido;
		
		while(Character.toUpperCase(addOutroPedido) == 'S') {
		
		
		Pedido pedidoFeito = new Pedido(numPedido);
		pedido.add(pedidoFeito);

		//COM O PEDIDO ABERTO INICIA A ADIÇÃO DOS ITENS DO PEDIDO
		//TIPO ( BEBIDA, PORÇÃO, PRATO, SOBREMESA)
		System.out.println("Tipo de pedido");
		System.out.println("1 - Bebida");
		System.out.print("Opcao: ");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			tipo = Tipo.BEBIDA;
		}
		//INICIO TIPO BEBIDA
		switch(opcao) {
		case 1:
			
			System.out.println("Categoria: ");
			System.out.println("1 - Refrigerante");
			System.out.println("2 - Cerveja");
			System.out.println("3 - Suco Natural");
			int opcaoCategoria = sc.nextInt();

			//INICIO CATEGORIA REFRIGERANTE
			if(opcaoCategoria == 1) {
				categoria = Categoria.REFRIGERANTE;

				System.out.println("Modelo: ");
				System.out.println("1 - Lata");
				System.out.println("2 - Litro");
				int opcaoModelo = sc.nextInt();
				if(opcaoModelo == 1){
					modelo = Modelo.LATA;
				}else if(opcaoModelo == 2) {
					modelo = Modelo.LITRO;
				}else {
					System.out.println("OPCAO INVALIDA");
					System.out.println("Tente novamente");
					System.out.println("Modelo: ");
					System.out.println("1 - Lata");
					System.out.println("2 - Litro");
					opcaoModelo = sc.nextInt();
				}
				
				System.out.print("Quantidade: ");
				quantidade = sc.nextInt();
				
				System.out.println("Nome: ");
				System.out.println("1 - COCA");
				System.out.println("2 - COCA ZERO");
				System.out.println("3 - SPRITE");
				System.out.println("4 - SPRITE ZERO");
				System.out.println("5 - GUARANA");
				System.out.println("6 - GUARANA ZERO");
				System.out.println("7 - FANTA");
				System.out.println("8 - FANTA ZERO");
				System.out.println("9 - CITRUS");
				System.out.println("10 - CITRUS ZERO");
				System.out.println("11 - AGUA SEM GAS");
				System.out.println("12 - AGUA COM GAS");
				int opcaoNome = sc.nextInt();
				if(opcaoNome == 1) {
					nome = Nome.COCA;
				}else if(opcaoNome == 2) {
					nome = Nome.COCA_ZERO;
				}else if(opcaoNome == 3) {
					nome = Nome.SPRITE;
				}else if(opcaoNome == 4) {
					nome = Nome.SPRITE_ZERO;
				}else if(opcaoNome == 5) {
					nome = Nome.GUARANA;
				}else if(opcaoNome == 6) {
					nome = Nome.GUARANA_ZERO;
				}else if(opcaoNome == 7) {
					nome = Nome.FANTA;
				}else if(opcaoNome == 8) {
					nome = Nome.FANTA_ZERO;
				}else if(opcaoNome == 9) {
					nome = Nome.CITRUS;
				}else if(opcaoNome == 10) {
					nome = Nome.CITRUS_ZERO;
				}else if(opcaoNome == 11) {
					nome = Nome.AGUA_SEM_GAS;
				}else if(opcaoNome == 12) {
					nome = Nome.AGUA_COM_GAS;
				}else {
					System.out.println("OPCAO INVALIDA");
					System.out.println("Tente novamente");
					System.out.println("Nome: ");
					System.out.println("1 - COCA");
					System.out.println("2 - COCA ZERO");
					System.out.println("3 - SPRITE");
					System.out.println("4 - SPRITE ZERO");
					System.out.println("5 - GUARANA");
					System.out.println("6 - GUARANA ZERO");
					System.out.println("7 - FANTA");
					System.out.println("8 - FANTA ZERO");
					System.out.println("9 - CITRUS");
					System.out.println("10 - CITRUS ZERO");
					System.out.println("11 - AGUA SEM GAS");
					System.out.println("12 - AGUA COM GAS");
					opcaoNome = sc.nextInt();
				}
				//FIM CATEGORIA REFRIGERANTE
				ItemCompleto addItemCompleto = new ItemCompleto(numPedido, tipo, categoria, modelo, quantidade, nome, 0);
				itemCompleto.add(addItemCompleto);
				System.out.println("Item adicionado:");
				System.out.println(itemCompleto.toString());
				System.out.println();

				//INICIO CATEGORIA CERVEJA
			} else if(opcaoCategoria == 2) {
				categoria = Categoria.CERVEJA;
				System.out.println("Modelo: ");
				System.out.println("1 - Lata");
				System.out.println("2 - LongNeck");
				int opcaoModelo = sc.nextInt();
				if(opcaoModelo == 1){
					modelo = Modelo.LATA_CERVEJA;
				}else if(opcaoModelo == 2) {
					modelo = Modelo.LONGNECK;
				}else {
					System.out.println("OPCAO INVALIDA");
					System.out.println("Tente novamente");
					System.out.println("Modelo: ");
					System.out.println("1 - Lata");
					System.out.println("2 - LongNeck");
					opcaoModelo = sc.nextInt();
				}
				
				System.out.print("Quantidade: ");
				quantidade = sc.nextInt();
				
				System.out.println("Nome: ");
				System.out.println("1 - SKOL");
				System.out.println("2 - BRAHMA");
				System.out.println("3 - ITAIPAVA");
				System.out.println("4 - AMSTEL");
				System.out.println("5 - DEVASSA");
				System.out.println("6 - HEINEKEN");
				System.out.println("7 - BUDWEISER");
				System.out.println("8 - ANTARCTICA");
				int opcaoNome = sc.nextInt();
				
				if(opcaoNome == 1) {
					nome = Nome.SKOL;
				}else if(opcaoNome == 2) {
					nome = Nome.BRAHMA;
				}else if(opcaoNome == 3) {
					nome = Nome.ITAIPAVA;
				}else if(opcaoNome == 4) {
					nome = Nome.AMSTEL;
				}else if(opcaoNome == 5) {
					nome = Nome.DEVASSA;
				}else if(opcaoNome == 6) {
					nome = Nome.HEINEKEN;
				}else if(opcaoNome == 7) {
					nome = Nome.BUDWEISER;
				}else if(opcaoNome == 8) {
					nome = Nome.ANTARCTICA;
				}else {
					
					System.out.println("OPCAO INVALIDA");
					System.out.println("Tente novamente");
					System.out.println("Nome: ");
					System.out.println("1 - SKOL");
					System.out.println("2 - BRAHMA");
					System.out.println("3 - ITAIPAVA");
					System.out.println("4 - AMSTEL");
					System.out.println("5 - DEVASSA");
					System.out.println("6 - HEINEKEN");
					System.out.println("7 - BUDWEISER");
					System.out.println("8 - ANTARCTICA");
					opcaoNome = sc.nextInt();
				}
				//FIM CATEGRIA CERVEJA
				ItemCompleto addItemCompleto = new ItemCompleto(numPedido, tipo, categoria, modelo, quantidade, nome, 0);
				itemCompleto.add(addItemCompleto);
				System.out.println("Item adicionado:");
				System.out.println(itemCompleto.toString());
				System.out.println();

				//INICIO CATEGORIA SUCOS NATURAIS
			}else if(opcaoCategoria == 3) {
					categoria = Categoria.SUCO_NATURAL;
					System.out.println("Modelo: ");
					System.out.println("1 - Copo");
					System.out.println("2 - Jarra 1 Litro");
					int opcaoModelo = sc.nextInt();
					if(opcaoModelo == 1){
						modelo = Modelo.COPO;
					}else if(opcaoModelo == 2) {
						modelo = Modelo.JARRA;
					}else {
						System.out.println("OPCAO INVALIDA");
						System.out.println("Tente novamente");
						System.out.println("Modelo: ");
						System.out.println("1 - Copo");
						System.out.println("2 - Jarra 1 Litro");
						opcaoModelo = sc.nextInt();
					}
					
					System.out.print("Quantidade: ");
					quantidade = sc.nextInt();
					
					System.out.println("Nome: ");
					System.out.println("1 - LARANJA");
					System.out.println("2 - LIMAO");
					System.out.println("3 - ABACAXI");
					System.out.println("4 - MARACUJA");
					System.out.println("5 - MORANGO");
					System.out.println("6 - MAMAO");
					int opcaoNome = sc.nextInt();
					
					if(opcaoNome == 1) {
						nome = Nome.LARANJA;
					}else if(opcaoNome == 2) {
						nome = Nome.LIMAO;
					}else if(opcaoNome == 3) {
						nome = Nome.ABACAXI;
					}else if(opcaoNome == 4) {
						nome = Nome.MARACUJA;
					}else if(opcaoNome == 5) {
						nome = Nome.MORANGO;
					}else if(opcaoNome == 6) {
						nome = Nome.MAMAO;
					}else {
						
						System.out.println("OPCAO INVALIDA");
						System.out.println("Tente novamente");
						System.out.println("Nome: ");
						System.out.println("1 - LARANJA");
						System.out.println("2 - LIMAO");
						System.out.println("3 - ABACAXI");
						System.out.println("4 - MARACUJA");
						System.out.println("5 - MORANGO");
						System.out.println("6 - MAMAO");
						opcaoNome = sc.nextInt();
				}
				
				//FIM CATEGORIA SUCOS NATURAIS
				ItemCompleto addItemCompleto = new ItemCompleto(numPedido, tipo, categoria, modelo, quantidade, nome, 0);
				itemCompleto.add(addItemCompleto);
				System.out.println("Item adicionado:");
				System.out.println(itemCompleto.toString());
				System.out.println();
				break;
			}}
		//FIM TIPO BEBIDA

		System.out.println("Conta total - " + pedido.toString());
		System.out.println("TIPO - NOME - QTD - R$ - TOTAL R$");
		System.out.println(itemCompleto.toString());
				
		System.out.println("Deseja adicionar mais um item ao pedido? (S/N)");
		addOutroPedido = sc.next().charAt(0);
		if (Character.toUpperCase(addOutroPedido)  == 'N'){
			System.out.println("Pedido encerrado \n");
		}else if(Character.toUpperCase(addOutroPedido)  == 'S'){
			System.out.println("Novo pedido: \n");
		}else {
			System.out.println("Opcao invalida!");
			System.out.println("Deseja adicionar mais um item ao pedido? (S/N)");
			addOutroPedido = sc.next().charAt(0);
		}}
		
		double soma = 0;
		double totalConta = 0;
		File log = new File("E:\\Rest\\Log\\logPedidosPorMesa.txt");
		boolean dirLog = new File(log.getParent()).mkdirs();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(log.getPath(), true))){
			bw.write(itemCompleto.toString());
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		try(BufferedReader br = new BufferedReader(new FileReader(log))){
		
			String linha = br.readLine();
			while(linha != null) {
				String[] item = linha.split(" - ");
				String numMesa = item[0];
				String categoriaItem = item[1];
				String nomeItem = item[2];
				int qtdItem = Integer.parseInt(item[3]);
				double precoItem = Double.parseDouble(item[4]);
				double totalItem = Double.parseDouble(item[5]);
				conta.add(new Conta(numMesa, categoriaItem, nomeItem, qtdItem, precoItem, totalItem));
				totalConta = soma + totalItem;
				soma = totalConta;
				linha = br.readLine();
				totalConta = soma + totalItem;
				soma = totalConta;
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		File logConta = new File("E:\\Rest\\logConta.txt");
		boolean dirLogConta = new File(logConta.getParent()).mkdirs();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(logConta))){
			 for(Conta contaLog : conta) {
				 bw.write(contaLog.getNumMesa() + " - " + contaLog.getCategoriaItem() + " - " + contaLog.getNomeItem() + " - " + contaLog.getQtdItem() + " - " + contaLog.getPrecoItem() + " - " + contaLog.getPrecoItem());
				 bw.newLine();
			 }
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		System.out.println("LISTA DE PEDIDOS");
		itemCompleto.forEach(System.out::println);
		System.out.println("TOTAL CONTA:");
		System.out.println(String.format("%.2f", soma));
		sc.close();
	}

}


