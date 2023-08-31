// Aula 40 
// Escopo e Inicialização
// Checklist
// Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
// Uma variável não pode ser usada se não for iniciada.


package escopoinicializacao;

public class escopoInicializacao {

	public static void main(String[] args) {

		double price = 400.00;
		
		double discount;
		
		if(price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = price * 0.5;
		}
		
		System.out.println(discount); // se você não declarar a variavel discount fora da condição if, o programa vai dar erro, pois só terá sido 
		//declarada dentro do escopo. E se você não informar um valor para a variavel discount (dentro ou fora do escopo), tambám vai dar erro, o 
		//mesmo vale para if e else, ela precisa ter um valor nas condições para que seja permitido usar (nesse caso).

	}

}
