import java.util.Random;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String senha;
    private String confirmaSenha;

    Random random = new Random();

    // Construtores
    public Cliente() {}

    public Cliente (String nome, String email, String senha, String confirmaSenha) {
        this.idCliente = random.nextInt(1000, 9999);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
    
    // Métodos
    public boolean validaSenha(String senha, String confirmaSenha) {
        return senha.equals(confirmaSenha);
    }

    public void exibirCadastro() {
        // lógica para o cadastro
        System.out.println("Informações da Conta: ");
    }

    public void atualizarCadastro() {
        // lógica
        System.out.println("Cadastro atualizado com sucesso!");
    }
}
