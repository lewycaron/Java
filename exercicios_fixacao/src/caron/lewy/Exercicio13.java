package caron.lewy;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um valor:");
		double num1 = leitor.nextDouble();
		System.out.println("Insira outro valor:");
		double num2 = leitor.nextDouble();
		System.out.println("Qual a opera��o deseja realizar? (+, -, / ou *)");
		char op = leitor.next().charAt(0);
		
		double calc = 0;
		
		
		switch (op) {
		case '+':
			calc = num1 + num2;
			System.out.println("A soma � de: " +calc);
			break;
		case '-':
			calc = num1 - num2;
			System.out.println("A subtra��o � de: " +calc);
			break;
		case '*':
			calc = num1 * num2;
			System.out.println("A Multiplica��o � de: " +calc);
			break;
		case '/':
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("Impossivel dividir por 0");
				break;
			}			
			calc = num1 / num2;
			System.out.println("A divis�o � de: " +calc);
			break;
		default:
			System.out.println("Operador n�o definido");
			break;
		}
		
		
		
		leitor.close();
	}
}
