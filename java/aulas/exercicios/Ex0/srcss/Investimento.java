public abstract class Investimento {
    private int id;
    private String nome;
    private double valorInvestido;
    private double taxa;
    private int tempoInvestimento;
    

    // Construtores
    public Investimento(int id, String nome, double valorInvestido, double taxa, int tempoInvestimento) {
        this.id = id;
        this.nome = nome;
        this.taxa = taxa;
        this.valorInvestido = valorInvestido;
        this.tempoInvestimento = tempoInvestimento;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // Métodos
    public abstract double calcularRendimento();

}
