package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class Fibonacci {

    public int calculaFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }

    /*
    RESPOSTA DA QUESTÃO 2:

    A abordagem recursiva para calcular a série de Fibonacci é mais lenta do que a abordagem iterativa 
    devido à natureza exponencial do crescimento do número de chamadas recursivas. Isso ocorre porque a 
    recursão cria uma árvore de chamadas com muitos cálculos redundantes, enquanto a abordagem iterativa 
    usa um loop para calcular os valores de Fibonacci de forma linear, evitando a repetição de cálculos. 
    Adicionar memoização ao método recursivo pode melhorar significativamente o desempenho, tornando-o mais 
    comparável ao método iterativo.
    
     */
}
