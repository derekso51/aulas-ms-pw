package br.edu.ctpi.model;

public class PessoaFisica extends ImpostoRenda{
private String cpf;


public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public PessoaFisica(String nome, String cpf, double rendimento) {
	super(nome, rendimento);
	this.cpf = cpf;
}
public double CalcularImposto() {
	return this.rendimento *015;
	
	
	
}

}
