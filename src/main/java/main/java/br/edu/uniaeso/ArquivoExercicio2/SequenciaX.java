package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
7.	Escreva	um	programa	em	que,	dada	uma	variável		x		com	algum	valor	inteiro,	temos	um
novo		x		de	acordo	com	a	seguinte	regra:
Se		x		é	par,		x	=	x	/	2	;
Se		x		é	impar,		x	=	3	*	x	+	1	;
Imprime		x	; 
O	programa	deve	parar	quando		x		tiver	o	valor	final	de	1.	Por	exemplo,	para		x	=	13	,	a	saída
será:
40	->	20	->	10	->	5	->	16	->	8	->	4	->	2	->	1
*/
public class SequenciaX {
    public static void main(String[] args) {
        // Valor inicial de x.
        int x = 3;

        // Loop enquanto x for diferente de 1.
        while (x != 1) {
            // Imprime o valor atual de x.
            System.out.print(x + " -> ");

            // Aplica a regra.
            if (x % 2 == 0) {
                // Se x é par.
                x = x / 2;
            } else {
                // Se x é ímpar.
                x = 3 * x + 1;
            }
        }

        // Imprime o último valor 1.
        System.out.println(x);
    }
}
