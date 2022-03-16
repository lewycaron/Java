package exercicio2;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String[] matriculas = new String[5];
		String[] nomes = new String[5];
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		
		for (int cont = 0; cont < 5; cont++) {
		
			System.out.println("Digite a matricula " + (cont+1) + ":");
			matriculas[cont] = leitor.nextLine() ;
			System.out.println("Digite o nome " + (cont+1) + ":");
			nomes[cont] = leitor.nextLine();
			System.out.println("Digite o nota1: ");
			nota1[cont] = leitor.nextDouble();
			leitor.nextLine();
			System.out.println("Digite o nota2: ");
			nota2[cont] = leitor.nextDouble();
			leitor.nextLine();
			
		}
		
		
/**		
		String[] matriculas = new String[5];
		
		matriculas[0] = "123456";
		matriculas[1] = "234567";
		matriculas[2] = "323456";
		matriculas[3] = "423456";
		matriculas[4] = "523456";

		
		String[] nomes = new String[5];
		nomes[0] = "Joao";
		nomes[1] = "Maria";
		nomes[2] = "Jose";
		nomes[3] = "Carlos";
		nomes[4] = "Pedro";
		
		double[] nota1 = new double[5];
		nota1[0] = 8.0;
		nota1[1] = 2.0;
		nota1[2] = 3.0;
		nota1[3] = 4.0;
		nota1[4] = 5.0;
		
		double[] nota2 = new double[5];
		nota2[0] = 7.0;
		nota2[1] = 8.0;
		nota2[2] = 9.0;
		nota2[3] = 6.0;
		nota2[4] = 5.0;
		
*/		
				
		for(int cont = 0; cont < 5; cont++) { 
			System.out.println("Matricula: " + matriculas[cont]);
			System.out.println("Nome: " + nomes[cont]);
			
			double[] notafinal = new double[5];			
			notafinal[cont] = (nota1[cont] + nota2[cont])/2;
			System.out.println("Média: " + notafinal[cont]);
			
			String[] aprovado = new String[5];
			aprovado[cont] = notafinal[cont] >= 6 ?  "(X)Sim ( )Não" :  "()Sim (X)Não" ;
			System.out.println("Aprovado:" + aprovado[cont] + "\n");
			
				
		}
			

	
	}
}
