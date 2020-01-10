package com.projetoConcessionaria.Model;

import java.math.BigDecimal;

public abstract class Produto {
	
	private String id;
	private BigDecimal preco;
	private String descricao;
	
	
	public Produto() {
		super();
	}
	

	public Produto(String id, BigDecimal preco, String descricao) {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
