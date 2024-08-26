import java.util.Date;

public class Saida extends Transacao {

    public Saida(int id, String descricao, double valor, Date data, Conta conta) {
        super(id, descricao, valor, data, conta);
    }

    @Override
    public void executar() {
        // Logica para registrar a saída
    }
}
