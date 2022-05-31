package caron.lewy;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		int num1 = leitor.nextInt();
		System.out.println("Insira o segundo valor:");
		int num2 = leitor.nextInt();
		System.out.println("Insira o terceiro valor:");
		int num3 = leitor.nextInt();
		
			
		if(num1 > num2 && num1 > num3){
			System.out.println(num1);
			if(num2 > num3) {
				System.out.println(num2);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		
		if(num2 > num1 && num2 > num3){
			System.out.println(num2);
			if(num1 > num3) {
				System.out.println(num1);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num1);
			}
		}
		
		if(num3 > num2 && num3 > num1){
			System.out.println(num3);
			if(num2 > num1) {
				System.out.println(num2);
				System.out.println(num1);
			}else {
				System.out.println(num1);
				System.out.println(num2);
			}
		}
		
		
		leitor.close();
	}

}
