package caron.lewy;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um valor:");
		double num1 = leitor.nextDouble();
		System.out.println("Insira outro valor:");
		double num2 = leitor.nextDouble();
		System.out.println("Qual a operação deseja realizar? (+, -, / ou *)");
		char op = leitor.next().charAt(0);
		
		double calc = 0;
		
		
		switch (op) {
		case '+':
			calc = num1 + num2;
			System.out.println("A soma é de: " +calc);
			break;
		case '-':
			calc = num1 - num2;
			System.out.println("A subtração é de: " +calc);
			break;
		case '*':
			calc = num1 * num2;
			System.out.println("A Multiplicação é de: " +calc);
			break;
		case '/':
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("Impossivel dividir por 0");
				break;
			}			
			calc = num1 / num2;
			System.out.println("A divisão é de: " +calc);
			break;
		default:
			System.out.println("Operador não definido");
			break;
		}
		
		
		
		leitor.close();
	}
}
