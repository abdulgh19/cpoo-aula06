package mz.co.devtec.cpoo.main.aula06.exercicio;

import java.util.Scanner;

import mz.co.devtec.cpoo.entidade.aula06.exercicio.Caderneta;

public class ExecutaCaderneta {

	public static void main(String[] args) {

		Scanner entradaPOrTeclado = new Scanner(System.in);

		System.out.println("Em quantas disciplinas esta inscrito?");
		int quantidadeDeDisciplinas = entradaPOrTeclado.nextInt();
		
 		Caderneta[] cadernetas = new Caderneta[quantidadeDeDisciplinas];
		 		
		for (int i = 0; i < cadernetas.length; i++) {
			entradaPOrTeclado.nextLine();
			
			System.out.println("Designacao da disciplina");
			String disc = entradaPOrTeclado.nextLine();
			
			System.out.println("nome do aluno");
			String nome = entradaPOrTeclado.nextLine();
			
			System.out.println("Nota na disciplina");
			double nota = entradaPOrTeclado.nextDouble();
			cadernetas[i] = new Caderneta(disc, nota, nome);
		}
		
		
		for (int i = 0; i < cadernetas.length; i++) {
			System.out.println(cadernetas[i]);
		}
		
		double soma = 0;
		
		for (int i = 0; i < cadernetas.length; i++) {
			soma = soma + cadernetas[i].getNota(); 
		}
		
		double media = soma/quantidadeDeDisciplinas;
		
		System.out.println("Media final:" +media);			
		
		entradaPOrTeclado.close();

	}
	

}
