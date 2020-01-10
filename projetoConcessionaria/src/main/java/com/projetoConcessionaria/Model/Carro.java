package com.projetoConcessionaria.Model;

import java.math.BigDecimal;

public class Carro extends Veiculo {
	
	private boolean vidroEletrico;
	private boolean travaEletrica;
	private boolean cambioAutomatico;
	private String potencia;
	private String qtdPortas;
	
	public Carro() {
		super();
	}
	
	public Carro(String id, BigDecimal preco, String descricao, String marca, String modelo, String ano, String cor,
			String condicaoUso, boolean vidroEletrico, boolean travaEletrica, boolean cambioAutomatico, String potencia,
			String qtdPortas) {
		super(id, preco, descricao, marca, modelo, ano, cor, condicaoUso);
		this.vidroEletrico = vidroEletrico;
		this.travaEletrica = travaEletrica;
		this.cambioAutomatico = cambioAutomatico;
		this.potencia = potencia;
		this.qtdPortas = qtdPortas;
	}
	public boolean isVidroEletrico() {
		return vidroEletrico;
	}
	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}
	public boolean isTravaEletrica() {
		return travaEletrica;
	}
	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}
	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(String qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	
	
}
