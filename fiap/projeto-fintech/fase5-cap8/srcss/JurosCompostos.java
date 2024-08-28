public class JurosCompostos extends Investimento {

    public JurosCompostos(int id, String nome, double taxa, double valorInvestido, int tempoInvestimento) {
        super(id, nome,taxa, valorInvestido, tempoInvestimento);
    }

    @Override
    public double calcularRendimento() {
        return getValorInvestido() * Math.pow(1 + getTaxa() / 100, getTempoInvestimento());
    }
}
