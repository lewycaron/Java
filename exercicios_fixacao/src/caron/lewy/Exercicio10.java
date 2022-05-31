package caron.lewy;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um numero de 1 a 5:");
		int num = leitor.nextInt();

		switch (num) {
		case 1:
			System.out.println("Número um!");
			break;
		case 2: 
			System.out.println("Número dois!");
			break;
		case 3: 
			System.out.println("Número tres!");
			break;
		case 4: 
			System.out.println("Número quatro!");
			break;
		case 5: 
			System.out.println("Número cinco!");
			break;
		default:
			System.out.println("Número Inválido");
			break;
	
		}
		
		leitor.close();
	}
}
