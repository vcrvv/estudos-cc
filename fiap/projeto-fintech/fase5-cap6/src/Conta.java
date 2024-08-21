public class Conta {
    private int numeroConta;
    private int idCliente;
    private double saldo;


    // Construtores
    public Conta() {}

    public Conta(int numeroConta, int idCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.idCliente = idCliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void exibirConta() {
        // lógica do método
        System.out.println("Exibindo dados");
    }
}
