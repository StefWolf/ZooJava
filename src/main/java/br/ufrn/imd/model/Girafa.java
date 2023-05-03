package br.ufrn.imd.model;

import java.util.Date;

public class Girafa extends Animal {
	
	private int tamanhoLingua;

	public Girafa(Date nascimento, String nome, int peso,  int tamanhoLingua) {
		super(nascimento, nome, peso);
		this.setTamanhoLingua(tamanhoLingua);
	}

	@Override
	public void comer() {
		System.out.println("Animal consumiu "+this.peso*10/100+"kg de alimento");
		this.alimentado = true;
	}

	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}

}
