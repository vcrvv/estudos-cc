public class Entrada extends Transacao {

    // Construtores
        public Entrada(double valor, String metodo, String descricao) {
        super(valor, metodo, descricao);
    }

    @Override
    public void aplicar(Conta conta) {
        conta.setSaldo(conta.getSaldo() + getValor());
        System.out.println("Entrada registrada com sucesso!");
    }
}
