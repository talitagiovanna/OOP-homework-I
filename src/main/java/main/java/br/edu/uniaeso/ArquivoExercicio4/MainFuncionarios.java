package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class MainFuncionarios {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario();
        //funcionario.setNome("Talita");

        Gerente gerente = new Gerente("João", "da Neves", 5);
        System.out.println(gerente.getNomeCompleto());
        Diretor diretor = new Diretor("Talita", "Oliveira");
        
        Dev dev = new Dev("Joicy", "Brasil");
        dev.setNome("Fulano");
        dev.setSobrenome("de Tal");
        System.out.println(dev.getNomeCompleto());

    }
}
