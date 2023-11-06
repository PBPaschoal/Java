//Funções interessantes para String
//Checklist:
//Formatar: toLowerCase(), toUpperCase(), trim()
//Recortar: substring(inicio), substring(inicio,fim)
//Substituir: Replace(char,char), Replace(string,string)
//Buscar: IndexOf, LastIndexOf
//str.Split("")

package course;

public class Funcoes_interessantes_String {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); //Converte a string original toda para letras minusculas.
		String s02 = original.toUpperCase(); //Converte a string original toda para letras maiusculas.
		String s03 = original.trim(); //Corta o espaçamento (nos cantos).
		String s04 = original.substring(2); //Do segundo caracter em diante.
		String s05 = original.substring(2, 9); //Recorta a string a partir do caracter 2 até o 9.
		String s06 = original.replace('a', 'x'); //Troca todos os caracteres 'a' minusculo por 'x' minusculo.
		String s07 = original.replace("abc", "xy"); //Troca 'abc' por 'xy'.
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLoweCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
