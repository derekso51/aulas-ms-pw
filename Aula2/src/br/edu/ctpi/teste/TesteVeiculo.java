package br.edu.ctpi.teste;

import br.edu.ctpi.model.Caminhao;
import br.edu.ctpi.model.VeiculoPasseio;

public class TesteVeiculo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Caminhao c1 = new Caminhao();
		c1.setPlaca("KLI-0989");
		c1.setCargaMaxima(12121212.);
		c1.setChassi("21121212");
		c1.setValor(55000);
        System.out.println("IPVA caminhão: "+ c1.calcularIPVA());
		
		VeiculoPasseio v1 = new VeiculoPasseio();
		v1.setPlaca("hyu-9090");
		v1.setChassi("34323432");
		v1.setValor(15000);
		System.out.println("\n IPVA veiculo passeio: "+ v1.calcularIPVA());

}

}
