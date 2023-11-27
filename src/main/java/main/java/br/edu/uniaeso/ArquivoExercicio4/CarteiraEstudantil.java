package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class CarteiraEstudantil {
    private String nome;
    private String sobrenome;
    private int idade;
    private boolean ativo;

    CarteiraEstudantil() {

    }

    /*CarteiraEstudantil(String nome) {
        this.nome = nome;
    }
*/
    public CarteiraEstudantil(String nome, String sobrenome, int idade, boolean ativo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.ativo = ativo;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome; 
    }

    public int getIdade(){
        return this.idade;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
