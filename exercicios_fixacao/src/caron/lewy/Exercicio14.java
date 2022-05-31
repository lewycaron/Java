package caron.lewy;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o valor de a1:");
		double a1 = leitor.nextDouble();
		System.out.println("Insira o valor de n:");
		double n = leitor.nextDouble();
		System.out.println("Insira o valor de r:");
		double r = leitor.nextDouble();
		
		double an = a1 + ((n-1) * r);
		
		System.out.println("O resultado é de: " + an);
		
		
		leitor.close();

	}

}
