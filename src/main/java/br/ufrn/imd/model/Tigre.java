package br.ufrn.imd.model;

import java.util.Date;

public class Tigre extends Animal{
	
	private String tipoTigre;

	public Tigre(Date nascimento, String nome, int peso,  String tipoTigre) {
		super(nascimento, nome, peso);
		this.tipoTigre = tipoTigre;
	}

	@Override
	public void comer() {
		System.out.println("Animal consumiu "+this.peso*4/100+"kg de alimento");
		this.alimentado = true;	
	}

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}

}
