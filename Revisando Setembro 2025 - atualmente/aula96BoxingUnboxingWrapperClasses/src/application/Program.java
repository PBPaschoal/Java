package application;

public class Program {
	
	public static void main (String[] args) {
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		int y = (int) obj;
		System.out.println(y);
		
		//Ou
		//int x = 20;
		//Integer obj = x;
		//System.out.println(obj);
		//
		//int y = obj;
		//System.out.println(y);
	}

}
