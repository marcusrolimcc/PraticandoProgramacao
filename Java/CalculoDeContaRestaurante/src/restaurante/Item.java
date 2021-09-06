package restaurante;

public class Item extends Pedido{
	
	private Tipo tipo;
	protected Categoria categoria;
	protected Modelo modelo;
	private Integer quantidadeItem;
	
	public Item(Integer codigoPedido, Tipo tipo, Categoria categoria, Modelo modelo, Integer quantidadeItem) {
		super(codigoPedido);
		this.tipo = tipo;
		this.categoria = categoria;
		this.modelo = modelo;
		this.quantidadeItem = quantidadeItem;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public void addItem() {
		
	}
	
	public String toString() {
		return tipo + " " + categoria + " " + modelo;
	}
}
