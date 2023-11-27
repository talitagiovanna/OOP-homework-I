package main.java.br.edu.uniaeso.ArquivoExercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[100];
        Integer[] idades = new Integer[100];

        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.next();

        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();

        nomes[0] = nomeDigitado;
        idades[0] = idadeDigitada;
        
    }  

}
