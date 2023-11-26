package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class MainCasa {
    public static void main(String[] args) {
        // Criando uma casa.
        Casa casa = new Casa("Azul");

        // Criando três portas.
        casa.porta1 = new Porta();
        casa.porta2 = new Porta();
        casa.porta3 = new Porta();

        // Abrindo e fechando as portas.
        casa.porta1.abre();
        casa.porta2.abre();
        casa.porta3.fecha();

        // Pintando a casa de amarelo.
        casa.pinta("Amarelo");

        // Imprimindo o número de portas abertas.
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}
