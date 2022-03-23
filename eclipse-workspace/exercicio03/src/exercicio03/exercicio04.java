package exercicio03;

	import java.util.Scanner;

	public class exercicio04 {
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			double[] notapeso = {0.05, 0.05, 0.2, 0.2, 0.5};
			
			
			System.out.println("Digite a Matricula: ");
			String matricula = leitor.nextLine();
			
			System.out.println("Digite o nome: ");
			String nome = leitor.nextLine();
			
			double[] notas = new double[5];
			
			
			
			double notafinal = 0;
			for (int cont=0; cont<5 ; cont++) {
				System.out.println("Digite a nota " + (cont + 1) + " entre 0 e 10:");
				notas[cont] = leitor.nextDouble();
			
				if (notas[cont] <= 10 && notas[cont] >= 0) {
					System.out.println("nota valida!");
					notafinal = notafinal + (notas[cont] * notapeso[cont]);
					
				}else{
					System.out.println("nota Invalida!");
					cont = cont - 1;
				}

			}
			
			
			
			
			System.out.println("-------------- Relatório --------------");
			System.out.println("matrícula: " + matricula);
			System.out.println("nome: " + nome);		
			
			for (int cont = 0; cont < notas.length; cont++ ) {
				System.out.println("Nota " + notas[cont]);
			}
			
			System.out.println("Nota Final: " +notafinal);
			
			if (notafinal >= 6 ) {
				System.out.println("Status: APROVADO");
			}else {
				System.out.println("Status: REPROVADO");
			}

	}

}
