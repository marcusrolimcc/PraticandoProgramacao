package restaurante;

public class Pedido {

	private Integer codigoPedido;
	
	public Pedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public String toString() {
		return getCodigoPedido() + "";
	} 
}
