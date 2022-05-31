package caron.lewy;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira a Primeira nota:");
		double n1 = leitor.nextDouble();
		System.out.println("Insira a Segunda nota:");
		double n2 = leitor.nextDouble();
		System.out.println("Insira a Terceira nota:");
		double n3 = leitor.nextDouble();
		
		double media = 3/((1/n1) + (1/n2) + (1/n3));
		
		System.out.println("A média Harmonica é de: "+media);
		
		
		
		leitor.close();

	}

}
