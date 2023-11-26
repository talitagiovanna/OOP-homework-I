package main.java.br.edu.uniaeso.ArquivoExercicio3;

import javax.xml.crypto.Data;

// Classe de teste para a classe Conta.
public class TestaConta {
    // Método principal para testar a classe Conta.
    public static void main(String[] args) {
        /*
        
        // Cria uma instância da classe Conta.
        Conta minhaConta = new Conta("João da Silva", 123456, "001", 1000.0, "01/01/2022");

        // Exibe os detalhes iniciais da conta.
        System.out.println("Detalhes da conta:");
        System.out.println("Titular: " + minhaConta.getNomeTitular());
        System.out.println("Número: " + minhaConta.getNumero());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Saldo: R$" + minhaConta.getSaldo());
        System.out.println("Data de Abertura: " + minhaConta.getDataAbertura());

        // Realiza operações na conta (saque, depósito, rendimento).
        minhaConta.sacar(200.0);
        minhaConta.depositar(500.0);
        double rendimento = minhaConta.calculaRendimento();

        // Exibe os detalhes atualizados da conta após as operações.
        System.out.println("\nDetalhes da conta após as operações:");
        System.out.println("Saldo após saque e depósito: R$" + minhaConta.getSaldo());
        System.out.println("Rendimento mensal: R$" + rendimento);

        Conta c1 = new Conta("Talita Oliveira", 789456, "002", 1200.0, "01/01/2022");
        // brincadeiras com c1....
        System.out.println(c1.recuperaDadosParaImpressao());
*/
/* 
        // Criando duas instâncias da classe Conta.
        Conta c1 = new Conta();
        c1.setTitular("Danilo");
        c1.setSaldo(100);

        Conta c2 = new Conta();
        c2.setTitular("Danilo");
        c2.setSaldo(100);

        // Comparando as contas usando o operador ==.
        if (c1 == c2) {
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }
        */
/*
        // Criando uma instância da classe Conta.
        Conta c1 = new Conta();
        c1.setTitular("Hugo");
        c1.setSaldo(100);

        // Criando uma segunda referência para a mesma instância de Conta.
        Conta c2 = c1;

        // Comparando as referências usando o operador ==.
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        /*

        RESPOSTA da 5 questão:

         Quando você cria duas referências (c1 e c2) para a mesma instância de Conta usando o código c2 = c1;, 
         ambas as referências apontam para o mesmo objeto na memória. 
         Nesse caso, ao comparar c1 e c2 usando o operador ==, 
         o resultado será true, porque ambas as referências se referem ao mesmo objeto.

         */
    }
}
