package main.java.br.edu.uniaeso.ArquivoExercicio1;

public class MainCalculadora {
   // Método principal para testar a calculadora.
   public static void main(String[] args) {
    // Criando um objeto da classe Calculadora.
    Calculadora minhaCalculadora = new Calculadora();

    // Realizando operações matemáticas e atribuindo valores aos parâmetros.
    int resultadoSoma = minhaCalculadora.somar(5, 3);
    int resultadoSubtracao = minhaCalculadora.subtrair(8, 2);
    int resultadoMultiplicacao = minhaCalculadora.multiplicar(4, 6);
    double resultadoDivisao = minhaCalculadora.dividir(10.0, 0.0);

    // Exibindo os resultados. 
    System.out.println("Resultado da Soma: " + resultadoSoma);
    System.out.println("Resultado da Subtração: " + resultadoSubtracao);
    System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
    System.out.println("Resultado da Divisão: " + resultadoDivisao);
} 
}
