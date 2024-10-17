package especie;

public class Mamiferos {

    private String nome;
    private int idade;
    private char sexo;

    public Mamiferos() {}

    public Mamiferos(String nome) {
        this.nome = nome;
    }

    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Mamiferos(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String beberAgua() {
        String artigo = (sexo == 'F') ? "A " : "O ";
        return artigo + nome + " está bebendo água.";
    }
    
    public String idadeDoAnimal() {
        return nome + " tem " + idade + " anos.";
    }
}
