package br.com.alura.screenmatch.modelos;

// herança o extends no java recebe atributos e métodos como herança da outra classe
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
