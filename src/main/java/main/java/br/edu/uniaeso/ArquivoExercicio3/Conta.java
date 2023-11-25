package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class Conta {

    // Atributos da Conta
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    // Construtor da Conta
    public Conta(String nomeTitular, int numero, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // Método para sacar um valor do saldo
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para depositar um valor no saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para calcular o rendimento mensal
    public void calcularRendimento() {
        // Lógica para calcular o rendimento (pode variar de acordo com a implementação desejada)
        double rendimento = saldo * 0.1; // Exemplo simples, 10% de rendimento
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado. Novo saldo: R$ " + saldo);
    }

    // Métodos getters e setters para acessar e modificar os atributos

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
    }
}
