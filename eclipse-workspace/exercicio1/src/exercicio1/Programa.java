/**
 Criar um programa para processar as seguintes informa��es de um aluno:
matr�cula, nome , nota1, nota2 e se ele est� aprovado ou reprovado;

 Durante a execu��o calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno est� aprovado, caso contr�rio estar� reprovado;

 O programa dever� imprimir o seguinte relat�rio:

Matr�cula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) N�o
Nota final: xxxxx

 */


package exercicio1;

import java.util.Scanner;

public class Programa { //inicio
	public static void main(String[] args) {// inicio main
				
		
		Scanner leitor = new Scanner(System.in);
					
		System.out.println("Digite a matricula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a Nota1:");	
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite a Nota2:");	
		double nota2 = leitor.nextDouble();
		
		
		
		
//		String matricula = "123456789";
//		String nome ="Lewy Caron";
//		double nota1 = 4.5;
//		double nota2 = 7.5;
		
		
		
		double media = (nota1 + nota2)/2;
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		
/**	
 		if(media >= 6) 
			System.out.println("Aprovado: (X)Sim ( )N�o");
		}else {
			System.out.println("Aprovado: ( )Sim (x)N�o");
		}
*/		
		
		String aprovado = media >= 6 ?  "(X)Sim ( )N�o" :  "()Sim (X)N�o" ;
		System.out.println("Aprovado:" + aprovado);
		
		System.out.println("M�dia: " + media);
		
		leitor.close();

		
	}//fim main
} //fim
