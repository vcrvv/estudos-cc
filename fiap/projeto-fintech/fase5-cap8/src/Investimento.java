import java.time.LocalDateTime;

public abstract class Investimento {
    private int idInvestimento;
    private String nome;
    private double valorInvestido;
    private double taxa;
    private int tempoInvestimento;
    private LocalDateTime data;
    

    // Construtores
    public Investimento(int idInvestimento, String nome, double valorInvestido, double taxa, int tempoInvestimento, LocalDateTime data) {
        this.idInvestimento = idInvestimento;
        this.nome = nome;
        this.taxa = taxa;
        this.valorInvestido = valorInvestido;
        this.tempoInvestimento = tempoInvestimento;
        this.data = data;
    }

    // Getters e Setters
    public int getIdInvestimento() {return idInvestimento;}
    public void setIdInvestimento(int idInvestimento) {this.idInvestimento = idInvestimento;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getValorInvestido() {return valorInvestido;}
    public void setValorInvestido(double valorInvestido) {this.valorInvestido = valorInvestido;}

    public double getTaxa() {return taxa;}
    public void setTaxa(double taxa) {this.taxa = taxa;}

    public int getTempoInvestimento() {return tempoInvestimento;}
    public void setTempoInvestimento(int tempoInvestimento) {this.tempoInvestimento = tempoInvestimento;}

    public LocalDateTime getData() {return data;}
    public void setData(LocalDateTime data) {this.data = data;}


    // Métodos
    public double calcularRendimentoSimples() {
        // M = C * i * T
        return getValorInvestido() * (1.00 + (getTaxa() / 100)) * getTempoInvestimento();
    }

    public double calcularRendimentoComposto() {
        return getValorInvestido() * (1.00 + (getTaxa() / 100)) * getTempoInvestimento();
    }
}

