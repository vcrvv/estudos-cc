package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A Chegada", 2016);
        meuFilme.avalia(9);

        var filmeDoVini = new Filme("Duna 2", 2024);
        filmeDoVini.avalia(10);

        Serie serie = new Serie("Lost", 2000);
        serie.avalia(8);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoVini);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(serie);

        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            //Filme filme = (Filme) item;
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        //listaDeAssistidos.forEach(System.out::println);
        //listaDeAssistidos.forEach(item -> System.out.println(item));

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Robert Pattinson");
        buscaPorArtista.add("Joaquin Phoenix");
        buscaPorArtista.add("Margot Robbie");
        System.out.println(buscaPorArtista);

        System.out.println("Ordenados por NOME");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Ordenados por TITULO");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        System.out.println("Ordenados por ANO");
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);

    }
}
