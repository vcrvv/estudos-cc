import java.util.Date;

public abstract class Investimento {
    private int id;
    private String nome;
    private double valorInvestido;
    private Date dataInvestimento;


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

    public Date getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(Date dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    // Métodos
    public Investimento(int id, String nome, double valorInvestido, Date dataInvestimento) {
        this.id = id;
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        this.dataInvestimento = dataInvestimento;
    }

    public abstract double calcularRendimento();

}
