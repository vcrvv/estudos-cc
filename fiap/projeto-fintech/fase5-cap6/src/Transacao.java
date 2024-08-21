public class Transacao {
    private double valor;
    private String metodo; // pode ser "débito", "crédito", "boleto" ou "dinheito"
    private String tipo; // pode ser "pagamento" ou "recebimento"
    private String titulo;
    private String descricao;
    private String data;
    private int idOutraConta; // quem vai "receber" ou "pagar"


    // Construtores
    public Transacao() {}

    public Transacao(double valor, String metodo, String tipo, String titulo, String descricao, String data, int idOutraConta) {
        this.valor = valor;
        this.metodo = metodo;
        this.tipo = tipo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.idOutraConta = idOutraConta;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdOutraConta() {
        return idOutraConta;
    }

    public void setIdOutraConta(int idOutraConta) {
        this.idOutraConta = idOutraConta;
    }

    // Métodos    
    public void exibirHistoricoDeTransacoes() {
        // lógica
        System.out.println("Exibindo histórico");
    }

    public void realizarRecebimento() {
        // lógica
        System.out.println("Recebimento cadastrado com sucesso!");
    }

    public void realizarPagamento() {
        //  lógica
        System.out.println("Pagamento cadastrado com sucesso!");
    }

}
