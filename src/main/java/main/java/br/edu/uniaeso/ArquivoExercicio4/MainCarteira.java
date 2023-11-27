package main.java.br.edu.uniaeso.ArquivoExercicio4;

import java.util.Scanner;

public class MainCarteira {
    public static void main(String[] args) {
        
        CarteiraEstudantil carteira = new CarteiraEstudantil("João", "das Neves", 20, false);
        System.out.println(carteira.getNomeCompleto());
        
        
        //System.out.println(carteira.nome);
        //carteira.nome = "Renato";
        //carteira.idade = -10;

        CarteiraEstudantil carteira2 = new CarteiraEstudantil();

        //CarteiraEstudantil carteira3 = new CarteiraEstudantil("Renato");
        //System.out.println(carteira3.getNomeCompleto());
        /*
        carteira.nome = "João";
        carteira.idade = 18;


        CarteiraEstudantil carteira2 = new CarteiraEstudantil();
        carteira2.idade = 20;

        System.out.println(carteira.idade);
        System.out.println(carteira2.idade);

        */

        //int valor = 5;

        /*
        System.out.println("Valor: " + valor);
        System.out.println("Nome original: " + carteira.nome);
        System.out.println("Idade original: " + carteira.idade);

        alteraValorInt(valor);
        alteraValorString(carteira);

        System.out.println("Valor alterado: " + valor);
        System.out.println("Nome alterado: " + carteira.nome);
        System.out.println("Idade alterado: " + carteira.idade);
*/

        /*
        CarteiraEstudantil carteira1 = new CarteiraEstudantil();
        carteira1.nome = "Maria";
        carteira1.idade = 19;

        System.out.println(carteira);
        System.out.println(carteira1);

        */
        
        //Scanner leitor = new Scanner(System.in);

        //CarteiraEstudantil[] carteiras = new CarteiraEstudantil[10];

        //carteiras[0] = carteira;


    }

    /*public static void alteraValorString(CarteiraEstudantil carteira) {
            carteira.nome = "Nome dado pelo metódo";
        }

    public static void alteraValorInt(int valor) {
            valor = 10;
        }
        */
}
