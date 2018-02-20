package br.com.fiap.si.models;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNasc;
	private String time;

	public Pessoa() {
	}

	public Pessoa(String nome, Date dataNasc, String time) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
