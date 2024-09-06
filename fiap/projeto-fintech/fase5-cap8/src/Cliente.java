import java.util.HashMap;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private HashMap<String, Conta> contas;

    // Construtores
    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String email, String telefone, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.contas = new HashMap<>();
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Métodos
    public Conta abrirConta(String numero, double saldo) {
        Conta novaConta = new Conta(gerarNovoId(), numero, saldo, this);
        contas.put(numero, novaConta);
        return novaConta;
    }

    private int gerarNovoId() {
        return contas.size() + 1;
    }

    public Conta getContaPorNumero(String numero) {
        Conta conta = contas.get(numero);
        if (conta != null) {
            return conta;
        } else {
            System.out.println("Conta com número " + numero + " não encontrada.");
            return null;
        }
    }

    public void exibirCadastro() {
        System.out.println("========Visão Geral========");
        System.out.println("Id do Cliente: " + idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("E-Mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);

        if (contas.size() == 0) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("Contas associadas: ");
            for (String numero : contas.keySet()) {
                System.out.println("  Número - " + numero);
            }
        }
        System.out.println("===========================");
    }

}
