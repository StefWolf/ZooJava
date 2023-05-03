package br.ufrn.imd.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Animal {

	protected String nome;
	
	protected Date dataNascimento;
	
	protected int peso;
	
	protected boolean alimentado = false;
	
	private String alimentacao;
	
	public Animal(Date nascimento, String nome, int peso) {
		this.dataNascimento = nascimento;
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isAlimentado() {
		return alimentado;
	}

	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public int calcularIdade(Animal animal) {
		
		LocalDateTime now = LocalDateTime.now();  
		Instant instant = now.atZone(ZoneId.systemDefault()).toInstant();
		Date dateNow = Date.from(instant);
		
		long diferencaDias = dateNow.getTime() - animal.getDataNascimento().getTime();
		long diasDeVida = TimeUnit.DAYS.convert(diferencaDias, TimeUnit.MILLISECONDS);
		long idade = diasDeVida/365;
		
		return (int) idade;
	}
	
	public abstract void comer();
	
}
