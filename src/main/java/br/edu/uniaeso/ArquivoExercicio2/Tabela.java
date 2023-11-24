package main.java.br.edu.uniaeso.ArquivoExercicio2;


/*
 8. Imprima	a	seguinte	tabela	usando		for	s	encadeados:
	1
	2	4
	3	6	9
	4	8	12	16
	n	n*2	n*3	....	n*n
 */
public class TabelaMultiplicativa {
    public static void main(String[] args) {
        // Número de linhas na tabela.
        int nLinhas = 5;

        // Loop para iterar sobre as linhas.
        for (int i = 1; i <= nLinhas; i++) {
            // Loop para imprimir os números na linha atual.
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + "\t");
            }
            // Para mudar para a próxima linha.
            System.out.println();
        }
    }
}
