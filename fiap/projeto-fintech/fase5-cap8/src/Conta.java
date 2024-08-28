import java.util.List;
import java.util.ArrayList;


public class Conta extends Cliente {
    private Cliente cliente;
    private int idConta;
    private double saldo;
    private List<Investimento> investimentos = new ArrayList<>();
    private List<Transacao> transacoes = new ArrayList<>();
    private List<Divida> dividas = new ArrayList<>();


    // Construtores
    public Conta() {}

    public Conta(Cliente cliente, int idConta, double saldo) {
        this.cliente = cliente;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getIdConta() {return idConta;}
    public void setIdConta(int idConta) {this.idConta = idConta;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public List<Investimento> getInvestimentos() {return investimentos;}
    public void setInvestimentos(List<Investimento> investimentos) {this.investimentos = investimentos;}

    public List<Transacao> getTransacoes() {return transacoes;}
    public void setTransacoes(List<Transacao> transacoes) {this.transacoes = transacoes;}

    public List<Divida> getDividas() {return dividas;}
    public void setDividas(List<Divida> dividas) {this.dividas = dividas;}

    // Métodos
    public void exibirConta() {
        // lógica do método
        System.out.println("Exibindo dados");
    }

    

    
}
