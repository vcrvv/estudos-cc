import java.util.Date;

public class JurosSimples extends Investimento {
    private double taxa;

    public JurosSimples(int id, String nome, double valorInvestido, Date dataInvestimento, double taxa) {
        super(id, nome, valorInvestido, dataInvestimento);
        this.taxa = taxa;
    }

    @Override
    public double calcularRendimento() {
        return getValorInvestido() * taxa * 1; // Assumindo 1 ano de investimento
    }
}
