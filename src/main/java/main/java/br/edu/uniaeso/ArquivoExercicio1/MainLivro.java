package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class MainLivro {
    // Método principal para testar a classe Livro.
    public static void main(String[] args) {
        // Criando um objeto da classe Livro.
        Livro meuLivro = new Livro("Ensaio sobre a cegueira", "José Saramago", 1995);

        // Obtendo e exibindo informações do livro.
        System.out.println("Livro: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Ano de Publicação: " + meuLivro.getAnoPublicacao());
    } 
}
