package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class Diretor extends Funcionario{
    
    public int senha;

    public Diretor(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    @Override
    public String getNomeCargo() {
        return "Diretor";
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
}
