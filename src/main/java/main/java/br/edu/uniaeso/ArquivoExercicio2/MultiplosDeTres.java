package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
 3. Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
 */
public class MultiplosDeTres {
    public static void main(String[] args) {
        // Loop para imprimir múltiplos de 3 entre 1 e 100.
        for (int numero = 1; numero <= 100; numero++) {
            // Verifica se o número é um múltiplo de 3.
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }
    }
}
