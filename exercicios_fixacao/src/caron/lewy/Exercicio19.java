package caron.lewy;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o raio:");
		double r = leitor.nextDouble();
		
		System.out.println("Insira a altura:");
		double altura = leitor.nextDouble();
		
		double vol = 3.14 * Math.pow(r, 2) * altura;
		
		System.out.println("O volume é igual a: "+vol );
		
		leitor.close();

	}

}
