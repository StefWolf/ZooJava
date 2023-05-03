package br.ufrn.imd.model;

import java.util.Date;

public class Elefante extends Animal {
	
	private int tamanhoTrombra;

	public Elefante(Date nascimento, String nome, int peso, int tamanhoTromba) {
		super(nascimento, nome, peso);
		this.setTamanhoTrombra(tamanhoTromba);
	}

	@Override
	public void comer() {
		System.out.println("Animal consumiu "+this.peso*15/100+"kg de alimento");
		this.alimentado = true;
		
	}

	public int getTamanhoTrombra() {
		return tamanhoTrombra;
	}

	public void setTamanhoTrombra(int tamanhoTrombra) {
		this.tamanhoTrombra = tamanhoTrombra;
	}

}
