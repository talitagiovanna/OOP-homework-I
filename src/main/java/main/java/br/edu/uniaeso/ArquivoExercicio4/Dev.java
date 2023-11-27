package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class Dev extends Funcionario implements Autenticavel {
    
    public String linguagem;
    private int senha;

    public Dev(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String getNomeCargo() {
        return "Desenvolvedor";
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public boolean autentica(int senha) {
        /*if(this.senha == senha) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }*/
        return false;
    }
}
