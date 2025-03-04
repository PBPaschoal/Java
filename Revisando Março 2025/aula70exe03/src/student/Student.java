package student;

public class Student {
	
	public String nome;
	public double note1;
	public double note2;
	public double note3;
	
	public Student(){
	}
	
	public Student(String nome, double note1, double note2, double note3) {
		this.nome = nome;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}
	
	public double noteTotal() {
		return note1 + note2 + note3;
	}
	
	public void result() {
		double total = noteTotal();
		if(total >= 60.0) {
			System.out.printf("FINAL GRADE = %.2f\n", total);
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE= %.2f\n", total);
			System.out.println("\nFAILED");
			double rest = 60 - total;
			System.out.printf("\nMISSING %.2f POINTS", rest);
		}
	}

}
