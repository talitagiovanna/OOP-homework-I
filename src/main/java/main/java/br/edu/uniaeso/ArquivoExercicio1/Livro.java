package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class Livro {
    // Atributos do Livro.
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor personalizado.
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos para obter informações do livro.
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
