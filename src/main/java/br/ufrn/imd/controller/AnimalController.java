package br.ufrn.imd.controller;

public interface AnimalController<T> {

	public void adicionarAnimal(T e);
	
	public void alimentarAnimais();
	
	public void calcularQuantidadeAlimentosGastos();
}
