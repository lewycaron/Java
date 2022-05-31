package caron.lewy;

import java.util.Scanner;

public class Exercicio04 {
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe o primeiro valor: ");
			double num1 = leitor.nextDouble();
			System.out.println("Informe o segundo valor: ");
			double num2 = leitor.nextDouble();
			
			double soma = num1 + num2;
			double sub = num1 - num2;
			double div = num1 / num2;
			double mult = num1 * num2;
			
			System.out.println("A soma dos valores é de: " + soma);
			System.out.println("A Subtração dos valores é de: " + sub);
			System.out.println("A divisão dos valores é de: " + div);
			System.out.println("A Multiplicação dos valores é de: " + mult);
			
			
			leitor.close();
	}
}
