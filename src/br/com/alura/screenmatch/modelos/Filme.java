package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

// herança o extends no java recebe atributos e métodos como herança da outra classe
// extends herda de outra classe implements implementa interface
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // implementação da interface
    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/ 2;
    }
}
