package br.ufrn.imd.controller;

import javax.mvc.annotation.Controller;

import br.ufrn.imd.dao.Tigres;
import br.ufrn.imd.model.Tigre;

@Controller
public class TigreController implements AnimalController<Tigre>{

	Tigres tigres;

	@Override
	public void adicionarAnimal(Tigre tigre) {
		tigres.getTigres().add(tigre);
		
	}

	@Override
	public void alimentarAnimais() {
		for(Tigre tigre : tigres.getTigres()) {
			tigre.comer();
		}
		
	}

	@Override
	public void calcularQuantidadeAlimentosGastos() {
		// TODO Auto-generated method stub
		
	}
}
