package br.ufrn.imd.controller;

import javax.mvc.annotation.Controller;

import br.ufrn.imd.dao.Elefantes;
import br.ufrn.imd.model.Elefante;

@Controller
public class ElefanteController implements AnimalController<Elefante> {

	Elefantes elefantes;
	
	private int quantidadeAlimentosGastos;
	

	public int getQuantidadeAlimentosGastos() {
		return quantidadeAlimentosGastos;
	}

	public void setQuantidadeAlimentosGastos(int quantidadeAlimentosGastos) {
		this.quantidadeAlimentosGastos = quantidadeAlimentosGastos;
	}

	@Override
	public void adicionarAnimal(Elefante elefante) {
		elefantes.getElefantes().add(elefante);
	}

	@Override
	public void alimentarAnimais() {
		for(Elefante elefante : elefantes.getElefantes()) {
			elefante.comer();
		}
		
	}

	@Override
	public void calcularQuantidadeAlimentosGastos() {
		// TODO Auto-generated method stub
		
	}
}
