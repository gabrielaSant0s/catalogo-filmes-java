package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

// herança o extends no java recebe atributos e métodos como herança da outra classe
// extends herda de outra classe implements implementa interface
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


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

    // Todas as classes herdam da classe Object entao vamos reescrever o método toSting() da object
    @Override
    public String toString() {
        return "Filme : " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
