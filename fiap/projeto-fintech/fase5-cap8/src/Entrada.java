import java.util.Date;

public class Entrada extends Transacao {

    public Entrada(int id, String descricao, double valor, Date data, Conta conta) {
        super(id, descricao, valor, data, conta);
    }

    @Override
    public void executar() {
        // Logica para registrar a entrada
    }
}
