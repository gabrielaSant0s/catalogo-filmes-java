package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //sobrecarga de método
//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//
//    }

    // quando uso a classe mae pra tipificar o dado ele pode assumir
    // o papel de Titulo, Filme ou Serie entao ele tem multiplas formas
    // e isso é o polimorfismo.
    public void inclui (Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
