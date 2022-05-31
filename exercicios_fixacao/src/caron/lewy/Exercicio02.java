package caron.lewy;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe o primeiro valor: ");
	double num1 = leitor.nextDouble();
	System.out.println("Informe o segundo valor: ");
	double num2 = leitor.nextDouble();
	double soma = num1 + num2;
	
	System.out.println("A soma dos valores é de: " + soma);
	
	
	leitor.close();
	
	
	}
}
