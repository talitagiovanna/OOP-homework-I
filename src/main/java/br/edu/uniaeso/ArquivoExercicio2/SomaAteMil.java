package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
 2.	 Imprima	a	soma	de	1	até	1000.
 */
public class SomaAteMil {
    public static void main(String[] args) {
        // Variável para armazenar a soma.
        int soma = 0;

        // Loop para somar números de 1 até 1000.
        for (int numero = 1; numero <= 1000; numero++) {
            soma += numero;
        }

        // Imprimir a soma.
        System.out.println("A soma dos números de 1 até 1000 é: " + soma);
    }
}

