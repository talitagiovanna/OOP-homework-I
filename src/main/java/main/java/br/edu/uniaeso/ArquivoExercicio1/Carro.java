package main.java.br.edu.uniaeso.ArquivoExercicio1;

// Definição da classe Carro.
public class Carro {
    // Atributos da classe Carro.
    String modelo;
    String cor;
    int ano;

    // Este construtor é chamado quando um objeto Carro é criado.
    public Carro(String modelo, String cor, int ano) {
        // Inicializa os atributos com os valores passados como parâmetros.
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Método para exibir informações do carro.
    public void exibirInformacoes() {
        // Imprime as informações do carro no console.
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}
