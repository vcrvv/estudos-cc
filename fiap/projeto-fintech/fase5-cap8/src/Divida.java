import java.time.LocalDate;

public class Divida {
    private int idDivida;
    private double valor;
    private double taxa;
    private LocalDate data;
    
    // Construtores
    public Divida(int idDivida, double valor, double taxa, LocalDate data) {
        this.idDivida = idDivida;
        this.valor = valor;
        this.taxa = taxa;
        this.data = data;
    }

    // Getters e Setters
    public int getIdDivida() {return idDivida;}
    public void setIdDivida(int idDivida) {this.idDivida = idDivida;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}

    public double getTaxa() {return taxa;}
    public void setTaxa(double taxa) {this.taxa = taxa;}

    public LocalDate getData() {return data;}
    public void setData(LocalDate data) {this.data = data;}

    
    // Métodos
    public void cadastrarDivida() {
        // lógica
        System.out.println("Divida cadastrada com sucesso!");
    }
    
}
