package caron.lewy;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um numero de 1 a 5:");
		int num = leitor.nextInt();

		switch (num) {
		case 1:
			System.out.println("N�mero um!");
			break;
		case 2: 
			System.out.println("N�mero dois!");
			break;
		case 3: 
			System.out.println("N�mero tres!");
			break;
		case 4: 
			System.out.println("N�mero quatro!");
			break;
		case 5: 
			System.out.println("N�mero cinco!");
			break;
		default:
			System.out.println("N�mero Inv�lido");
			break;
	
		}
		
		leitor.close();
	}
}
