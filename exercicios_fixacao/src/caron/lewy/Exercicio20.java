package caron.lewy;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira a velocidade m�dia:");
		double velMedia = leitor.nextDouble();
		System.out.println("Insira o tempo gasto:");
		double tempo = leitor.nextDouble();

		
		// Veiculo faz 12km por Litro.
		
		//DISTANCIA = TEMPO * VELOCIDADE
		
		//Quantidade de litros utilizada = Dist�ncia percorrida / Consumo m�dio (12km)
				
		
		double qtdLitros = (tempo * velMedia) / 12;
		System.out.println("Quantidade de litros gasta: "+ qtdLitros);
				
		
		leitor.close();
		


	}

}
