package application;

public class Conta {
	
	String numMesa;
	String categoriaItem;
	String nomeItem;
	Integer qtdItem;
	Double precoItem;
	Double totalItem;

	public Conta(String numMesa, String categoriaItem, String nomeItem, Integer qtdItem, Double precoItem, Double totalItem) {
		this.numMesa = numMesa;
		this.categoriaItem = categoriaItem;
		this.nomeItem = nomeItem;
		this.qtdItem = qtdItem;
		this.precoItem = precoItem;
		this.totalItem = totalItem;
	}

	public String getNumMesa() {
		return numMesa;
	}

	public String getCategoriaItem() {
		return categoriaItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public Integer getQtdItem() {
		return qtdItem;
	}

	public Double getPrecoItem() {
		return precoItem;
	}
	
}


