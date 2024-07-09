import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.calculos.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("A Chegada");
        meuFilme.setAnoDeLancamento(2016);
        meuFilme.setDuracaoEmMinutos(154);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtemMedia());


        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
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
    }
}