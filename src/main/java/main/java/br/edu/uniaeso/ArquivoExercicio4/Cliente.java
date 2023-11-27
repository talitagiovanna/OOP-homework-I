package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class Cliente implements Autenticavel {

    private String nome;
    private String sobrenome;

    public String getNomeCompleto() {
        return nome.concat(" ").concat(sobrenome);
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

    @Override
    public boolean autentica(int senha) {
        return true;
    }
    
}
