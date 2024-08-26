import java.util.Date;

public class JurosCompostos extends Investimento {
    private double taxa;
    private int periodicidade;

    public JurosCompostos(int id, String nome, double valorInvestido, Date dataInvestimento, double taxa, int periodicidade) {
        super(id, nome, valorInvestido, dataInvestimento);
        this.taxa = taxa;
        this.periodicidade = periodicidade;
    }

    @Override
    public double calcularRendimento() {
        return getValorInvestido() * Math.pow(1 + taxa / 100, periodicidade);
    }
}
