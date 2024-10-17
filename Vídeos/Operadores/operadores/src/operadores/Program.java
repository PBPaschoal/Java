package operadores;

public class Program {
	
	public static void main(String[] args) {
		
		boolean temCarteira = true;
		boolean temCarro = false;
		boolean podeDirigir = temCarteira && temCarro;
		
		System.out.println("Pode dirigir? " + podeDirigir);
	
	}
}
