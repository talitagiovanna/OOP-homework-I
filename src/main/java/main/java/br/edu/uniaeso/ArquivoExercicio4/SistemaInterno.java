package main.java.br.edu.uniaeso.ArquivoExercicio4;

public class SistemaInterno {
    public boolean autentica(Autenticavel func, int senha) {
        if(func.autentica(senha)) {
        System.out.println("Usuário logado");
        return true;
    } else {
        System.out.println("Usuário não logado, problema na autenticação");
        return false;
    }
    }
}
