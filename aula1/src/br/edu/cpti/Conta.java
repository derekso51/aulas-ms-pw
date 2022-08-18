package br.edu.cpti;

public class Conta {

	private String numeroConta;
	private Double saldo; 
	
	
	
	public String getNumeroConta() {
		return numeroConta;
	}




	public void setNumeroConta(String numeroConta) {
		numeroConta = numeroConta;
	}




	public Double getSaldo() {
		return saldo;
	}




	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}




	public void setNumeroConata(String numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	

	
	
	public void deposito(Double valor) {
		saldo += valor;
		
		
	}
	
	public String saque(Double valor) { 
		
		if (saldo < valor) {
		return "saldo insuficiente";
		}else {
		saldo-= valor;	
		return "saque efetuado com sucesso";
		
		}
		
	}
	
	
}
