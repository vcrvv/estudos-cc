import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Conta> contas = new ArrayList<>();

    // Construtores
    public Cliente() {}

    public Cliente(int id, String nome, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


    // Métodos 
    public Conta abrirConta(String numero, double saldo) {
        Conta novaConta = new Conta(gerarNovoId(), numero, saldo, this);
        contas.add(novaConta);
        return novaConta;
    }

    private int gerarNovoId() {
        return contas.size() + 1;
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
    }

    public void visualizarExtrato() {
        for (Conta conta : contas) {
            conta.visualizarExtrato();
        }
    }

    public void visualizarCadastro() {
        System.out.println("=======Cliente=======");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("E-Mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
    }

}
