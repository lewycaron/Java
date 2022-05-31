package caron.lewy;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o valor de ponto 1 X:");	
		double x1 = leitor.nextDouble();
		System.out.println("Insira o valor de ponto 1 Y:");	
		double y1 = leitor.nextDouble();
		System.out.println("Insira o valor de ponto 2 X:");	
		double x2 = leitor.nextDouble();
		System.out.println("Insira o valor de ponto 2 Y:");	
		double y2 = leitor.nextDouble();

		double dist = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1,2)));
		
		System.out.println("A distancia entre os 2 pontos é de: "+dist);
		
	
		
		leitor.close();

	}


}
