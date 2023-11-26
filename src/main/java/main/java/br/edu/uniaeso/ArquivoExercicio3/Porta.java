package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class Porta {
    // Atributos
    private boolean aberta;       // Indica se a porta está aberta ou fechada
    public String cor;            // Cor da porta
    private double dimensaoX, dimensaoY, dimensaoZ;  // Dimensões da porta

    // Métodos.
    public void abre() {
        aberta = true;
    }

    public void fecha() {
        aberta = false;
    }

    public void pinta(String s) {
        cor = s;
    }

    public boolean estaAberta() {
        return aberta;
    }

    // Construtor para inicializar a porta
    public Porta() {
        aberta = false;  // Porta inicialmente fechada
        cor = "Branca";  // Cor padrão
    }
}