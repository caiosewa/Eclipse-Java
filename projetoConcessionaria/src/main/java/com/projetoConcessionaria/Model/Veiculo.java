package com.projetoConcessionaria.Model;

import java.math.BigDecimal;

public class Veiculo extends Produto {
	
	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	private String condicaoUso;
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String id, BigDecimal preco, String descricao, String marca, String modelo, String ano, String cor, String condicaoUso) {
		super(id, preco, descricao);
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.condicaoUso = condicaoUso;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCondicaoUso() {
		return condicaoUso;
	}
	public void setCondicaoUso(String condicaoUso) {
		this.condicaoUso = condicaoUso;
	}
	
	
}
