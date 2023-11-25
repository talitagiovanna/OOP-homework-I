package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class TestaConta {

    public static void main(String[] args) {
        // Criando uma instância da Conta
        Conta minhaConta = new Conta("João Silva", 12345, "001", 1000.0, "01/01/2023");

        // Exibindo informações iniciais da conta
        System.out.println("Informações iniciais da conta:");
        exibirInformacoes(minhaConta);

        // Realizando operações na conta
        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        minhaConta.calcularRendimento();

        // Exibindo informações atualizadas da conta
        System.out.println("\nInformações atualizadas da conta:");
        exibirInformacoes(minhaConta);
    }

    // Método auxiliar para exibir as informações da conta
    private static void exibirInformacoes(Conta conta) {
        System.out.println("Titular: " + conta.getNomeTitular());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Data de Abertura: " + conta.getDataAbertura());
        System.out.println();
    }
}
