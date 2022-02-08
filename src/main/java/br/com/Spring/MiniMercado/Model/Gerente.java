package br.com.Spring.MiniMercado.Model;

import java.util.Calendar;

public class Gerente extends Pessoa{

	private double salario;
	private int cargaHoraria;

	
	public Gerente() {}

	public Gerente(String nome, Calendar dataNascimento, String telefone, Endereco endereco, double salario,
			int cargaHoraria) {
		super(nome, dataNascimento, telefone, endereco);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
