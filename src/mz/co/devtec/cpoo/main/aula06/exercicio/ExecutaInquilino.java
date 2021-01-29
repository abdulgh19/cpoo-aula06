package mz.co.devtec.cpoo.main.aula06.exercicio;

import java.util.Scanner;

import mz.co.devtec.cpoo.entidade.aula06.exercicio.Inquilino;

public class ExecutaInquilino {

	public static void main(String[] args) {

		Scanner entradaPOrTeclado = new Scanner(System.in);

		Inquilino[] inquilinos = new Inquilino [10];
		
		System.out.println("Quantos estudantes vao alugar quartos?");
		int quartosNecessarios = entradaPOrTeclado.nextInt();
		
		for (int i = 0; i < quartosNecessarios; i++) {
			System.out.println("Aluguer #" + (i+1));
			
			entradaPOrTeclado.nextLine();
			
			System.out.print("Estudante: ");
			String estudante = entradaPOrTeclado.nextLine();
			
			System.out.print("Celular: ");
			int contacto = entradaPOrTeclado.nextInt();
			
			System.out.print("Quarto desejado [de 0 a 9]: ");
			int quarto = entradaPOrTeclado.nextInt();
			
			inquilinos[quarto] = new Inquilino(estudante, contacto);
			
			System.out.println();
			
		}
		
		System.out.println("Quartos alugados: ");
		
		for (int i = 0; i < inquilinos.length; i++) {
			if (inquilinos[i] != null) {
				System.out.println("Quarto " + i +" – " + inquilinos[i]);				
			}
		}
			
		entradaPOrTeclado.close();

	}
	
}
