package br.edu.cpti;

public class TesteAluno {

	public static void main(String[] args) {
		
		
		Aluno aluno1 =new Aluno();
		aluno1.nome = "joaquin";
		aluno1.telefone= "2245-1090";
		aluno1.email= "loaguin@gmail.com";
		System.out.println("dados do aluno: " +aluno1.nome);	 
		
		Aluno aluno2 =new Aluno();
		Aluno aluno3 =new Aluno();
		Aluno aluno4 =aluno3;
	
		
		System.out.println(aluno2);
		System.out.println(aluno3);
		
		if (aluno2 == aluno3) {
			
			System.out.println("sao igauis");
		}else {
			System.out.println("diferentes");
		}
			
	}

}
