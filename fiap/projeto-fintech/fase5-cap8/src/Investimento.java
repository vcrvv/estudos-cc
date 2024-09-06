import java.time.LocalDateTime;

public abstract class Investimento {
    private int idInvestimento;
    private String titulo;
    private double valorInvestido;
    private double taxa;
    private int tempoInvestimento;
    private LocalDateTime data;

    // Construtores
    public Investimento(int idInvestimento, String titulo, double valorInvestido, double taxa,
            int tempoInvestimento) {
        this.idInvestimento = idInvestimento;
        this.titulo = titulo;
        this.valorInvestido = valorInvestido;
        this.taxa = taxa;
        this.tempoInvestimento = tempoInvestimento;
        this.data = LocalDateTime.now();
    }

    // Getters e Setters
    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getNome() {
        return titulo;
    }

    public void setNome(String titulo) {
        this.titulo = titulo;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getTempoInvestimento() {
        return tempoInvestimento;
    }

    public void setTempoInvestimento(int tempoInvestimento) {
        this.tempoInvestimento = tempoInvestimento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    // Métodos
    public void calcularRendimentoSimples() {
        // M = P * (1 + r * t)
        // J = P * r * t
        // lógica
        System.out.println("Investimento registrado com sucesso!");
    }

    public void calcularRendimentoComposto() {
        // lógica
        // M = P * (1 + r) ** t
        System.out.println("Investimento registrado com sucesso!");
    }
}
