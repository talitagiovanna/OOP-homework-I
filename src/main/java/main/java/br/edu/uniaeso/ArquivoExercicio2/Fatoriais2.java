package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
 5. No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos
até	20,	30	e	40.	Em	um	determinado	momento,	além	de	esse	cálculo	demorar,	começará	a	mostrar
respostas	completamente	erradas.	Por	quê?
Mude	de		int		para		long		a	fim	de	ver	alguma	mudança.
 */
public class Fatoriais2 {
    public static void main(String[] args) {
        // Loop para calcular e imprimir os fatoriais de 1 a 40.
        for (int n = 1; n <= 40; n++) {
            long fatorial = 1; // Aqui foi alterado para long.

            // For para calcular o fatorial.
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}
