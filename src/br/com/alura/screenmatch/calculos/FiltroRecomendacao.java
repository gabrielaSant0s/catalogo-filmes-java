package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Melhores do momento!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Intermedíarios!");
        } else {
            System.out.println("Com pior avaliação!");
        }
    }

}
