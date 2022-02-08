package br.com.Spring.MiniMercado.Model;

import java.util.Calendar;

public class Cliente extends Pessoa {
	
	private Calendar dataCompra;

	public Cliente() {
	}

	public Cliente(String nome, Calendar dataNascimento, String telefone, Endereco endereco, Calendar dataCompra) {
		super(nome, dataNascimento, telefone, endereco);
		this.dataCompra = dataCompra;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
}
