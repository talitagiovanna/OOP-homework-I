package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
 6. Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
segundo	vale	1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
ésimo	elemento	(ex:	8	=	5	+	3).
 */

public class Fibonacci {
    public static void main(String[] args) {
        // Define os primeiros dois elementos da série de Fibonacci.
        int primeiroElemento = 0;
        int segundoElemento = 1;

        // Imprime os primeiros elementos até ultrapassar 100.
        while (primeiroElemento <= 100) {
            System.out.println(primeiroElemento);

            // Calcula o próximo elemento da série.
            int proximoElemento = primeiroElemento + segundoElemento;

            // Atualiza os elementos para o próximo ciclo.
            primeiroElemento = segundoElemento;
            segundoElemento = proximoElemento;
        }
    }
}
