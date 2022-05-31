package caron.lewy;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		double a = leitor.nextDouble();
		System.out.println("Informe outro numero:");
		double b = leitor.nextDouble();
		
		System.out.println("O valor de A é:" + a);
		System.out.println("O valor de B é:" + b);
		System.out.println("------------");
		
		double c = a;
		a = b;
		b = c;
		
		System.out.println("O valor de A é:" + a);
		System.out.println("O valor de B é:" + b);
		System.out.println("------------");
						
		leitor.close();
		
	}

}
