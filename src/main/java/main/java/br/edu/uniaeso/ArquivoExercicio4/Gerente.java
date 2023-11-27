package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class Gerente extends Funcionario{
    
    /*public String nome;
    public String cpf;
    public double salario;
*/
    public int senha;
    public int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String sobrenome) {
        super(nome, sobrenome);
        //this.numeroDeFuncionariosGerenciados = numeroDeFuncionarios;
    }

    @Override
    public String getNomeCargo() {
        return "Gerente";
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
/*
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpg(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
*/
}
