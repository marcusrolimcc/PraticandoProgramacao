package com.br.marcusrolim.cursouml.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.br.marcusrolim.cursouml.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataVenciemnto;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataPagamento;

	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		
		this.dataVenciemnto = dataVencimento;
		this.dataPagamento = dataPagamento;

	}

	public Date getDataVenciemnto() {
		return dataVenciemnto;
	}

	public void setDataVenciemnto(Date dataVenciemnto) {
		this.dataVenciemnto = dataVenciemnto;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	

	
	
}
