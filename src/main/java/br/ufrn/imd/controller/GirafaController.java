package br.ufrn.imd.controller;

import javax.mvc.annotation.Controller;

import br.ufrn.imd.dao.Girafas;
import br.ufrn.imd.model.Girafa;

@Controller
public class GirafaController implements AnimalController<Girafa>{

	Girafas girafas;

	@Override
	public void adicionarAnimal(Girafa girafa) {
		girafas.getGirafas().add(girafa);	
	}

	@Override
	public void alimentarAnimais() {
		for(Girafa girafa : girafas.getGirafas()) {
			girafa.comer();
		}
		
	}

	@Override
	public void calcularQuantidadeAlimentosGastos() {
		// TODO Auto-generated method stub
		
	}
}
