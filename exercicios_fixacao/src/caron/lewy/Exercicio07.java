package caron.lewy;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		double num = leitor.nextDouble();
		
		if (num >= 100 && num <= 200) {
			System.out.println("O numero esta no intervalo de 100 a 200!");
		}else {
			System.out.println("O numero esta fora do intervalo de 100 a 200!");
		}
		
		leitor.close();

	}

}
