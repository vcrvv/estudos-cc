public class JurosSimples extends Investimento {

    public JurosSimples(int id, String nome, double taxa, double valorInvestido, int tempoInvestimento) {
        super(id, nome, taxa, valorInvestido, tempoInvestimento);
    }

    @Override
    public double calcularRendimento() {
        return getValorInvestido() * getTaxa() * getTempoInvestimento();
    }
}
