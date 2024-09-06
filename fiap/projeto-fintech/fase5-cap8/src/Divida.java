import java.time.LocalDate;

public class Divida {
    private int idDivida;
    private double valor;
    private double taxa;
    private String dataDeVencimento;
    private LocalDate dataAtual = LocalDate.now();

    // Construtores
    public Divida(int idDivida, double valor, double taxa, String dataDeVencimento) {
        this.idDivida = idDivida;
        this.valor = valor;
        this.taxa = taxa;
        this.dataDeVencimento = dataDeVencimento;
    }

    // Getters e Setters
    public int getIdDivida() {
        return idDivida;
    }

    public void setIdDivida(int idDivida) {
        this.idDivida = idDivida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }


    // Métodos
    public void cadastrarDivida() {
        // lógica
        System.out.println("Divida cadastrada com sucesso!");
    }

}
