package br.edu.cpti;

public class Produto {
private int codigo;
private String descricao;
private double valor;
private static int total;
public Produto() {
	
	System.out.println("construtor iniciado");
}



public Produto(int codigo, String descricao, double valor ) {
	this.codigo =codigo;
	this.descricao=descricao;
	this.valor=valor;
	total  ++;

}

public static int getTotal() {
	return total; 

}

public void setTotal(int total) {
	this.total = total;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}


}
