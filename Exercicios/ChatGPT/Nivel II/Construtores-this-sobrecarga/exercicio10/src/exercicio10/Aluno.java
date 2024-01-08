/* Aluno:
 * Crie uma classe Aluno com atributos como nome, matrícula e curso. Utilize construtores para inicializar esses atributos.
 */

package exercicio10;

public class Aluno {
	
	public String curso;
	private String nome;
	private int matricula;
	
	public Aluno() {
	}
	
	public Aluno(String curso, String nome, int matricula) {
		this.curso = curso;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getAlunoCurso() {
		return curso;
	}
	
	public void setAlunoCurso(String curso) {
		this.curso = curso;
	}
	
	public String getAlunoNome() {
		return nome;
	}
	
	public void setAlunoNome(String nome) {
		this.nome = nome;
	}
	
	public int getAlunoMaricula() {
		return matricula;
	}
	
	public void setAlunoMatricula(int aluno) {
		this.matricula = matricula;
	}

}
