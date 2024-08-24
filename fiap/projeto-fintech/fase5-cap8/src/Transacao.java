import java.util.Date;

public class Transacao {
    private double valor;      
    private String tipo;       
    private Date data;  
    private String descricao;
    private int contaId; 
    
    public Transacao (double valor, String tipo, Date data, String descricao) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Date getData() {return data;}
    public void setData(Date data) {this.data = data;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    // Métodos
    public void entrada() {
        // cadastrar entradas na conta
        System.out.println("Entrada cadastrada com sucesso!");
    }
    
    public void saida() {
        // cadastrar saidas na conta
        System.out.println("Saida cadastrada com sucesso!");
    }

    public String exibirDetalhesDaTransacao() {
        return String.format("ID: %d, Date: %s, Amount: %.2f, Description: %s", contaId, data.toString(), valor, descricao);
    }
}
