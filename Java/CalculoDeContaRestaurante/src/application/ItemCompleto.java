package application;

import restaurante.Categoria;
import restaurante.Modelo;
import restaurante.Nome;
import restaurante.Tipo;

public class ItemCompleto {

	Integer codigoPedido; 
	Tipo tipo; 
	Categoria categoria;
	Modelo modelo; 
	Integer quantidadeItem; 
	Nome nome; 
	private double preco;
	
	public ItemCompleto(Integer codigoPedido, Tipo tipo, Categoria categoria, Modelo modelo, Integer quantidadeItem,
			Nome nome, double preco) {
		this.codigoPedido = codigoPedido;
		this.tipo = tipo;
		this.categoria = categoria;
		this.modelo = modelo;
		this.quantidadeItem = quantidadeItem;
		this.nome = nome;
		this.preco = preco;
	}

	public ItemCompleto(Integer codigoPedido, Integer quantidadeItem, double preco) {
		this.codigoPedido = codigoPedido;
		this.quantidadeItem = quantidadeItem;
		this.preco = preco;
	}

	public ItemCompleto() {
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}

	public Nome getNome() {
		return nome;
	}
		
	public double getPreco() {
		//INICIO PRECO TIPO BEBIDA
		//INICIO PRECO CATEGORIA REFRIGERANTE
		if(getCategoria() == Categoria.REFRIGERANTE) {
			if(getModelo() == Modelo.LATA) {
				preco = 4.30;
			} else if(getModelo() == Modelo.LITRO) {
					preco = 10.50;
				}}
		//FIM PRECO CATEGORIA REFRIGERANTE
		//INICIO PRECO CATEGORIA CERVEJA
		if(getCategoria() == Categoria.CERVEJA) {
			if(getModelo() == Modelo.LATA_CERVEJA) {
				preco = 6.40;
			} else if(getModelo() == Modelo.LONGNECK) {
				preco = 7.50;
			}
		}
		//FIM PRECO CATEGORIA CERVEJA
		//INICIO PRECO CATEGORIA SUCO NATURAL
		if(getCategoria() == Categoria.SUCO_NATURAL) {
			if(getModelo() == Modelo.COPO) {
				preco = 5.00;
			} else if(getModelo() == Modelo.JARRA) {
				preco = 9.20;
			}
		}
		//FIM PRECO CATEGORIA SUCO NATURAL
		//FIM TIPO BEBIDA
		
			return preco;
	}

	public double precoTotalItem() {
		return getPreco() * getQuantidadeItem();
	}
	
	public String toString() {
		return getCodigoPedido() + " - " + getCategoria() + " - " + nome + " - " + getQuantidadeItem() + " - " + getPreco() + " - " + String.format("%.2f", precoTotalItem()) + " - ";
	}
}
