import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(3);
        meuFilme.avalia(8);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println("Duração Filme: " + meuFilme.getDuracaoEmMinutos());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
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
        Filme filmeUm = new Filme();
        filmeUm.setNome("A fantastica fabrica de chocolates");
        filmeUm.setDuracaoEmMinutos(160);
        filmeUm.setAnoDeLancamento(2008);

        var filmeDois = new Filme();
        filmeDois.setNome("Viva a vida é uma festa");
        filmeDois.setDuracaoEmMinutos(160);
        filmeDois.setAnoDeLancamento(2015);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeUm);
        listaDeFilmes.add(filmeDois);
        listaDeFilmes.add(meuFilme);
        System.out.println("O tamanho da lista de filmes é " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}

