package caron.lewy;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor de um numero inteiro distinto A :");
		int num1 = leitor.nextInt();
		System.out.println("Informe o valor de outro numero inteiro distinto B");
		int num2 = leitor.nextInt();
		
		if(num1 == num2) {
			System.out.println("A sequencia de numeros informados é inválida.");
		} else if(num1 > num2) {
			System.out.println("O valor do numero A("+ num1 + ") é maior que o valor de B(" + num2 + ")");
		}else {
			System.out.println("O valor do numero B("+ num2 + ") é maior que o valor de A(" + num1 + ")");
		}
				
		
		leitor.close();
	}

}
