package main.java.br.edu.uniaeso.ArquivoExercicio3;

public class Casa {
    // Atributos.
    public String cor;
    public Porta porta1, porta2, porta3;

    // Métodos.
    public void pinta(String s) {
        cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1 != null && porta1.estaAberta()) cont++;
        if (porta2 != null && porta2.estaAberta()) cont++;
        if (porta3 != null && porta3.estaAberta()) cont++;
        return cont;
    }

    // Construtor para inicializar a casa.
    public Casa(String cor) {
        this.cor = cor;
    }
}
