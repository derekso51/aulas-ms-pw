package br.edu.ctpi.model;

public class PessoaJuridica extends ImpostoRenda{
private String cnpj;

public PessoaJuridica(String nome, String cnpj, double rendimento, String cpf) {
	super(nome, rendimento);
	this.cnpj = cnpj;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public double CalcularImposto() {
	return this.rendimento *0.15;
	

}
}