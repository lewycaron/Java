package exercicio03;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a Matricula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Digite o nome: ");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		for (int cont=0; cont<5 ; cont++) {
			System.out.println("Digite a nota " + (cont + 1) + " entre 0 e 10:");
			notas[cont] = leitor.nextDouble();
		
			if (notas[cont] < 10 && notas[cont] >= 0) {
				System.out.println("nota valida!");
			}else{
				System.out.println("nota Invalida!");
				cont = cont - 1;
			}
				
		}
		System.out.println("-------------- Relat�rio --------------");
		System.out.println("matr�cula: " + matricula);
		System.out.println("nome: " + nome);		
		
		for (int cont = 0; cont < notas.length; cont++ ) {
			System.out.println("Nota " + notas[cont]);
		}
	}

}
