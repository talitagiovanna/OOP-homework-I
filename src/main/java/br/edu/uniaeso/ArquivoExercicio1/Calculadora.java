package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class Calculadora {
    // Método para adição.
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtração.
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicação.
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para divisão.
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; // Retorna um valor de ponto flutuante.
        }
    }
}
