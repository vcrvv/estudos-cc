public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlanoo;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double obtemMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
