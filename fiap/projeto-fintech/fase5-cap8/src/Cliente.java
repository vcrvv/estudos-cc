import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private List<Conta> contas = new ArrayList<>();

    Random random = new Random();

    // Construtores
    public Cliente() {}

    public Cliente(int idCliente, String nome, String email, String telefone, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    
    // Getters e Setters
    public int getIdCliente() {return idCliente;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente;} 

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    

    // Métodos
    public void exibirCadastro() {
        // lógica para o cadastro
        System.out.println("Informações da Conta: ");
    }

    public void atualizarCadastro() {
        // lógica
        System.out.println("Cadastro atualizado com sucesso!");
    }
}
