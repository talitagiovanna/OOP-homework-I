package main.java.br.edu.uniaeso.ArquivoExercicio4;

public abstract class Funcionario {
    
    public String nome;
    public String sobrenome;
    public String cpf;
    public double salario;
    public Endereco endereco;

    public Funcionario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public abstract String getNomeCargo();

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
