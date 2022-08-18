package br.edu.ctpi.model;

public class ImpostoRenda {
protected String nome;
protected double rendimento;


public String getName() {
	return nome;
}
public void setName(String nome) {
	this.nome = nome;
}
public double getRendimento() {
	return rendimento;
}
public ImpostoRenda(String nome, double rendimento) {
	super();
	this.nome = nome;
	this.rendimento = rendimento;
}

	
}
