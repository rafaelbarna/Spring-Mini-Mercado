package br.com.Spring.MiniMercado.Model;

import java.util.Calendar;

public class Produto {

	private Long id;
	private String nome;
	private Long quantidade;
	private Marca marca;
	private Calendar dataValidade;
	private Setor setor;
	
	public Produto() {}

	public Produto(String nome, Long quantidade, Marca marca, Calendar dataValidade, Setor setor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.marca = marca;
		this.dataValidade = dataValidade;
		this.setor = setor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

}
