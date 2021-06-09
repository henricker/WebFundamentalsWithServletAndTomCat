package br.com.henricker.models;

import java.util.Date;

public class Empresa {
	
	private static int idCounter = 1;
	private int id;
	private String nome;
	private Date dataAbertura;
	
	public Empresa(String name, Date dataAbertura) {
		this.nome = name;
		this.dataAbertura = dataAbertura;
		this.id = Empresa.idCounter++;
	}
	public String getNome() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public int getId() {
		return id;
	}
}
