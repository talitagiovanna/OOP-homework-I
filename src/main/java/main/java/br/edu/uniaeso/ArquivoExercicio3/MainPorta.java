package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class MainPorta {
    public static void main(String[] args) {
        // Criando uma porta
        Porta porta = new Porta();

        // Abrindo e fechando a porta
        porta.abre();
        System.out.println("Está aberta?");
        if (porta.estaAberta() == true) {
            System.out.println("Sim, está aberta.");
        }
        else {
            System.out.println("Não, está fechada.");
        }
        porta.fecha();
        System.out.println("Está aberta?");
        if (porta.estaAberta() == true) {
            System.out.println("Sim, está aberta.");
        }
        else {
            System.out.println("Não, está fechada.");
        }

        // Pintando a porta de vermelho
        porta.pinta("Vermelho");

        // Verificando a cor da porta
        System.out.println("Cor da porta: " + porta.cor);
    }
}
