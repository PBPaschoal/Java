// Aula 58 - Funções interessantes para String

package aula58;

public class funcoesInteressantesParaString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String minusculo = original.toLowerCase();
		String maiusculo = original.toUpperCase();
		String eliminarEspacos = original.trim();
		String corteCaracter = original.substring(2);
		String corteCaracterInicioFim = original.substring(2, 9);
		String trocaLetras = original.replace('a', 'x');
		String trocaLetrasTB = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String frase = "Aprendendo sobre Split";

		String[] vetor = frase.split(" ");

		System.out.println("Texto original: -" + original + "-");
		System.out.println("Texto convertido para minusculo (toLowerCase): -" + minusculo + "-");
		System.out.println("Texto convertido para maiusculo (toUpperCase): -" + maiusculo + "-");
		System.out.println("Texto convertido para Eliminar os espaços, no inicio e no final (trim): -" + eliminarEspacos + "-");
		System.out.println("Texto a partir do valor especificado (substring(2)): -" + corteCaracter + "-");
		System.out.println("Texto começa a partir do valor especificado e termina no valor especificado (substring(2, 9)): -" + corteCaracterInicioFim + "-");
		System.out.println("Texto troca a letra 'a' por 'x' (replace('a', 'x'): -" + trocaLetras + "-");
		System.out.println("Texto troca as letras 'abc' por 'xy' (replace('abc', 'xy'): -" + trocaLetrasTB + "-");
		System.out.println("Texto localiza a primeira ocorrencia de 'bc' (Index of 'bc'): -" + i + "-");
		System.out.println("Texto localiza a última ocorrencia de 'bc' (Last Index Of 'bc'): -" + j + "-");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		
	}
}
