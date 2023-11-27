package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class MainFuncionarios {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario();
        //funcionario.setNome("Talita");

        //Gerente gerente = new Gerente("João", "da Neves", 5);
        //System.out.println(gerente.getNomeCompleto());
        Diretor diretor = new Diretor("Talita", "Oliveira");
        
        Dev dev = new Dev("Joicy", "Brasil");
        dev.setNome("Fulano");
        dev.setSobrenome("de Tal");
        Endereco end = new Endereco();
        end.setRua("Rua 1");
        dev.setEndereco(end);
        dev.setLinguagem("Java");
        dev.setSenha(980);

        Cliente cliente = new Cliente();
        SistemaInterno sistemaInterno = new SistemaInterno();
        boolean isLogado = sistemaInterno.autentica(cliente, 780);


        //SistemaInterno sistemaInterno = new SistemaInterno();
        //boolean isLogado = sistemaInterno.autentica(dev, 980);
        if(isLogado) {
            //acesso ao sistema
        }

        System.out.println(dev.getNomeCompleto());
        imprimeNomeCargo(dev);

        Gerente gerente = new Gerente("Gerente", "da Silva");

        imprimeNomeCargo(gerente);

    }

    public static void imprimeNomeCargo(Funcionario func) {
        System.out.println(func.getNomeCargo());

        if(func instanceof Dev) {
            Dev dev = (Dev) func;
            System.out.println(dev.getLinguagem());
        } else if (func instanceof Gerente){
            Gerente gerente = (Gerente) func;
            System.out.println("Não sou desenvolvedor, sou: " + gerente.getNomeCargo());
        } else {
            System.out.println("Não sou nem gerente e nem desenvolvedor");
        }
    }
}
