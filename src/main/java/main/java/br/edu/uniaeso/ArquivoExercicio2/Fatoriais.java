package main.java.br.edu.uniaeso.ArquivoExercicio2;

/*
 4. Imprima	os	fatoriais	de	1	a	10.
O	fatorial	de	um	número	n	é	n	*	(n-1)	*	(n-2)	*	...	*	1.	Lembre-se	de	utilizar	os	parênteses.
O	fatorial	de	0	é	1
O	fatorial	de	1	é	(0!)	*	1	=	1
O	fatorial	de	2	é	(1!)	*	2	=	2
O	fatorial	de	3	é	(2!)	*	3	=	6
O	fatorial	de	4	é	(3!)	*	4	=	24
Faça	um	for	que	inicie	uma	variável	n	(número)	como	1,	fatorial	(resultado)	como	1	e	varia	n	de	1
até	10:
int	fatorial	=	1;
for	(int	n	=	1;	n	<=	10;	n++)	{
	}
 */
public class Fatoriais {
    public static void main(String[] args) {
        // Loop para calcular e imprimir os fatoriais de 1 a 10.
        for (int n = 1; n <= 10; n++) {
            int fatorial = 1;

            // For para calcular o fatorial.
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}
