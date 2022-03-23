
public class programa {

	public static void imprimir(String txt) {
		int valor = 100;
		System.out.println(txt);
	}
	
	public static double somar(double a, double b) {
		double vlr = a + b;
		return vlr;
	}
	
	public static void main(String[] args) {
		double valor1 = 100;
		double valor2 = 80;
		
		double resultado = somar(valor1, valor2);
	
		String texto = String.valueOf(resultado);
		imprimir(texto);
	}
	



	
}
