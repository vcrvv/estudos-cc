import java.util.ArrayList;

public class Conta extends Cliente {
    private int idConta;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Investimento> investimentos = new ArrayList<>();
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    private ArrayList<Divida> dividas = new ArrayList<>();


    // Construtores
    public Conta(int idConta, String numero, double saldo, Cliente cliente) {
        this.idConta = idConta;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Getters e Setters
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public ArrayList<Investimento> getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(ArrayList<Investimento> investimentos) {
        this.investimentos = investimentos;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public ArrayList<Divida> getDividas() {
        return dividas;
    }

    public void setDividas(ArrayList<Divida> dividas) {
        this.dividas = dividas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    // Métodos
    public void exibirConta() {
        // lógica do método
        System.out.println("Exibindo dados");
    }

    //transações

    //investimentos

    //dividas
}
