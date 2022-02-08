package br.com.Spring.MiniMercado.Model;

public enum Marca {
	NESTLE(1, "Nestle"),
	LACTA(2, "Lacta"),
	CAMIL(3, "Camil"),
	PRATOFINO(4, "Pratofino"),
	BUDWEISER(5, "Budweiser"),
	EISENBAHN(6, "Eisenbahn"),
	DOLLY(7, "Dolly"),
	COCACOLA(8, "Cocacola"),
	DONABENTA(9, "Donabentaa"),
	TIOJOAO(10, "Tiojoao"),
	FRIBOI(11, "Friboi");
	
	private int code;
	private String description;
	
	private Marca(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
