package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class MainCarro {
     // Método principal (main) para execução do programa.
     public static void main(String[] args) {
        // Criando um objeto da classe Carro chamado "meuCarro".
        Carro meuCarro = new Carro("Fusca", "Azul", 2022);

        // Chamando o método exibirInformacoes() do objeto "meuCarro".
        meuCarro.exibirInformacoes();
    }
}
