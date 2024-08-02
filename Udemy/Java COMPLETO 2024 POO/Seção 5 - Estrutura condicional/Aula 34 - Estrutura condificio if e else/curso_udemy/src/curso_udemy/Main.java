// Aula 34 Estrutura condicional (if e else)

package curso_udemy;

public class Main {

	public static void main(String[] args) {

		int horaDoDia = 14;

		if (horaDoDia >= 18 && horaDoDia <= 23) {
			System.out.println("Boa noite");
		} 
		else if (horaDoDia >= 12 && horaDoDia <= 18) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Bom dia");
		}
	}

}
