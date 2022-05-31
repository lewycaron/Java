package caron.lewy;

import java.util.Scanner;

	public class Exercicio17 {
		public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira a Primeira nota:");
		double n1 = leitor.nextDouble();
		System.out.println("Insira a Segunda nota:");
		double n2 = leitor.nextDouble();
		System.out.println("Insira a Terceira nota:");
		double n3 = leitor.nextDouble();


		System.out.println("Insira o Peso da primeira nota:");
		double p1 = leitor.nextDouble();
		System.out.println("Insira o Peso da segunda nota:");
		double p2 = leitor.nextDouble();
		System.out.println("Insira o Peso da terceira nota:");
		double p3 = leitor.nextDouble();

		double media = ((n1*p1) + (n2*p2) + (n3*p3)) / (p1+p2+p3);	
		
		System.out.println("A média é de: "+media);
				
		leitor.close();
	
	}
}