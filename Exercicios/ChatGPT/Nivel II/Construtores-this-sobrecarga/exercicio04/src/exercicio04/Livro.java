/*Livro:
 * Crie uma classe Livro com atributos como título, autor e número de páginas. Utilize construtores para inicializar esses atributos.
 */

package exercicio04;

public class Livro {

	public String titulo;
	public String autor;
	public int numeroDePaginas;
	
	public Livro() {
	}
	
	public Livro(String titulo, String autor, int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
}
