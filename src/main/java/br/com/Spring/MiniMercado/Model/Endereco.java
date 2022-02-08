package br.com.Spring.MiniMercado.Model;

public class Endereco {

	private long id;
	private String rua;
	private String numero;
	private String cidade;
	
	public Endereco() {
	}
	
	public Endereco(long id, String rua, String numero, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}

	public long getId() {
		return id;
	}

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
