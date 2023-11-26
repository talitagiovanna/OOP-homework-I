package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class MainPessoa {
    public static void main(String[] args) {
        // Criando uma pessoa.
        Pessoa pessoa = new Pessoa("João", 25);

        // Imprimindo o nome e a idade antes de fazer aniversário.
        System.out.println("Dados da Pessoa antes de fazer aniversários:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println();

        // Fazendo alguns aniversários.
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        // Imprimindo o nome e a idade da pessoa depois dos aniversários.
        System.out.println("Dados da Pessoa depois de fazer aniversários:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
