import java.util.ArrayList;
public class Conta {
    private int idConta;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Investimento> investimentos;
    private ArrayList<Transacao> transacoes;
    private ArrayList<Divida> dividas;

    // Construtores
    public Conta() {}

    public Conta(int idConta, String numero, double saldo, Cliente cliente) {
        this.idConta = idConta;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.investimentos = new ArrayList<>();
        this.transacoes = new ArrayList<>();
        this.dividas = new ArrayList<>();
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

    // Métodos
    public void exibirSaldo() {
        // lógica do método
        System.out.println("Saldo: " + saldo);

    }

    // transações
    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
        transacao.aplicar(this);
    }

    public void exibirTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            System.out.println("Histórico de Transações:");
            for (Transacao transacao : transacoes) {
                System.out.println(transacao);
            }
        }
    }

    // investimentos
    public void exibirInvestimentos() {
        if (investimentos.isEmpty()) {
            System.out.println("Nenhum investimento registrado");
        } else {
            System.out.println("Histórico de investimentos:");
            for (Investimento investimento : investimentos) {
                System.out.println(investimento);
            }

        }
    }

    // dividas
    public void exibirDividas() {
        if (dividas.isEmpty()) {
            System.out.println("Nenhuma dívida registrada");
        } else {
            System.out.println("Historico");
        }
    }
}
