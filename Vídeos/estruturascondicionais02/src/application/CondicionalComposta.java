package application;

public class CondicionalComposta {

	public static void main(String[] args) {
		int nota = 69;
		
		if (nota >= 99) {
			System.out.println("Você tirou um A!");
		} else if (nota >= 80) {
			System.out.println("Você tirou um B.");
		} else if (nota >= 70) {
			System.out.println("Você tirou um C.");
		} else {
			System.out.println("Você precisa estudar mais.");
		}
	}
}
