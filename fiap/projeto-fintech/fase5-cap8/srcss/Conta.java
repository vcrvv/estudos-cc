import java.util.ArrayList;
import java.util.List;

public class Conta extends Cliente {
    private int idConta;
    private String numero;
    private double saldo;
    private Cliente cliente;
    private List<Transacao> transacoes = new ArrayList<>();


    // Getters e Setters
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }


    // Métodos
    public void adicionarTransacao(Transacao transacao) {
        //
        transacoes.add(transacao);
        transacao.executar();
        atualizarSaldo();
    }

    public void atualizarSaldo() {
        saldo = 0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof Entrada) {
                saldo += transacao.getValor();
            } else if (transacao instanceof Saida) {
                saldo -= transacao.getValor();
            }
        }
    }

    public void visualizarExtrato() {
        System.out.println("Extrato da Conta " + numero);
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }
    
}
