package br.edu.cpti;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Produto produto1 = new Produto();         
		
		Produto produto2 = new Produto();
		    
		Produto produto3 = new Produto(1, "abacaxi", 3.99);  		
		
		Produto produto4 = new Produto(2, "melancia", 30.99);
		
		Produto produto5 = new Produto(3, "abacate", 6.0 );
		
		produto3.setValor(7.99);
		
		produto3.setDescricao("sdasadsada");
		 
		System.out.println(produto3.getCodigo()+ " " + produto3.getValor()+ " " + produto3.getDescricao() +" ");
		
		System.out.println("total dos produtos " + produto3.getTotal());
		

	}

}
