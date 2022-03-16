/**
 Criar um programa para processar as seguintes informações de um aluno:
matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;

 Durante a execução calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno está aprovado, caso contrário estará reprovado;

 O programa deverá imprimir o seguinte relatório:

Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
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
			System.out.println("Aprovado: (X)Sim ( )Não");
		}else {
			System.out.println("Aprovado: ( )Sim (x)Não");
		}
*/		
		
		String aprovado = media >= 6 ?  "(X)Sim ( )Não" :  "()Sim (X)Não" ;
		System.out.println("Aprovado:" + aprovado);
		
		System.out.println("Média: " + media);
		
		leitor.close();

		
	}//fim main
} //fim
