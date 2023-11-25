package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class Circulo {
    // Atributo
    double raio;

    // Construtor que recebe o raio como parâmetro.
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo.
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
