package caron.lewy;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira a Primeira nota:");
		double n1 = leitor.nextDouble();
		System.out.println("Insira a Segunda nota:");
		double n2 = leitor.nextDouble();
		System.out.println("Insira a Terceira nota:");
		double n3 = leitor.nextDouble();
		
		double media = (n1 + n2 + n3)/3;
		
		System.out.println("A média é de: "+media);
		
		
		
		leitor.close();

	}

}
