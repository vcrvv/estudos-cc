import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.calculos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A Chegada", 2016);
        meuFilme.setDuracaoEmMinutos(154);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtemMedia());

        Serie serie = new Serie("Lost", 200);
        serie.setTemporadas(10);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        System.out.println("Duração da série: " + serie.getDuracaoEmMinutos());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomedacao filtro = new FiltroRecomedacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoVini = new Filme("Duna 2", 2024);
        //filmeDoVini.setNome("Duna 2");
        filmeDoVini.setDuracaoEmMinutos(166);
        filmeDoVini.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoVini);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista:" + listaDeFilmes.size());
        System.out.println("Primerio Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());


    }
}