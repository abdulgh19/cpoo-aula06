package mz.co.devtec.cpoo.main.aula06.exercicio;

import java.util.Scanner;

public class ExecutaCadernetaSimples {

	public static void main(String[] args) {

		Scanner entradaPOrTeclado = new Scanner(System.in);
		
		
		System.out.println("Quantos testes realizou?");
		int quantidadeDeTestes = entradaPOrTeclado.nextInt();

		double[] caderneta = new double[quantidadeDeTestes];

		for (int i = 0; i < caderneta.length; i++) {
			System.out.println("Informe a nota do teste {" + (i + 1) + "}");
			caderneta[i] = entradaPOrTeclado.nextDouble();
		}

		double soma = 0;

		//For convencional
//		for (int i = 0; i < caderneta.length; i++) {
//			soma = soma + caderneta[i];
//		}
		
		//ForEach
		for (double c : caderneta) {
			soma = soma + c;
		}
		
		double media = soma / quantidadeDeTestes;
		System.out.println("Media: " + media);
		entradaPOrTeclado.close();

	}
	

}
