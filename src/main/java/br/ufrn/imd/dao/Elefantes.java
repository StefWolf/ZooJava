package br.ufrn.imd.dao;

import java.util.List;

import br.ufrn.imd.model.Elefante;

public class Elefantes {

	private List<Elefante> elefantes;

	public List<Elefante> getElefantes() {
		return elefantes;
	}

	public void setElefantes(List<Elefante> elefantes) {
		this.elefantes = elefantes;
	}
	
	public void addNewElefante(Elefante elefante) {
		elefantes.add(elefante);
	}
}
