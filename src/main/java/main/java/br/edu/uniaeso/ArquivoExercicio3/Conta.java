package main.java.br.edu.uniaeso.ArquivoExercicio3;

import java.time.LocalDate;

import javax.xml.crypto.Data;

// Definição da classe Conta.
public class Conta {
    /*
    
    // Atributos da conta.
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    // Construtor da classe, utilizado para inicializar os atributos durante a criação do objeto.
    public Conta(String nomeTitular, int numero, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // Método para realizar saques na conta.
    public void sacar(double valor) {
        // Verifica se o valor do saque é válido e se há saldo suficiente na conta.
        if (valor > 0 && valor <= saldo) {
            // Realiza o saque subtraindo o valor do saldo.
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            // Exibe uma mensagem se o saque não puder ser realizado.
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para realizar depósitos na conta.
    public void depositar(double valor) {
        // Verifica se o valor do depósito é válido.
        if (valor > 0) {
            // Realiza o depósito adicionando o valor ao saldo.
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            // Exibe uma mensagem se o depósito não puder ser realizado.
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para calcular o rendimento mensal da conta.
    public double calculaRendimento() {
        // Calcula o rendimento multiplicando o saldo por 0.1 (10%).
        double rendimento = saldo * 0.1;
        // Adiciona o rendimento ao saldo da conta.
        saldo += rendimento;
        // Retorna o rendimento calculado.
        return rendimento;
    }

    // Método para recuperar dados formatados para impressão.
    public String recuperaDadosParaImpressao() {
        return "Titular: " + nomeTitular +
            "\nNúmero: " + numero +
            "\nAgência: " + agencia +
            "\nSaldo: R$" + saldo +
            "\nData de Abertura: " + dataAbertura;
    }

    // Métodos de acesso (Getters e Setters) para cada atributo da conta.

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }*/
     
    private String titular;
    private double saldo;

    // Setters para cada atributo da conta.
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


