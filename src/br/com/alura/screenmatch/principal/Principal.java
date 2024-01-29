package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(3);
        meuFilme.avalia(8);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println("Duração Filme: " + meuFilme.getDuracaoEmMinutos());

        Serie serie = new Serie("Lost",2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(22);
        serie.setMinutosPorEpisodio(25);
        serie.exibeFichaTecnica();

        System.out.println("Duração Serie: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizualizacoes(400);
        filtro.filtra(episodio);

        // trabalhando com arrayList
        Filme filmeUm = new Filme("A fantastica fabrica de chocolates",2008);
        filmeUm.setDuracaoEmMinutos(160);


        var filmeDois = new Filme("Viva a vida é uma festa",2015);
        filmeDois.setDuracaoEmMinutos(160);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeUm);
        listaDeFilmes.add(filmeDois);
        listaDeFilmes.add(meuFilme);
        System.out.println("O tamanho da lista de filmes é " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        Filme filmeComConstrutor = new Filme("Dogville",2000);
        System.out.println(filmeComConstrutor.getNome());
    }
}

