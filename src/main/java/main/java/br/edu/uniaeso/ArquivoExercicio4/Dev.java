package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class Dev extends Funcionario{
    
    public String linguagem;

    public Dev(String nome, String sobrenome) {
        super(nome, sobrenome);
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

}
