import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Transacao {
    private double valor;
    private String metodo;
    private String descricao;
    private LocalDateTime dataHora;

    // Construtores
    public Transacao(double valor, String metodo, String descricao) {
        this.valor = valor;
        this.metodo = metodo;
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos
    public abstract void aplicar(Conta conta);

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
        String dataFormatada = dataHora.format(formatter);

        return "Data/Hora: " + dataFormatada +
                ", Valor: " + valor +
                ", Método: " + metodo +
                ", Descrição: " + descricao;
    }
}

