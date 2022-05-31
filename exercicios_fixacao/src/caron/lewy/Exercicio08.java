package caron.lewy;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		int num = leitor.nextInt();
		
		if(num >= 50) {
			System.out.println("Numero Maior ou igual a 50");
		}else {
			System.out.println("Numero Menor que 50");
		}
		
		leitor.close();

	}

}
