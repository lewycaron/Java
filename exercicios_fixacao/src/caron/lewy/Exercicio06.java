package caron.lewy;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a temperatura em grauls Celsios:");
		int temp = leitor.nextInt();
		
		int f = (9 * temp + 160)/5;
		
		System.out.println("A temperatura em Fahrenheit é de: " + f);
		
		leitor.close();
		
	}
}
