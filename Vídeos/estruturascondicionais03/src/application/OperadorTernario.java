package application;

public class OperadorTernario {

	public static void main(String[] args) {
		// variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
		//tradicional
		//int numero = 10;
		//String resultado;
		//
		//if (numero % 2 == 0) {
		//	resultado = "Par";
		//} else {
		//	resultado = "Ímpar";
		//}
		//System.out.println("O número é " + resultado);

		//Ternario
		int numero = 10;
		String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
		System.out.println("O número é " + resultado);
	}

}
