package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class Pessoa {
    // Atributos.
    private String nome;
    private int idade;

    // Método para realizar aniversário.
    public void fazAniversario() {
        idade++;
    }

    // Métodos de acesso aos atributos.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Construtor para inicializar a pessoa.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}