package com.projetoConcessionaria.Interface;

public class ServicoCompra implements IServicoCompra {

	public String compra(String Produto, String Gerente) {
		String msg = "Cliente " + " comprando um " + " da marca " + " e modelo " + ".";
		return msg;
	}

	public String cancelaCompra(String Produto, String Gerente) {
		String msg = "Cliente " + " cancelando a compra de um " + " da marca " + " e modelo " + ".";
		return msg;
	}

}
