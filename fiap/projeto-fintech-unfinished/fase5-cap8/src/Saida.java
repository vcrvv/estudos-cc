public class Saida extends Transacao {

    // Construtores
    public Saida(double valor, String metodo, String descricao) {
        super(valor, metodo, descricao);
    }

    @Override
    public void aplicar(Conta conta) {
        if (getValor() <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - getValor());
            System.out.println("Saída registrada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para a saída.");
        }
    }
}
