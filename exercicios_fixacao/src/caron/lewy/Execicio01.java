package caron.lewy;

import java.util.Scanner;

public class Execicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		double num = leitor.nextDouble();
		
		if(num > 10) {
			System.out.println("O valor informado é maior do que 10!");
		}else {
			System.out.println("O valor informado é menor ou igual  a 10!");
		}
		
		leitor.close();
	}

}
