package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filmeDois = new Filme("Viva a vida é uma festa",2015);
        Filme filmeUm = new Filme("A fantastica fabrica de chocolates",2008);
        Serie serie = new Serie("Lost",2000);
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeUm);
        listaDeAssistidos.add(filmeDois);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(serie);

        filmeUm.avalia(10);
        filmeDois.avalia(5);
        meuFilme.avalia(3);

        //laço foreach
        // listaDeAssistidos.forEach(item -> System.out.println(item));
        //Method Reference ::
        // listaDeAssistidos.forEach(System.out::println);
        for (Titulo item : listaDeAssistidos){
            System.out.println(item);
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("CLassificação: " + filme.getClassificacao());
            }
        }

        ArrayList <String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Bruna Marquezine");
        buscaPorArtista.add("Vitão");
        buscaPorArtista.add("Ana Caetano");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        // Comparable
        System.out.println("Lista de Assistidos Ordenados");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        // Comparator (moderno)
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);

    }
}
