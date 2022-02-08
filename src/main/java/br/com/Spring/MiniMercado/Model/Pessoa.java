package br.com.Spring.MiniMercado.Model;

import java.util.Calendar;

public class Pessoa {

	private long id;
	private String nome;
	private Calendar dataNascimento;
	private String telefone;
	private Endereco endereco;
	
	public Pessoa() {
	}
	
	public Pessoa(long id, String nome, Calendar dataNascimento, String telefone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
