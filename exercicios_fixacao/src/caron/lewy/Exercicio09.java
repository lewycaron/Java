package caron.lewy;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		int num1 = leitor.nextInt();
		System.out.println("Informe outro numero:");		
		int num2 = leitor.nextInt();
		
		if(num1 == num2) {
			System.out.println("Numeros s�o iguais.");
		}else {
			if(num1 > num2) {
				System.out.println("O primeiro numero ("+num1+") � maior que o segundo ("+num2+")");
			}else {
				System.out.println("O Segundo numero ("+num2+") � maior que o primeiro ("+num1+")");
			}
		}
				
		leitor.close();
	}
}
