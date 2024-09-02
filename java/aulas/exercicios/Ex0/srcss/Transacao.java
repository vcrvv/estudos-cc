import java.util.Date;

public abstract class Transacao {
    private int id;
    private String descricao;
    private double valor;
    private Date data;
    private Conta conta;

    public Transacao(int id, String descricao, double valor, Date data, Conta conta) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.conta = conta;
    }

    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // Métodos
    public abstract void executar();

    @Override
    public String toString() {
        return "Transacao id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", data=" + data;
    }
}
