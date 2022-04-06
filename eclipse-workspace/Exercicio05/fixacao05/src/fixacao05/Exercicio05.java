package fixacao05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Lewy\\05-04\\fixacao05\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
	
		double grupoA = 0;
		double grupoB = 0;
		double grupoC = 0;
		double grupoD = 0;
		double grupoE = 0;
		double grupoF = 0;
		
		while (leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] dadoslinha = linha.split("\t");
			
			if(dadoslinha[0].equals("A")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoA = grupoA + valor;
			}
			
			if(dadoslinha[0].equals("B")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoB = grupoB + valor;
			}
			
			if(dadoslinha[0].equals("C")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoC = grupoC + valor;
			}
			
			if(dadoslinha[0].equals("D")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoD = grupoD + valor;
			}
			
			if(dadoslinha[0].equals("E")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoE = grupoE + valor;
			}
			
			if(dadoslinha[0].equals("F")) {
				double valor = Double.parseDouble(dadoslinha[1]);
				grupoF = grupoF + valor;
			}
			
		}
		
		double valortotalgrupos = (grupoA + grupoB + grupoC + grupoD + grupoE + grupoF);
		
		System.out.println("Valor Grupo A: " + grupoA);
		System.out.println("Valor Grupo B: " + grupoB);
		System.out.println("Valor Grupo C: " + grupoC);
		System.out.println("Valor Grupo D: " + grupoD);
		System.out.println("Valor Grupo E: " + grupoE);
		System.out.println("Valor Grupo F: " + grupoF);
		
		System.out.println("Valor Total: "+ valortotalgrupos);
		leitor.close();
		

	}

}
