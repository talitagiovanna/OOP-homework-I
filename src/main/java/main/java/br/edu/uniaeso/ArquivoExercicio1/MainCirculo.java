package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class MainCirculo {
    // Método principal para testar a classe Circulo.
    public static void main(String[] args) {
        // Criando um objeto da classe Circulo com raio 5.0.
        Circulo meuCirculo = new Circulo(5.0);

        // Calculando e exibindo a área do círculo.
        double area = meuCirculo.calcularArea();
        System.out.println("A área do círculo é: " + area);
    }
}
