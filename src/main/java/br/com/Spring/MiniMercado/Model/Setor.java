package br.com.Spring.MiniMercado.Model;

public enum Setor {
	
	BEBIDA(1, "Bebida"),
	MERCEARIA(2, "Mercearia"),
	DOCERIA(3, "Doceria"),
	AÇOUGUE(4, "Açougue");
	

	private int code;
	private String description;
	
	private Setor(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	
	public int getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}	
}
