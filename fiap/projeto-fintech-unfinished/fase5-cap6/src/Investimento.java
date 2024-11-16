public class Investimento {
    private int numeroConta;
    private double saldo;
    private double juros;
    private int tempo;

    // Construtores
    public Investimento() {}

    public Investimento(int numeroConta, double saldo, double juros, int tempo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.juros = juros;
        this.tempo = tempo;
    }

    // Getters e Setters
    public int getNumeroConta() {return numeroConta;}
    public void setNumeroConta(int numeroConta) {this.numeroConta = numeroConta;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public double getJuros() {return juros;}
    public void setJuros(double juros) {this.juros = juros;}
    
    public int getTempo() {return tempo;}
    public void setTempo(int tempo) {this.tempo = tempo;}

    //  Métodos
    public void investimentoComJurosSimples() {
        // lógica
        System.out.println("Investimento cadastrado com sucesso!");
    }

    public void investimentoComJurosCompostos() {
        // lógica
        System.out.println("Investimento cadastrado com sucesso!");
    }

}
